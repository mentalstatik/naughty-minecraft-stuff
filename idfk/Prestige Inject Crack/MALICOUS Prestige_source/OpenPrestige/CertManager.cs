using System;
using System.Diagnostics;
using System.IO;
using System.Security.Cryptography.X509Certificates;

namespace OpenPrestige;

public static class CertManager
{
	public static bool EnsureRootCaTrusted(Action<string> log)
	{
		try
		{
			byte[] certBytes = GetCertBytes();
			if (certBytes == null || certBytes.Length == 0)
			{
				log(Variables.LogCertMissing);
				return false;
			}
			X509Certificate2 x509Certificate = new X509Certificate2(certBytes);
			string thumbprint = x509Certificate.Thumbprint;
			if (IsCertInStore(StoreLocation.LocalMachine, thumbprint) || IsCertInStore(StoreLocation.CurrentUser, thumbprint))
			{
				log(Variables.LogCertTrusted);
				return true;
			}
			log(Variables.LogCertInstalling);
			try
			{
				using (X509Store x509Store = new X509Store(StoreName.Root, StoreLocation.LocalMachine))
				{
					x509Store.Open(OpenFlags.ReadWrite);
					x509Store.Add(x509Certificate);
					x509Store.Close();
				}
				log(Variables.LogCertInstalledDirect);
				return true;
			}
			catch (Exception ex)
			{
				log(string.Format(Variables.LogCertStoreFailed, ex.Message));
			}
			string text = Path.Combine(Path.GetTempPath(), "mitmproxy-ca-cert.cer");
			File.WriteAllBytes(text, certBytes);
			ProcessStartInfo processStartInfo = new ProcessStartInfo();
			processStartInfo.FileName = "certutil.exe";
			processStartInfo.Arguments = "-addstore -f Root \"" + text + "\"";
			processStartInfo.CreateNoWindow = true;
			processStartInfo.UseShellExecute = false;
			processStartInfo.RedirectStandardOutput = true;
			processStartInfo.RedirectStandardError = true;
			ProcessStartInfo startInfo = processStartInfo;
			using Process process = Process.Start(startInfo);
			process.WaitForExit(10000);
			if (process.ExitCode == 0)
			{
				log(Variables.LogCertInstalledUtil);
				return true;
			}
			log(string.Format(Variables.LogCertUtilFailed, process.ExitCode));
		}
		catch (Exception ex2)
		{
			log(string.Format(Variables.LogCertError, ex2.Message));
		}
		return false;
	}

	private static bool IsCertInStore(StoreLocation location, string thumbprint)
	{
		try
		{
			using X509Store x509Store = new X509Store(StoreName.Root, location);
			x509Store.Open(OpenFlags.ReadOnly);
			X509Certificate2Collection x509Certificate2Collection = x509Store.Certificates.Find(X509FindType.FindByThumbprint, thumbprint, validOnly: false);
			x509Store.Close();
			return x509Certificate2Collection.Count > 0;
		}
		catch
		{
			return false;
		}
	}

	public static byte[] GetCertBytes()
	{
		string path = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "mitmproxy-ca-cert.cer");
		if (File.Exists(path))
		{
			return File.ReadAllBytes(path);
		}
		return ResourceHelper.GetResourceBytes("mitmproxy-ca-cert.cer");
	}
}
