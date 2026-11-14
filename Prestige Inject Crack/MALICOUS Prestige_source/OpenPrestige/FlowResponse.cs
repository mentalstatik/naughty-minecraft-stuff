using System.Collections.Generic;

namespace OpenPrestige;

public class FlowResponse
{
	public int Status { get; set; }

	public List<KeyValuePair<string, string>> Headers { get; set; }

	public byte[] Body { get; set; }

	public FlowResponse()
	{
		Headers = new List<KeyValuePair<string, string>>();
		Body = new byte[0];
		Status = 200;
	}

	public FlowResponse(int status, List<KeyValuePair<string, string>> headers, byte[] body)
	{
		Status = status;
		Headers = headers ?? new List<KeyValuePair<string, string>>();
		Body = body ?? new byte[0];
	}
}
