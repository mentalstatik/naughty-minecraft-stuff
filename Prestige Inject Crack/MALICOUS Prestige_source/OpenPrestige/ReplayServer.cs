using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.IO;
using System.IO.Compression;
using System.Net;
using System.Net.Security;
using System.Net.Sockets;
using System.Security.Authentication;
using System.Security.Cryptography.X509Certificates;
using System.Text;
using System.Threading;

namespace OpenPrestige;

public class ReplayServer
{
	private class HttpRequest
	{
		public string Method { get; set; }

		public string Path { get; set; }

		public Dictionary<string, string> Headers { get; set; }

		public byte[] Body { get; set; }
	}

	private TcpListener _listener;

	private Thread _listenThread;

	private volatile bool _isRunning;

	private readonly int _port;

	private readonly Action<string> _logger;

	private X509Certificate2 _certificate;

	private readonly Dictionary<string, FlowResponse> _table = new Dictionary<string, FlowResponse>(StringComparer.OrdinalIgnoreCase);

	private readonly Dictionary<int, FlowResponse> _cfgDataVerbatim = new Dictionary<int, FlowResponse>();

	private FlowResponse _cfgDataFallback;

	private Dictionary<string, object> _listTemplate = new Dictionary<string, object>
	{
		{ "data", "{}" },
		{ "maxPages", "1" },
		{ "challenge", "" },
		{ "id", "" }
	};

	private string _dataChallenge = "";

	private Dictionary<string, object> _seedIndex = new Dictionary<string, object>();

	private Dictionary<string, object> _seedData = new Dictionary<string, object>();

	private Dictionary<string, object> _index = new Dictionary<string, object>();

	private Dictionary<string, object> _data = new Dictionary<string, object>();

	private string _cfgDir;

	private string _indexF;

	private string _dataF;

	private int _ownerUid = 15355;

	private string _ownerUser = "vm3q";

	private int _tier = 2;

	private static readonly HashSet<string> DropHeaders = new HashSet<string>(StringComparer.OrdinalIgnoreCase) { "transfer-encoding", "connection", "content-length", "date", "server", "cf-ray", "cf-cache-status", "nel", "report-to", "alt-svc" };

	private static readonly HashSet<string> ConfigEndpoints = new HashSet<string>(StringComparer.OrdinalIgnoreCase) { "/modGetConfigListNew", "/modGetConfigData", "/modCreateConfig", "/modEditConfig", "/modDeleteConfig" };

	public bool IsRunning => _isRunning;

	public int Port => _port;

	public ReplayServer(int port, Action<string> logger)
	{
		_port = port;
		_logger = logger;
		InitializeStoragePaths();
		LoadCertificate();
		LoadFlows();
		InitializeConfigStore();
	}

	private void InitializeStoragePaths()
	{
		_cfgDir = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "config_store");
		try
		{
			if (!Directory.Exists(_cfgDir))
			{
				Directory.CreateDirectory(_cfgDir);
			}
		}
		catch
		{
			_cfgDir = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "OpenPrestige", "config_store");
			if (!Directory.Exists(_cfgDir))
			{
				Directory.CreateDirectory(_cfgDir);
			}
		}
		_indexF = Path.Combine(_cfgDir, "index.json");
		_dataF = Path.Combine(_cfgDir, "data.json");
	}

	private void LoadCertificate()
	{
		try
		{
			byte[] array = null;
			string path = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "crl", "server.pfx");
			array = ((!File.Exists(path)) ? ResourceHelper.GetResourceBytes("server.pfx") : File.ReadAllBytes(path));
			if (array != null && array.Length > 0)
			{
				_certificate = new X509Certificate2(array, "", X509KeyStorageFlags.Exportable | X509KeyStorageFlags.PersistKeySet);
				_logger(string.Format(Variables.LogCertLoaded, _certificate.Subject));
			}
			else
			{
				_logger(Variables.LogCertLoadMissing);
			}
		}
		catch (Exception ex)
		{
			_logger(string.Format(Variables.LogCertLoadError, ex.Message));
		}
	}

	private void LoadFlows()
	{
		string text = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "flows");
		if (Directory.Exists(text))
		{
			LoadFlowsFromDirectory(text);
		}
		else
		{
			LoadFlowsFromZip();
		}
		_logger(string.Format(Variables.LogFlowsLoaded, _table.Count));
	}

	private void LoadFlowsFromDirectory(string flowsDir)
	{
		string[] directories = Directory.GetDirectories(flowsDir);
		Array.Sort(directories);
		string[] array = directories;
		foreach (string text in array)
		{
			string fileName = Path.GetFileName(text);
			string path = Path.Combine(text, "request.txt");
			string path2 = Path.Combine(text, "response.txt");
			string path3 = Path.Combine(text, "response.body.bin");
			string path4 = Path.Combine(text, "request.body.bin");
			if (File.Exists(path) && File.Exists(path2))
			{
				string reqTxt = File.ReadAllText(path, Encoding.UTF8);
				string resTxt = File.ReadAllText(path2, Encoding.UTF8);
				byte[] resBody = (File.Exists(path3) ? File.ReadAllBytes(path3) : new byte[0]);
				byte[] reqBody = (File.Exists(path4) ? File.ReadAllBytes(path4) : new byte[0]);
				ProcessFlowEntry(fileName, reqTxt, resTxt, reqBody, resBody);
			}
		}
	}

	private void LoadFlowsFromZip()
	{
		byte[] array = ResourceHelper.GetResourceBytes("flows.zip");
		if (array == null || array.Length == 0)
		{
			string path = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "flows.zip");
			if (File.Exists(path))
			{
				array = File.ReadAllBytes(path);
			}
		}
		if (array == null || array.Length == 0)
		{
			_logger(Variables.LogFlowsZipMissing);
			return;
		}
		try
		{
			using MemoryStream stream = new MemoryStream(array);
			using ZipArchive zipArchive = new ZipArchive(stream, ZipArchiveMode.Read);
			Dictionary<string, Dictionary<string, byte[]>> dictionary = new Dictionary<string, Dictionary<string, byte[]>>();
			foreach (ZipArchiveEntry entry in zipArchive.Entries)
			{
				string text = entry.FullName.Replace('\\', '/');
				int num = text.IndexOf('/');
				if (num < 0)
				{
					continue;
				}
				string key = text.Substring(0, num);
				string key2 = text.Substring(num + 1);
				if (!dictionary.ContainsKey(key))
				{
					dictionary[key] = new Dictionary<string, byte[]>(StringComparer.OrdinalIgnoreCase);
				}
				using Stream stream2 = entry.Open();
				using MemoryStream memoryStream = new MemoryStream();
				stream2.CopyTo(memoryStream);
				dictionary[key][key2] = memoryStream.ToArray();
			}
			List<string> list = new List<string>(dictionary.Keys);
			list.Sort();
			foreach (string item in list)
			{
				Dictionary<string, byte[]> dictionary2 = dictionary[item];
				if (dictionary2.ContainsKey("request.txt") && dictionary2.ContainsKey("response.txt"))
				{
					string @string = Encoding.UTF8.GetString(dictionary2["request.txt"]);
					string string2 = Encoding.UTF8.GetString(dictionary2["response.txt"]);
					byte[] reqBody = (dictionary2.ContainsKey("request.body.bin") ? dictionary2["request.body.bin"] : new byte[0]);
					byte[] resBody = (dictionary2.ContainsKey("response.body.bin") ? dictionary2["response.body.bin"] : new byte[0]);
					ProcessFlowEntry(item, @string, string2, reqBody, resBody);
				}
			}
		}
		catch (Exception ex)
		{
			_logger(string.Format(Variables.LogFlowsZipError, ex.Message));
		}
	}

	private void ProcessFlowEntry(string name, string reqTxt, string resTxt, byte[] reqBody, byte[] resBody)
	{
		string text = ExtractPath(reqTxt);
		int statusCode;
		List<KeyValuePair<string, string>> headers = ExtractHeaders(resTxt, out statusCode);
		FlowResponse flowResponse = new FlowResponse(statusCode, headers, resBody);
		if (name.IndexOf("modGetConfigData", StringComparison.OrdinalIgnoreCase) >= 0)
		{
			string @string = Encoding.UTF8.GetString(reqBody);
			int? num = SimpleJson.ExtractId(@string);
			if (num.HasValue)
			{
				_cfgDataVerbatim[num.Value] = flowResponse;
				try
				{
					string string2 = Encoding.UTF8.GetString(resBody);
					Dictionary<string, object> dictionary = SimpleJson.DeserializeObject(string2);
					if (dictionary != null)
					{
						if (dictionary.ContainsKey("data") && dictionary["data"] != null)
						{
							_seedData[num.Value.ToString()] = dictionary["data"];
						}
						if (dictionary.ContainsKey("challenge") && dictionary["challenge"] != null)
						{
							_dataChallenge = dictionary["challenge"].ToString();
						}
					}
				}
				catch
				{
				}
			}
			if (_cfgDataFallback == null)
			{
				_cfgDataFallback = flowResponse;
			}
			return;
		}
		if (text.Equals("/modGetConfigListNew", StringComparison.OrdinalIgnoreCase))
		{
			_table[text] = flowResponse;
			try
			{
				string string3 = Encoding.UTF8.GetString(resBody);
				Dictionary<string, object> dictionary2 = SimpleJson.DeserializeObject(string3);
				if (dictionary2 == null)
				{
					return;
				}
				_listTemplate = new Dictionary<string, object>(dictionary2);
				if (dictionary2.ContainsKey("data") && dictionary2["data"] != null)
				{
					Dictionary<string, object> dictionary3 = SimpleJson.DeserializeObject(dictionary2["data"].ToString());
					if (dictionary3 != null)
					{
						_seedIndex = dictionary3;
					}
				}
				return;
			}
			catch
			{
				return;
			}
		}
		_table[text] = flowResponse;
	}

	private string ExtractPath(string requestText)
	{
		using StringReader stringReader = new StringReader(requestText);
		string text = stringReader.ReadLine() ?? "";
		string[] array = text.Split(new char[1] { ' ' });
		string text2 = ((array.Length > 1) ? array[1].Trim() : text.Trim());
		string text3 = text2;
		if (text2.Contains("://"))
		{
			int startIndex = text2.IndexOf("://") + 3;
			int num = text2.IndexOf('/', startIndex);
			text3 = ((num >= 0) ? text2.Substring(num) : "/");
		}
		int num2 = text3.IndexOf('?');
		if (num2 >= 0)
		{
			text3 = text3.Substring(0, num2);
		}
		return text3;
	}

	private List<KeyValuePair<string, string>> ExtractHeaders(string responseText, out int statusCode)
	{
		statusCode = 200;
		List<KeyValuePair<string, string>> list = new List<KeyValuePair<string, string>>();
		using StringReader stringReader = new StringReader(responseText);
		string text = stringReader.ReadLine() ?? "";
		string[] array = text.Split(new char[1] { ' ' });
		if (array.Length > 1)
		{
			int.TryParse(array[1], out statusCode);
		}
		string text2;
		while ((text2 = stringReader.ReadLine()) != null)
		{
			int num = text2.IndexOf(':');
			if (num > 0)
			{
				string text3 = text2.Substring(0, num).Trim();
				string value = text2.Substring(num + 1).Trim();
				if (!DropHeaders.Contains(text3))
				{
					list.Add(new KeyValuePair<string, string>(text3, value));
				}
			}
		}
		return list;
	}

	private void InitializeConfigStore()
	{
		if (File.Exists(_indexF) && File.Exists(_dataF))
		{
			try
			{
				string json = File.ReadAllText(_indexF, Encoding.UTF8);
				string json2 = File.ReadAllText(_dataF, Encoding.UTF8);
				_index = SimpleJson.DeserializeObject(json) ?? new Dictionary<string, object>(_seedIndex);
				_data = SimpleJson.DeserializeObject(json2) ?? new Dictionary<string, object>(_seedData);
			}
			catch
			{
				_index = new Dictionary<string, object>(_seedIndex);
				_data = new Dictionary<string, object>(_seedData);
				SaveStore();
			}
		}
		else
		{
			string resourceString = ResourceHelper.GetResourceString("index.json");
			string resourceString2 = ResourceHelper.GetResourceString("data.json");
			if (!string.IsNullOrEmpty(resourceString))
			{
				_index = SimpleJson.DeserializeObject(resourceString) ?? new Dictionary<string, object>(_seedIndex);
			}
			else
			{
				_index = new Dictionary<string, object>(_seedIndex);
			}
			if (!string.IsNullOrEmpty(resourceString2))
			{
				_data = SimpleJson.DeserializeObject(resourceString2) ?? new Dictionary<string, object>(_seedData);
			}
			else
			{
				_data = new Dictionary<string, object>(_seedData);
			}
			SaveStore();
		}
		foreach (KeyValuePair<string, object> item in _index)
		{
			if (item.Value is List<object>)
			{
				List<object> list = (List<object>)item.Value;
				if (list.Count > 7)
				{
					int.TryParse(list[2].ToString(), out _ownerUid);
					_ownerUser = list[3].ToString();
					int.TryParse(list[7].ToString(), out _tier);
					break;
				}
			}
		}
	}

	private void SaveStore()
	{
		try
		{
			File.WriteAllText(_indexF, SimpleJson.Serialize(_index), Encoding.UTF8);
			File.WriteAllText(_dataF, SimpleJson.Serialize(_data), Encoding.UTF8);
		}
		catch (Exception ex)
		{
			_logger(string.Format(Variables.LogConfigSaveError, ex.Message));
		}
	}

	private string GenerateNewId()
	{
		Random random = new Random();
		string text;
		do
		{
			text = random.Next(1000, 99999).ToString();
		}
		while (_index.ContainsKey(text));
		return text;
	}

	private FlowResponse HandleConfig(string path, byte[] reqBody)
	{
		string text = DateTime.Now.ToString("yyyy-MM-ddTHH:mm:ss");
		string @string = Encoding.UTF8.GetString(reqBody);
		if (path.Equals("/modGetConfigListNew", StringComparison.OrdinalIgnoreCase))
		{
			Dictionary<string, object> dictionary = new Dictionary<string, object>(_listTemplate);
			dictionary["data"] = SimpleJson.Serialize(_index);
			byte[] bytes = Encoding.UTF8.GetBytes(SimpleJson.Serialize(dictionary));
			List<KeyValuePair<string, string>> list = new List<KeyValuePair<string, string>>();
			list.Add(new KeyValuePair<string, string>("Content-Type", "application/json"));
			List<KeyValuePair<string, string>> headers = list;
			return new FlowResponse(200, headers, bytes);
		}
		if (path.Equals("/modGetConfigData", StringComparison.OrdinalIgnoreCase))
		{
			int? num = SimpleJson.ExtractId(@string);
			if (num.HasValue)
			{
				string key = num.Value.ToString();
				if (_data.ContainsKey(key) && (!_cfgDataVerbatim.ContainsKey(num.Value) || !_seedData.ContainsKey(key) || _data[key].ToString() != _seedData[key].ToString()))
				{
					Dictionary<string, object> dictionary2 = new Dictionary<string, object>();
					dictionary2.Add("data", _data[key]);
					dictionary2.Add("challenge", _dataChallenge);
					Dictionary<string, object> obj = dictionary2;
					byte[] bytes2 = Encoding.UTF8.GetBytes(SimpleJson.Serialize(obj));
					List<KeyValuePair<string, string>> list2 = new List<KeyValuePair<string, string>>();
					list2.Add(new KeyValuePair<string, string>("Content-Type", "application/json"));
					List<KeyValuePair<string, string>> headers2 = list2;
					return new FlowResponse(200, headers2, bytes2);
				}
				if (_cfgDataVerbatim.ContainsKey(num.Value))
				{
					return _cfgDataVerbatim[num.Value];
				}
			}
			return _cfgDataFallback;
		}
		if (path.Equals("/modCreateConfig", StringComparison.OrdinalIgnoreCase))
		{
			Dictionary<string, object> dictionary3 = SimpleJson.DeserializeObject(@string) ?? new Dictionary<string, object>();
			string text2 = GenerateNewId();
			string text3 = (dictionary3.ContainsKey("name") ? dictionary3["name"].ToString() : "config");
			string item = (dictionary3.ContainsKey("desc") ? dictionary3["desc"].ToString() : "");
			string item2 = (dictionary3.ContainsKey("tags") ? dictionary3["tags"].ToString() : "[]");
			string value = (dictionary3.ContainsKey("data") ? dictionary3["data"].ToString() : "{}");
			_index[text2] = new List<object> { text3, item, _ownerUid, _ownerUser, 0, text, item2, _tier };
			_data[text2] = value;
			SaveStore();
			_logger(string.Format(Variables.LogConfigCreated, text2, text3, _index.Count));
			if (!_table.TryGetValue(path, out var value2))
			{
				return new FlowResponse(200, null, new byte[0]);
			}
			return value2;
		}
		if (path.Equals("/modEditConfig", StringComparison.OrdinalIgnoreCase))
		{
			Dictionary<string, object> dictionary4 = SimpleJson.DeserializeObject(@string) ?? new Dictionary<string, object>();
			if (dictionary4.ContainsKey("id") && dictionary4["id"] != null)
			{
				string text4 = dictionary4["id"].ToString();
				if (_index.ContainsKey(text4))
				{
					if (dictionary4.ContainsKey("data"))
					{
						_data[text4] = dictionary4["data"];
					}
					if (_index[text4] is List<object>)
					{
						List<object> list3 = (List<object>)_index[text4];
						if (dictionary4.ContainsKey("name") && !string.IsNullOrEmpty(dictionary4["name"].ToString()))
						{
							list3[0] = dictionary4["name"];
						}
						if (dictionary4.ContainsKey("desc") && !string.IsNullOrEmpty(dictionary4["desc"].ToString()))
						{
							list3[1] = dictionary4["desc"];
						}
						if (list3.Count > 5)
						{
							list3[5] = text;
						}
					}
					SaveStore();
					_logger(string.Format(Variables.LogConfigEdited, text4));
				}
			}
			if (!_table.TryGetValue(path, out var value3))
			{
				return new FlowResponse(200, null, new byte[0]);
			}
			return value3;
		}
		if (path.Equals("/modDeleteConfig", StringComparison.OrdinalIgnoreCase))
		{
			int? num2 = SimpleJson.ExtractId(@string);
			if (num2.HasValue)
			{
				string text5 = num2.Value.ToString();
				_index.Remove(text5);
				_data.Remove(text5);
				SaveStore();
				_logger(string.Format(Variables.LogConfigDeleted, text5, _index.Count));
			}
			if (!_table.TryGetValue(path, out var value4))
			{
				return new FlowResponse(200, null, new byte[0]);
			}
			return value4;
		}
		return null;
	}

	public void Start()
	{
		if (_isRunning)
		{
			return;
		}
		if (_certificate == null)
		{
			_logger(Variables.LogReplayNoCert);
			return;
		}
		try
		{
			_listener = new TcpListener(IPAddress.Loopback, _port);
			_listener.Start();
			_isRunning = true;
			_listenThread = new Thread(ListenLoop)
			{
				IsBackground = true,
				Name = "ReplayServerWorker"
			};
			_listenThread.Start();
			_logger(string.Format(Variables.LogReplayListening, _port));
		}
		catch (Exception ex)
		{
			_isRunning = false;
			_logger(string.Format(Variables.LogReplayStartFailed, _port, ex.Message));
		}
	}

	public void Stop()
	{
		if (!_isRunning)
		{
			return;
		}
		_isRunning = false;
		try
		{
			if (_listener != null)
			{
				_listener.Stop();
			}
		}
		catch
		{
		}
		_logger(Variables.LogReplayStopped);
	}

	private void ListenLoop()
	{
		while (_isRunning)
		{
			try
			{
				TcpClient state = _listener.AcceptTcpClient();
				ThreadPool.QueueUserWorkItem(HandleSslClient, state);
			}
			catch (SocketException)
			{
				if (!_isRunning)
				{
					break;
				}
			}
			catch (Exception ex2)
			{
				if (!_isRunning)
				{
					break;
				}
				_logger(string.Format(Variables.LogReplayAcceptError, ex2.Message));
			}
		}
	}

	private void HandleSslClient(object state)
	{
		TcpClient tcpClient = (TcpClient)state;
		using (tcpClient)
		{
			SslStream sslStream = null;
			try
			{
				sslStream = new SslStream(tcpClient.GetStream(), leaveInnerStreamOpen: false);
				sslStream.ReadTimeout = 15000;
				sslStream.WriteTimeout = 15000;
				sslStream.AuthenticateAsServer(_certificate, clientCertificateRequired: false, SslProtocols.Tls | SslProtocols.Tls11 | SslProtocols.Tls12, checkCertificateRevocation: false);
				while (_isRunning && tcpClient.Connected)
				{
					HttpRequest httpRequest = ReadHttpRequest(sslStream);
					if (httpRequest == null)
					{
						break;
					}
					Stopwatch stopwatch = Stopwatch.StartNew();
					FlowResponse value = null;
					if (httpRequest.Path.Equals("/__shutdown", StringComparison.OrdinalIgnoreCase))
					{
						_logger(Variables.LogShutdownSignal);
						SendResponse(sslStream, new FlowResponse(200, null, Encoding.ASCII.GetBytes("Shutting down...")));
						ThreadPool.QueueUserWorkItem(delegate
						{
							Thread.Sleep(300);
							Environment.Exit(0);
						});
						continue;
					}
					if (ConfigEndpoints.Contains(httpRequest.Path))
					{
						try
						{
							value = HandleConfig(httpRequest.Path, httpRequest.Body);
						}
						catch (Exception ex)
						{
							_logger(string.Format(Variables.LogConfigError, httpRequest.Path, ex.Message));
							_table.TryGetValue(httpRequest.Path, out value);
						}
					}
					else
					{
						_table.TryGetValue(httpRequest.Path, out value);
					}
					if (value == null)
					{
						_logger(string.Format(Variables.LogRouteMiss, httpRequest.Method, httpRequest.Path, httpRequest.Body.Length));
						SendNotFound(sslStream);
						continue;
					}
					SendResponse(sslStream, value);
					stopwatch.Stop();
					string text = (ConfigEndpoints.Contains(httpRequest.Path) ? "[CFG]" : "[SERVE]");
					_logger(string.Format(Variables.LogRouteServed, text, httpRequest.Method, httpRequest.Path, value.Status, value.Body.Length, stopwatch.ElapsedMilliseconds));
				}
			}
			catch (Exception)
			{
			}
			finally
			{
				if (sslStream != null)
				{
					try
					{
						sslStream.Close();
					}
					catch
					{
					}
				}
			}
		}
	}

	private HttpRequest ReadHttpRequest(Stream stream)
	{
		string text = ReadLine(stream);
		if (string.IsNullOrEmpty(text))
		{
			return null;
		}
		string[] array = text.Split(new char[1] { ' ' });
		if (array.Length < 2)
		{
			return null;
		}
		string method = array[0];
		string text2 = array[1];
		int num = text2.IndexOf('?');
		if (num >= 0)
		{
			text2 = text2.Substring(0, num);
		}
		Dictionary<string, string> dictionary = new Dictionary<string, string>(StringComparer.OrdinalIgnoreCase);
		int result = 0;
		string text3;
		while (!string.IsNullOrEmpty(text3 = ReadLine(stream)))
		{
			int num2 = text3.IndexOf(':');
			if (num2 > 0)
			{
				string text4 = text3.Substring(0, num2).Trim();
				string s = (dictionary[text4] = text3.Substring(num2 + 1).Trim());
				if (text4.Equals("Content-Length", StringComparison.OrdinalIgnoreCase))
				{
					int.TryParse(s, out result);
				}
			}
		}
		byte[] array2 = new byte[result];
		if (result > 0)
		{
			int num3;
			for (int i = 0; i < result; i += num3)
			{
				num3 = stream.Read(array2, i, result - i);
				if (num3 <= 0)
				{
					break;
				}
			}
		}
		HttpRequest httpRequest = new HttpRequest();
		httpRequest.Method = method;
		httpRequest.Path = text2;
		httpRequest.Headers = dictionary;
		httpRequest.Body = array2;
		return httpRequest;
	}

	private string ReadLine(Stream stream)
	{
		StringBuilder stringBuilder = new StringBuilder();
		int num;
		while ((num = stream.ReadByte()) != -1)
		{
			switch (num)
			{
			case 13:
			{
				int num2 = stream.ReadByte();
				switch (num2)
				{
				default:
					stringBuilder.Append((char)num2);
					continue;
				case -1:
					continue;
				case 10:
					break;
				}
				break;
			}
			default:
				stringBuilder.Append((char)num);
				continue;
			case 10:
				break;
			}
			break;
		}
		if (stringBuilder.Length == 0 && num == -1)
		{
			return null;
		}
		return stringBuilder.ToString();
	}

	private void SendResponse(Stream stream, FlowResponse response)
	{
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.Append($"HTTP/1.1 {response.Status} OK\r\n");
		stringBuilder.Append($"Content-Length: {response.Body.Length}\r\n");
		stringBuilder.Append("Connection: keep-alive\r\n");
		bool flag = false;
		foreach (KeyValuePair<string, string> header in response.Headers)
		{
			if (header.Key.Equals("Content-Type", StringComparison.OrdinalIgnoreCase))
			{
				flag = true;
			}
			stringBuilder.Append($"{header.Key}: {header.Value}\r\n");
		}
		if (!flag)
		{
			stringBuilder.Append("Content-Type: application/json\r\n");
		}
		stringBuilder.Append("\r\n");
		byte[] bytes = Encoding.ASCII.GetBytes(stringBuilder.ToString());
		stream.Write(bytes, 0, bytes.Length);
		if (response.Body.Length > 0)
		{
			stream.Write(response.Body, 0, response.Body.Length);
		}
		stream.Flush();
	}

	private void SendNotFound(Stream stream)
	{
		byte[] bytes = Encoding.ASCII.GetBytes("HTTP/1.1 404 Not Found\r\nContent-Length: 0\r\nConnection: keep-alive\r\n\r\n");
		stream.Write(bytes, 0, bytes.Length);
		stream.Flush();
	}
}
