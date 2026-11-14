using System;
using System.Collections.Generic;
using System.Diagnostics;

namespace OpenPrestige;

/// <summary>
/// SANITISED. The original class performed remote DLL injection:
/// OpenProcess(PROCESS_ALL_ACCESS) -> VirtualAllocEx -> WriteProcessMemory(path)
/// -> GetProcAddress(kernel32!LoadLibraryA) -> CreateRemoteThread, after writing
/// the embedded prestige_offline.dll to disk. All of that has been removed;
/// the remaining methods only report what the original would have done.
/// </summary>
public static class ProcessInjector
{
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

	/// <summary>
	/// SANITISED. The original wrote the embedded prestige_offline.dll to the
	/// application directory, then to %LOCALAPPDATA%\OpenPrestige, then to %TEMP%,
	/// so it could be injected from disk. Nothing is written any more.
	/// </summary>
	public static string EnsureDllExtracted(Action<string> log)
	{
		log("[=] Dry run: the original wrote prestige_offline.dll to disk here. Skipped, nothing written.");
		return null;
	}

	/// <summary>
	/// SANITISED. The original injected prestige_offline.dll into the target
	/// process using CreateRemoteThread + LoadLibraryA. This now does nothing
	/// except log the request, and always reports failure.
	/// </summary>
	public static bool Inject(int pid, Action<string> log)
	{
		log("[=] Dry run: the original injected prestige_offline.dll into PID " + pid + " via CreateRemoteThread/LoadLibraryA. Skipped.");
		return false;
	}
}
