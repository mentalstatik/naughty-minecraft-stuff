namespace OpenPrestige;

public class ProcessItem
{
	public int Pid { get; set; }

	public string ProcessName { get; set; }

	public string Title { get; set; }

	public override string ToString()
	{
		if (string.IsNullOrEmpty(Title))
		{
			return $"{ProcessName}.exe (PID: {Pid})";
		}
		return $"{ProcessName}.exe (PID: {Pid}) - {Title}";
	}
}
