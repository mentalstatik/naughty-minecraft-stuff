using System;
using System.Runtime.InteropServices;
using System.Threading;
using System.Windows.Forms;

namespace OpenPrestige;

internal static class Program
{
	private static Mutex _singleInstanceMutex;

	[DllImport("user32.dll")]
	private static extern bool SetProcessDPIAware();

	[STAThread]
	private static void Main()
	{
		//IL_002d: Unknown result type (might be due to invalid IL or missing references)
		//IL_008f: Unknown result type (might be due to invalid IL or missing references)
		try
		{
			SetProcessDPIAware();
		}
		catch
		{
		}
		_singleInstanceMutex = new Mutex(initiallyOwned: true, "OpenPrestige_SingleInstance_Mutex", out var createdNew);
		if (!createdNew)
		{
			MessageBox.Show(Variables.SingleInstanceBody, Variables.SingleInstanceTitle, (MessageBoxButtons)0, (MessageBoxIcon)64);
			return;
		}
		Application.EnableVisualStyles();
		Application.SetCompatibleTextRenderingDefault(false);
		Application.ThreadException += delegate(object s, ThreadExceptionEventArgs e)
		{
			//IL_002d: Unknown result type (might be due to invalid IL or missing references)
			MessageBox.Show("Unhandled error: " + e.Exception.Message + "\n\n" + e.Exception.StackTrace, "OpenPrestige Error", (MessageBoxButtons)0, (MessageBoxIcon)16);
		};
		AppDomain.CurrentDomain.UnhandledException += delegate(object s, UnhandledExceptionEventArgs e)
		{
			//IL_0036: Unknown result type (might be due to invalid IL or missing references)
			string text = ((e.ExceptionObject is Exception ex) ? (ex.Message + "\n\n" + ex.StackTrace) : "Unknown unhandled error.");
			MessageBox.Show(text, "OpenPrestige Fatal Error", (MessageBoxButtons)0, (MessageBoxIcon)16);
		};
		SplashScreen splashScreen = new SplashScreen();
		try
		{
			((Form)splashScreen).ShowDialog();
		}
		finally
		{
			((IDisposable)splashScreen)?.Dispose();
		}
		Application.Run((Form)(object)new MainForm());
		GC.KeepAlive(_singleInstanceMutex);
	}
}
