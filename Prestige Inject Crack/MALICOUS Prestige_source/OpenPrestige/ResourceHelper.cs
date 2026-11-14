using System;
using System.IO;
using System.Reflection;
using System.Text;

namespace OpenPrestige;

public static class ResourceHelper
{
	public static byte[] GetResourceBytes(string name)
	{
		using Stream stream = GetResourceStream(name);
		if (stream == null)
		{
			return null;
		}
		using MemoryStream memoryStream = new MemoryStream();
		stream.CopyTo(memoryStream);
		return memoryStream.ToArray();
	}

	public static Stream GetResourceStream(string name)
	{
		Assembly executingAssembly = Assembly.GetExecutingAssembly();
		string[] manifestResourceNames = executingAssembly.GetManifestResourceNames();
		string[] array = manifestResourceNames;
		foreach (string text in array)
		{
			if (text.Equals(name, StringComparison.OrdinalIgnoreCase) || text.EndsWith("." + name, StringComparison.OrdinalIgnoreCase) || text.EndsWith(name, StringComparison.OrdinalIgnoreCase))
			{
				return executingAssembly.GetManifestResourceStream(text);
			}
		}
		return null;
	}

	public static string GetResourceString(string name)
	{
		byte[] resourceBytes = GetResourceBytes(name);
		if (resourceBytes == null)
		{
			return null;
		}
		return Encoding.UTF8.GetString(resourceBytes);
	}

	public static bool ExtractResourceToFile(string name, string outputPath)
	{
		try
		{
			using Stream stream = GetResourceStream(name);
			if (stream == null)
			{
				return false;
			}
			string directoryName = Path.GetDirectoryName(outputPath);
			if (!string.IsNullOrEmpty(directoryName) && !Directory.Exists(directoryName))
			{
				Directory.CreateDirectory(directoryName);
			}
			using (FileStream destination = new FileStream(outputPath, FileMode.Create, FileAccess.Write, FileShare.None))
			{
				stream.CopyTo(destination);
			}
			return true;
		}
		catch
		{
			return false;
		}
	}
}
