using System;
using System.IO;
using System.Net;
using System.Net.Sockets;
using System.Text;
using System.Threading;

namespace OpenPrestige;

public class CrlServer
{
	private TcpListener _listener;

	private Thread _listenThread;

	private volatile bool _isRunning;

	private readonly int _port;

	private readonly Action<string> _logger;

	private byte[] _crlData;

	public bool IsRunning => _isRunning;

	public int Port => _port;

	public CrlServer(int port, Action<string> logger)
	{
		_port = port;
		_logger = logger;
		LoadCrlData();
	}

	private void LoadCrlData()
	{
		string path = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "crl", "mitm.crl");
		if (!File.Exists(path))
		{
			path = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "mitm.crl");
		}
		if (File.Exists(path))
		{
			_crlData = File.ReadAllBytes(path);
		}
		else
		{
			_crlData = ResourceHelper.GetResourceBytes("mitm.crl");
		}
		if (_crlData == null || _crlData.Length == 0)
		{
			_logger(Variables.LogCrlMissing);
			_crlData = new byte[0];
		}
	}

	public void Start()
	{
		if (_isRunning)
		{
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
				Name = "CrlServerWorker"
			};
			_listenThread.Start();
			_logger(string.Format(Variables.LogCrlListening, _port));
		}
		catch (Exception ex)
		{
			_isRunning = false;
			_logger(string.Format(Variables.LogCrlStartFailed, _port, ex.Message));
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
		_logger(Variables.LogCrlStopped);
	}

	private void ListenLoop()
	{
		while (_isRunning)
		{
			try
			{
				TcpClient state = _listener.AcceptTcpClient();
				ThreadPool.QueueUserWorkItem(HandleClient, state);
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
				_logger(string.Format(Variables.LogCrlAcceptError, ex2.Message));
			}
		}
	}

	private void HandleClient(object state)
	{
		TcpClient tcpClient = (TcpClient)state;
		using (tcpClient)
		{
			try
			{
				using NetworkStream networkStream = tcpClient.GetStream();
				networkStream.ReadTimeout = 5000;
				networkStream.WriteTimeout = 5000;
				StreamReader streamReader = new StreamReader(networkStream, Encoding.ASCII);
				string text = streamReader.ReadLine();
				string arg = "/";
				if (!string.IsNullOrEmpty(text))
				{
					string[] array = text.Split(new char[1] { ' ' });
					if (array.Length > 1)
					{
						arg = array[1];
					}
				}
				while (!string.IsNullOrEmpty(text))
				{
					text = streamReader.ReadLine();
				}
				StringBuilder stringBuilder = new StringBuilder();
				stringBuilder.Append("HTTP/1.1 200 OK\r\n");
				stringBuilder.Append("Content-Type: application/pkix-crl\r\n");
				stringBuilder.Append("Content-Length: " + _crlData.Length + "\r\n");
				stringBuilder.Append("Cache-Control: max-age=86400\r\n");
				stringBuilder.Append("Connection: close\r\n");
				stringBuilder.Append("\r\n");
				byte[] bytes = Encoding.ASCII.GetBytes(stringBuilder.ToString());
				networkStream.Write(bytes, 0, bytes.Length);
				if (_crlData.Length > 0)
				{
					networkStream.Write(_crlData, 0, _crlData.Length);
				}
				networkStream.Flush();
				_logger(string.Format(Variables.LogCrlServed, arg, _crlData.Length));
			}
			catch (Exception)
			{
			}
		}
	}
}
