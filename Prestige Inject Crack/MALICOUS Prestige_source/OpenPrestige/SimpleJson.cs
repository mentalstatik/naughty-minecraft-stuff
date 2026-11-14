using System;
using System.Collections;
using System.Collections.Generic;
using System.Globalization;
using System.Text;

namespace OpenPrestige;

public static class SimpleJson
{
	public static object Deserialize(string json)
	{
		if (string.IsNullOrEmpty(json))
		{
			return null;
		}
		int index = 0;
		return ParseValue(json, ref index);
	}

	public static Dictionary<string, object> DeserializeObject(string json)
	{
		return Deserialize(json) as Dictionary<string, object>;
	}

	public static int? ExtractId(string json)
	{
		if (string.IsNullOrEmpty(json))
		{
			return null;
		}
		try
		{
			Dictionary<string, object> dictionary = DeserializeObject(json);
			if (dictionary == null)
			{
				return null;
			}
			if (dictionary.ContainsKey("id") && dictionary["id"] != null && int.TryParse(dictionary["id"].ToString(), out var result))
			{
				return result;
			}
			foreach (KeyValuePair<string, object> item in dictionary)
			{
				if (item.Value is long || item.Value is int)
				{
					return Convert.ToInt32(item.Value);
				}
			}
		}
		catch
		{
		}
		return null;
	}

	public static string Serialize(object obj)
	{
		StringBuilder stringBuilder = new StringBuilder();
		SerializeValue(obj, stringBuilder);
		return stringBuilder.ToString();
	}

	private static void SerializeValue(object obj, StringBuilder sb)
	{
		if (obj == null)
		{
			sb.Append("null");
		}
		else if (obj is string)
		{
			SerializeString((string)obj, sb);
		}
		else if (obj is bool)
		{
			sb.Append(((bool)obj) ? "true" : "false");
		}
		else if (obj is IDictionary)
		{
			IDictionary dictionary = (IDictionary)obj;
			sb.Append("{");
			bool flag = true;
			foreach (DictionaryEntry item in dictionary)
			{
				if (!flag)
				{
					sb.Append(",");
				}
				flag = false;
				SerializeString(item.Key.ToString(), sb);
				sb.Append(":");
				SerializeValue(item.Value, sb);
			}
			sb.Append("}");
		}
		else if (obj is IEnumerable && !(obj is string))
		{
			IEnumerable enumerable = (IEnumerable)obj;
			sb.Append("[");
			bool flag2 = true;
			foreach (object item2 in enumerable)
			{
				if (!flag2)
				{
					sb.Append(",");
				}
				flag2 = false;
				SerializeValue(item2, sb);
			}
			sb.Append("]");
		}
		else if (obj is int || obj is long || obj is short || obj is byte)
		{
			sb.Append(Convert.ToInt64(obj).ToString(CultureInfo.InvariantCulture));
		}
		else if (obj is float || obj is double || obj is decimal)
		{
			sb.Append(Convert.ToDouble(obj).ToString("R", CultureInfo.InvariantCulture));
		}
		else
		{
			SerializeString(obj.ToString(), sb);
		}
	}

	private static void SerializeString(string s, StringBuilder sb)
	{
		sb.Append("\"");
		foreach (char c in s)
		{
			switch (c)
			{
			case '\\':
				sb.Append("\\\\");
				continue;
			case '"':
				sb.Append("\\\"");
				continue;
			case '\b':
				sb.Append("\\b");
				continue;
			case '\f':
				sb.Append("\\f");
				continue;
			case '\n':
				sb.Append("\\n");
				continue;
			case '\r':
				sb.Append("\\r");
				continue;
			case '\t':
				sb.Append("\\t");
				continue;
			}
			if (c < ' ')
			{
				sb.AppendFormat("\\u{0:x4}", (int)c);
			}
			else
			{
				sb.Append(c);
			}
		}
		sb.Append("\"");
	}

	private static object ParseValue(string json, ref int index)
	{
		SkipWhitespace(json, ref index);
		if (index >= json.Length)
		{
			return null;
		}
		char c = json[index];
		switch (c)
		{
		case '{':
			return ParseObject(json, ref index);
		case '[':
			return ParseArray(json, ref index);
		case '"':
			return ParseString(json, ref index);
		case 'f':
		case 't':
			return ParseBool(json, ref index);
		case 'n':
			return ParseNull(json, ref index);
		default:
			if (!char.IsDigit(c))
			{
				throw new FormatException("Invalid JSON token at index " + index + ": '" + c + "'");
			}
			goto case '-';
		case '-':
			return ParseNumber(json, ref index);
		}
	}

	private static Dictionary<string, object> ParseObject(string json, ref int index)
	{
		Dictionary<string, object> dictionary = new Dictionary<string, object>();
		index++;
		while (index < json.Length)
		{
			SkipWhitespace(json, ref index);
			if (index >= json.Length)
			{
				break;
			}
			if (json[index] == '}')
			{
				index++;
				return dictionary;
			}
			string key = ParseString(json, ref index);
			SkipWhitespace(json, ref index);
			if (index >= json.Length || json[index] != ':')
			{
				throw new FormatException("Expected ':' at index " + index);
			}
			index++;
			object value = ParseValue(json, ref index);
			dictionary[key] = value;
			SkipWhitespace(json, ref index);
			if (index < json.Length && json[index] == ',')
			{
				index++;
			}
			else if (index < json.Length && json[index] == '}')
			{
				index++;
				return dictionary;
			}
		}
		return dictionary;
	}

	private static List<object> ParseArray(string json, ref int index)
	{
		List<object> list = new List<object>();
		index++;
		while (index < json.Length)
		{
			SkipWhitespace(json, ref index);
			if (index >= json.Length)
			{
				break;
			}
			if (json[index] == ']')
			{
				index++;
				return list;
			}
			object item = ParseValue(json, ref index);
			list.Add(item);
			SkipWhitespace(json, ref index);
			if (index < json.Length && json[index] == ',')
			{
				index++;
			}
			else if (index < json.Length && json[index] == ']')
			{
				index++;
				return list;
			}
		}
		return list;
	}

	private static string ParseString(string json, ref int index)
	{
		if (json[index] != '"')
		{
			throw new FormatException("Expected '\"' at index " + index);
		}
		index++;
		StringBuilder stringBuilder = new StringBuilder();
		while (index < json.Length)
		{
			char c = json[index++];
			switch (c)
			{
			case '"':
				return stringBuilder.ToString();
			case '\\':
				break;
			default:
				stringBuilder.Append(c);
				continue;
			}
			if (index >= json.Length)
			{
				break;
			}
			switch (json[index++])
			{
			case '"':
				stringBuilder.Append('"');
				break;
			case '\\':
				stringBuilder.Append('\\');
				break;
			case '/':
				stringBuilder.Append('/');
				break;
			case 'b':
				stringBuilder.Append('\b');
				break;
			case 'f':
				stringBuilder.Append('\f');
				break;
			case 'n':
				stringBuilder.Append('\n');
				break;
			case 'r':
				stringBuilder.Append('\r');
				break;
			case 't':
				stringBuilder.Append('\t');
				break;
			case 'u':
				if (index + 4 <= json.Length)
				{
					string value = json.Substring(index, 4);
					stringBuilder.Append((char)Convert.ToInt32(value, 16));
					index += 4;
				}
				break;
			}
		}
		return stringBuilder.ToString();
	}

	private static object ParseNumber(string json, ref int index)
	{
		int num = index;
		if (json[index] == '-')
		{
			index++;
		}
		while (index < json.Length && (char.IsDigit(json[index]) || json[index] == '.' || json[index] == 'e' || json[index] == 'E' || json[index] == '+' || json[index] == '-'))
		{
			index++;
		}
		string text = json.Substring(num, index - num);
		if (long.TryParse(text, NumberStyles.Integer, CultureInfo.InvariantCulture, out var result))
		{
			if (result >= int.MinValue && result <= int.MaxValue)
			{
				return (int)result;
			}
			return result;
		}
		if (double.TryParse(text, NumberStyles.Float, CultureInfo.InvariantCulture, out var result2))
		{
			return result2;
		}
		return text;
	}

	private static bool ParseBool(string json, ref int index)
	{
		if (json.Substring(index).StartsWith("true"))
		{
			index += 4;
			return true;
		}
		if (json.Substring(index).StartsWith("false"))
		{
			index += 5;
			return false;
		}
		throw new FormatException("Invalid boolean at index " + index);
	}

	private static object ParseNull(string json, ref int index)
	{
		if (json.Substring(index).StartsWith("null"))
		{
			index += 4;
			return null;
		}
		throw new FormatException("Invalid null at index " + index);
	}

	private static void SkipWhitespace(string json, ref int index)
	{
		while (index < json.Length && (json[index] == ' ' || json[index] == '\t' || json[index] == '\r' || json[index] == '\n'))
		{
			index++;
		}
	}
}
