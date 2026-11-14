using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.Runtime.InteropServices;
using System.Text;

namespace OpenPrestige;

public static class ProcessInjector
{
	private const uint PROCESS_ALL_ACCESS = 2035711u;

	private const uint MEM_COMMIT = 4096u;

	private const uint MEM_RESERVE = 8192u;

	private const uint PAGE_EXECUTE_READWRITE = 64u;

	[DllImport("kernel32.dll", SetLastError = true)]
	private static extern IntPtr OpenProcess(uint dwDesiredAccess, bool bInheritHandle, int dwProcessId);

	[DllImport("kernel32.dll", SetLastError = true)]
	private static extern IntPtr VirtualAllocEx(IntPtr hProcess, IntPtr lpAddress, int dwSize, uint flAllocationType, uint flProtect);

	[DllImport("kernel32.dll", SetLastError = true)]
	private static extern bool WriteProcessMemory(IntPtr hProcess, IntPtr lpBaseAddress, byte[] lpBuffer, int nSize, out IntPtr lpNumberOfBytesWritten);

	[DllImport("kernel32.dll", SetLastError = true)]
	private static extern IntPtr CreateRemoteThread(IntPtr hProcess, IntPtr lpThreadAttributes, uint dwStackSize, IntPtr lpStartAddress, IntPtr lpParameter, uint dwCreationFlags, out uint lpThreadId);

	[DllImport("kernel32.dll", SetLastError = true)]
	private static extern uint WaitForSingleObject(IntPtr hHandle, uint dwMilliseconds);

	[DllImport("kernel32.dll", SetLastError = true)]
	private static extern bool CloseHandle(IntPtr hObject);

	[DllImport("kernel32.dll", CharSet = CharSet.Ansi, SetLastError = true)]
	private static extern IntPtr GetModuleHandleA(string lpModuleName);

	[DllImport("kernel32.dll", CharSet = CharSet.Ansi, SetLastError = true)]
	private static extern IntPtr GetProcAddress(IntPtr hModule, string lpProcName);

	public static List<ProcessItem> GetRunningJavaProcesses(bool allProcesses = false)
	{
		List<ProcessItem> list = new List<ProcessItem>();
		try
		{
			Process[] processes = Process.GetProcesses();
			Process[] array = processes;
			foreach (Process process in array)
			{
				try
				{
					string text = process.ProcessName.ToLowerInvariant();
					if (allProcesses || text.Contains("javaw") || text.Contains("java"))
					{
						list.Add(new ProcessItem
						{
							Pid = process.Id,
							ProcessName = process.ProcessName,
							Title = process.MainWindowTitle
						});
					}
				}
				catch
				{
				}
			}
		}
		catch
		{
		}
		list.Sort(delegate(ProcessItem a, ProcessItem b)
		{
			bool flag = a.ProcessName.IndexOf("javaw", StringComparison.OrdinalIgnoreCase) >= 0;
			bool flag2 = b.ProcessName.IndexOf("javaw", StringComparison.OrdinalIgnoreCase) >= 0;
			if (flag && !flag2)
			{
				return -1;
			}
			return (!flag && flag2) ? 1 : b.Pid.CompareTo(a.Pid);
		});
		return list;
	}

	public static string EnsureDllExtracted(Action<string> log)
	{
		string text = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "prestige_offline.dll");
		if (File.Exists(text) && new FileInfo(text).Length > 1000000)
		{
			return Path.GetFullPath(text);
		}
		string path = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "OpenPrestige");
		string text2 = Path.Combine(path, "prestige_offline.dll");
		if (File.Exists(text2) && new FileInfo(text2).Length > 1000000)
		{
			return Path.GetFullPath(text2);
		}
		try
		{
			log(Variables.LogDllUnpacking);
			if (ResourceHelper.ExtractResourceToFile("prestige_offline.dll", text2))
			{
				log(string.Format(Variables.LogDllUnpacked, new FileInfo(text2).Length));
				return Path.GetFullPath(text2);
			}
		}
		catch (Exception ex)
		{
			log(string.Format(Variables.LogDllExtractError, ex.Message));
		}
		string text3 = Path.Combine(Path.GetTempPath(), "prestige_offline.dll");
		try
		{
			if (ResourceHelper.ExtractResourceToFile("prestige_offline.dll", text3))
			{
				return Path.GetFullPath(text3);
			}
		}
		catch (Exception ex2)
		{
			log(string.Format(Variables.LogDllExtractError, ex2.Message));
		}
		return null;
	}

	public static bool Inject(int pid, Action<string> log)
	{
		string text = EnsureDllExtracted(log);
		if (string.IsNullOrEmpty(text) || !File.Exists(text))
		{
			log(Variables.LogDllMissing);
			return false;
		}
		log(string.Format(Variables.LogInjecting, pid, text));
		IntPtr intPtr = OpenProcess(2035711u, bInheritHandle: false, pid);
		if (intPtr == IntPtr.Zero)
		{
			int lastWin32Error = Marshal.GetLastWin32Error();
			log(string.Format(Variables.LogOpenProcessFailed, lastWin32Error));
			return false;
		}
		try
		{
			byte[] bytes = Encoding.ASCII.GetBytes(text + "\0");
			IntPtr intPtr2 = VirtualAllocEx(intPtr, IntPtr.Zero, bytes.Length, 12288u, 64u);
			if (intPtr2 == IntPtr.Zero)
			{
				int lastWin32Error2 = Marshal.GetLastWin32Error();
				log(string.Format(Variables.LogVirtualAllocFailed, lastWin32Error2));
				return false;
			}
			if (!WriteProcessMemory(intPtr, intPtr2, bytes, bytes.Length, out var _))
			{
				int lastWin32Error3 = Marshal.GetLastWin32Error();
				log(string.Format(Variables.LogWriteMemFailed, lastWin32Error3));
				return false;
			}
			IntPtr moduleHandleA = GetModuleHandleA("kernel32.dll");
			if (moduleHandleA == IntPtr.Zero)
			{
				log(Variables.LogGetModuleFailed);
				return false;
			}
			IntPtr procAddress = GetProcAddress(moduleHandleA, "LoadLibraryA");
			if (procAddress == IntPtr.Zero)
			{
				log(Variables.LogGetProcFailed);
				return false;
			}
			uint lpThreadId = 0u;
			IntPtr intPtr3 = CreateRemoteThread(intPtr, IntPtr.Zero, 0u, procAddress, intPtr2, 0u, out lpThreadId);
			if (intPtr3 == IntPtr.Zero)
			{
				int lastWin32Error4 = Marshal.GetLastWin32Error();
				log(string.Format(Variables.LogRemoteThreadFailed, lastWin32Error4));
				return false;
			}
			log(string.Format(Variables.LogRemoteThreadCreated, lpThreadId));
			WaitForSingleObject(intPtr3, 10000u);
			CloseHandle(intPtr3);
			log(Variables.LogInjectSuccess);
			return true;
		}
		finally
		{
			CloseHandle(intPtr);
		}
	}
}
