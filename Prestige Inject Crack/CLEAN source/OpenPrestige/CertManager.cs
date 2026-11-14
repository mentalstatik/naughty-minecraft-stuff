using System;
using System.IO;
using System.Security.Cryptography.X509Certificates;

namespace OpenPrestige;

/// <summary>
/// SANITISED. The original imported the bundled CN=mitmproxy certificate into
/// StoreName.Root at StoreLocation.LocalMachine, and fell back to running
/// `certutil.exe -addstore -f Root` if the managed call failed. That made a
/// third party's CA (the stock mitmproxy CA, whose private key is public)
/// trusted machine-wide, which is what allowed api.prestigeclient.vip to be
/// answered locally. No store is written and no process is started any more.
/// </summary>
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
			bool alreadyTrusted = IsCertInStore(StoreLocation.LocalMachine, thumbprint) || IsCertInStore(StoreLocation.CurrentUser, thumbprint);
			log("[=] Dry run: CA '" + x509Certificate.Subject + "' (" + thumbprint + ") is " + (alreadyTrusted ? "already trusted on this machine" : "NOT trusted on this machine") + ". No certificate was imported.");
		}
		catch (Exception ex)
		{
			log(string.Format(Variables.LogCertError, ex.Message));
		}
		return false;
	}

	/// <summary>Read-only check, kept so the dry run can report current state.</summary>
	private static bool IsCertInStore(StoreLocation location, string thumbprint)
	{
		try
		{
			// X509Store only became IDisposable in .NET 4.6, so Close() explicitly.
			X509Store x509Store = new X509Store(StoreName.Root, location);
			x509Store.Open(OpenFlags.ReadOnly);
			try
			{
				X509Certificate2Collection x509Certificate2Collection = x509Store.Certificates.Find(X509FindType.FindByThumbprint, thumbprint, validOnly: false);
				return x509Certificate2Collection.Count > 0;
			}
			finally
			{
				x509Store.Close();
			}
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
