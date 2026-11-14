using System;
using System.Drawing;
using System.Drawing.Drawing2D;
using System.Drawing.Text;
using System.IO;
using System.Runtime.InteropServices;

namespace OpenPrestige;

public static class UITheme
{
	private const uint FR_PRIVATE = 16u;

	private const int DWMWA_USE_IMMERSIVE_DARK_MODE = 20;

	private const int DWMWA_USE_IMMERSIVE_DARK_MODE_OLD = 19;

	private const int LOGPIXELSX = 88;

	public static float DpiScale = 1f;

	public static ThemePreset CurrentTheme = ThemePreset.CyberIndigo;

	public static Color BgDark = Color.FromArgb(10, 11, 16);

	public static Color BgGradientTop = Color.FromArgb(17, 19, 30);

	public static Color BgGradientBottom = Color.FromArgb(10, 11, 16);

	public static Color GlassSurface = Color.FromArgb(140, 18, 22, 34);

	public static Color GlassBorderTop = Color.FromArgb(75, 255, 255, 255);

	public static Color GlassBorderBottom = Color.FromArgb(18, 255, 255, 255);

	public static Color CardBgSolid = Color.FromArgb(17, 21, 32);

	public static Color CardBgLight = Color.FromArgb(22, 27, 42);

	public static Color TextPrimary = Color.FromArgb(243, 244, 246);

	public static Color TextMuted = Color.FromArgb(148, 163, 184);

	public static Color TextFaint = Color.FromArgb(100, 116, 139);

	public static Color Accent = Color.FromArgb(99, 102, 241);

	public static Color AccentHover = Color.FromArgb(129, 140, 248);

	public static Color AccentEnd = Color.FromArgb(79, 70, 229);

	public static Color GlowColor1 = Color.FromArgb(45, 99, 102, 241);

	public static Color GlowColor2 = Color.FromArgb(35, 56, 189, 248);

	public static Color HighlightTag = Color.FromArgb(56, 189, 248);

	public static readonly Color StatusGreen = Color.FromArgb(52, 211, 153);

	public static readonly Color StatusAmber = Color.FromArgb(251, 191, 36);

	public static readonly Color StatusRed = Color.FromArgb(248, 113, 113);

	public static readonly Color ConsoleBg = Color.FromArgb(8, 10, 15);

	public static PrivateFontCollection FontCollection = new PrivateFontCollection();

	public static FontFamily InterFamily;

	private static IntPtr _pinnedFontMemory = IntPtr.Zero;

	public static Font FontDisplay;

	public static Font FontTitle;

	public static Font FontSubtitle;

	public static Font FontHeader;

	public static Font FontBody;

	public static Font FontBodyBold;

	public static Font FontSmall;

	public static Font FontSmallBold;

	public static Font FontMono;

	public static event Action ThemeChanged;

	[DllImport("dwmapi.dll")]
	private static extern int DwmSetWindowAttribute(IntPtr hwnd, int attr, ref int attrValue, int attrSize);

	[DllImport("gdi32.dll")]
	private static extern IntPtr AddFontMemResourceEx(byte[] pbFont, uint cbFont, IntPtr pdv, [In] ref uint pcFonts);

	[DllImport("gdi32.dll", SetLastError = true)]
	private static extern int AddFontResourceEx(string lpszFilename, uint fl, IntPtr pdv);

	[DllImport("user32.dll")]
	private static extern IntPtr GetDC(IntPtr hWnd);

	[DllImport("user32.dll")]
	private static extern int ReleaseDC(IntPtr hWnd, IntPtr hDC);

	[DllImport("gdi32.dll")]
	private static extern int GetDeviceCaps(IntPtr hdc, int nIndex);

	public static int Scale(int val)
	{
		return (int)Math.Round((float)val * DpiScale);
	}

	public static void Initialize()
	{
		DetectDpiScale();
		InitializeFonts();
		CreateCachedFonts();
		ApplyTheme(ThemePreset.CyberIndigo);
	}

	private static void DetectDpiScale()
	{
		try
		{
			IntPtr dC = GetDC(IntPtr.Zero);
			if (!(dC != IntPtr.Zero))
			{
				return;
			}
			int deviceCaps = GetDeviceCaps(dC, 88);
			ReleaseDC(IntPtr.Zero, dC);
			if (deviceCaps > 0)
			{
				DpiScale = (float)deviceCaps / 96f;
				if (DpiScale < 1f)
				{
					DpiScale = 1f;
				}
			}
		}
		catch
		{
			DpiScale = 1f;
		}
	}

	public static void ApplyTheme(ThemePreset preset)
	{
		CurrentTheme = preset;
		switch (preset)
		{
		case ThemePreset.EmeraldMatrix:
			BgDark = Color.FromArgb(8, 14, 12);
			BgGradientTop = Color.FromArgb(12, 24, 20);
			BgGradientBottom = Color.FromArgb(8, 14, 12);
			GlassSurface = Color.FromArgb(140, 14, 28, 22);
			CardBgSolid = Color.FromArgb(13, 23, 19);
			CardBgLight = Color.FromArgb(18, 30, 25);
			Accent = Color.FromArgb(16, 185, 129);
			AccentHover = Color.FromArgb(52, 211, 153);
			AccentEnd = Color.FromArgb(5, 150, 105);
			GlowColor1 = Color.FromArgb(45, 16, 185, 129);
			GlowColor2 = Color.FromArgb(35, 132, 204, 22);
			HighlightTag = Color.FromArgb(52, 211, 153);
			break;
		case ThemePreset.ObsidianCrimson:
			BgDark = Color.FromArgb(14, 9, 11);
			BgGradientTop = Color.FromArgb(26, 14, 18);
			BgGradientBottom = Color.FromArgb(14, 9, 11);
			GlassSurface = Color.FromArgb(140, 32, 16, 22);
			CardBgSolid = Color.FromArgb(23, 16, 20);
			CardBgLight = Color.FromArgb(30, 21, 26);
			Accent = Color.FromArgb(225, 29, 72);
			AccentHover = Color.FromArgb(244, 63, 94);
			AccentEnd = Color.FromArgb(190, 18, 60);
			GlowColor1 = Color.FromArgb(50, 225, 29, 72);
			GlowColor2 = Color.FromArgb(35, 234, 88, 12);
			HighlightTag = Color.FromArgb(251, 113, 133);
			break;
		case ThemePreset.SapphireIce:
			BgDark = Color.FromArgb(8, 12, 18);
			BgGradientTop = Color.FromArgb(14, 22, 36);
			BgGradientBottom = Color.FromArgb(8, 12, 18);
			GlassSurface = Color.FromArgb(140, 16, 26, 42);
			CardBgSolid = Color.FromArgb(14, 20, 32);
			CardBgLight = Color.FromArgb(19, 27, 42);
			Accent = Color.FromArgb(2, 132, 199);
			AccentHover = Color.FromArgb(56, 189, 248);
			AccentEnd = Color.FromArgb(3, 105, 161);
			GlowColor1 = Color.FromArgb(50, 2, 132, 199);
			GlowColor2 = Color.FromArgb(40, 6, 182, 212);
			HighlightTag = Color.FromArgb(56, 189, 248);
			break;
		case ThemePreset.AmethystSunset:
			BgDark = Color.FromArgb(13, 9, 18);
			BgGradientTop = Color.FromArgb(24, 15, 34);
			BgGradientBottom = Color.FromArgb(13, 9, 18);
			GlassSurface = Color.FromArgb(140, 30, 18, 44);
			CardBgSolid = Color.FromArgb(23, 16, 32);
			CardBgLight = Color.FromArgb(30, 21, 42);
			Accent = Color.FromArgb(168, 85, 247);
			AccentHover = Color.FromArgb(192, 132, 252);
			AccentEnd = Color.FromArgb(147, 51, 234);
			GlowColor1 = Color.FromArgb(50, 168, 85, 247);
			GlowColor2 = Color.FromArgb(35, 249, 115, 22);
			HighlightTag = Color.FromArgb(232, 121, 249);
			break;
		default:
			BgDark = Color.FromArgb(10, 11, 16);
			BgGradientTop = Color.FromArgb(17, 19, 30);
			BgGradientBottom = Color.FromArgb(10, 11, 16);
			GlassSurface = Color.FromArgb(140, 18, 22, 34);
			CardBgSolid = Color.FromArgb(17, 21, 32);
			CardBgLight = Color.FromArgb(22, 27, 42);
			Accent = Color.FromArgb(99, 102, 241);
			AccentHover = Color.FromArgb(129, 140, 248);
			AccentEnd = Color.FromArgb(79, 70, 229);
			GlowColor1 = Color.FromArgb(45, 99, 102, 241);
			GlowColor2 = Color.FromArgb(35, 56, 189, 248);
			HighlightTag = Color.FromArgb(56, 189, 248);
			break;
		}
		if (UITheme.ThemeChanged != null)
		{
			try
			{
				UITheme.ThemeChanged();
			}
			catch
			{
			}
		}
	}

	public static void EnableDarkMode(IntPtr handle)
	{
		try
		{
			int attrValue = 1;
			if (DwmSetWindowAttribute(handle, 20, ref attrValue, 4) != 0)
			{
				DwmSetWindowAttribute(handle, 19, ref attrValue, 4);
			}
		}
		catch
		{
		}
	}

	private static void InitializeFonts()
	{
		//IL_014d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0157: Expected O, but got Unknown
		try
		{
			string path = Path.Combine(Environment.GetFolderPath(Environment.SpecialFolder.LocalApplicationData), "OpenPrestige");
			string text = Path.Combine(path, "Inter.ttf");
			if (!File.Exists(text))
			{
				string text2 = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "Inter.ttf");
				if (File.Exists(text2))
				{
					text = text2;
				}
				else
				{
					ResourceHelper.ExtractResourceToFile("Inter.ttf", text);
				}
			}
			byte[] array = null;
			array = ((!File.Exists(text)) ? ResourceHelper.GetResourceBytes("Inter.ttf") : File.ReadAllBytes(text));
			if (array != null && array.Length > 0)
			{
				uint pcFonts = 0u;
				AddFontMemResourceEx(array, (uint)array.Length, IntPtr.Zero, ref pcFonts);
				if (_pinnedFontMemory == IntPtr.Zero)
				{
					_pinnedFontMemory = Marshal.AllocCoTaskMem(array.Length);
					Marshal.Copy(array, 0, _pinnedFontMemory, array.Length);
					FontCollection.AddMemoryFont(_pinnedFontMemory, array.Length);
				}
			}
			if (File.Exists(text))
			{
				try
				{
					AddFontResourceEx(text, 16u, IntPtr.Zero);
				}
				catch
				{
				}
				try
				{
					FontCollection.AddFontFile(text);
				}
				catch
				{
				}
			}
			FontFamily[] families = ((FontCollection)FontCollection).Families;
			foreach (FontFamily val in families)
			{
				if (val.Name.IndexOf("Inter", StringComparison.OrdinalIgnoreCase) >= 0)
				{
					InterFamily = val;
					break;
				}
			}
		}
		catch
		{
		}
		if (InterFamily == null)
		{
			try
			{
				InterFamily = new FontFamily("Segoe UI");
			}
			catch
			{
				InterFamily = FontFamily.GenericSansSerif;
			}
		}
	}

	private static void CreateCachedFonts()
	{
		FontDisplay = CreateFont(15f, (FontStyle)1);
		FontTitle = CreateFont(13f, (FontStyle)1);
		FontSubtitle = CreateFont(9f, (FontStyle)0);
		FontHeader = CreateFont(9.5f, (FontStyle)1);
		FontBody = CreateFont(9.5f, (FontStyle)0);
		FontBodyBold = CreateFont(9.5f, (FontStyle)1);
		FontSmall = CreateFont(8f, (FontStyle)0);
		FontSmallBold = CreateFont(8f, (FontStyle)1);
		FontMono = CreateFont(9f, (FontStyle)0);
	}

	public static Font CreateFont(float size, FontStyle style = 0)
	{
		//IL_001d: Unknown result type (might be due to invalid IL or missing references)
		//IL_001f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0025: Expected O, but got Unknown
		//IL_000d: Unknown result type (might be due to invalid IL or missing references)
		//IL_000f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0015: Expected O, but got Unknown
		try
		{
			if (InterFamily != null)
			{
				return new Font(InterFamily, size, style, (GraphicsUnit)3);
			}
			return new Font("Segoe UI", size, style, (GraphicsUnit)3);
		}
		catch
		{
			return SystemFonts.DefaultFont;
		}
	}

	public static GraphicsPath CreateRoundedRectanglePath(Rectangle rect, int radius)
	{
		//IL_0000: Unknown result type (might be due to invalid IL or missing references)
		//IL_0006: Expected O, but got Unknown
		GraphicsPath val = new GraphicsPath();
		int num = radius * 2;
		if (num > rect.Width)
		{
			num = rect.Width;
		}
		if (num > rect.Height)
		{
			num = rect.Height;
		}
		Rectangle rectangle = new Rectangle(rect.Location, new Size(num, num));
		val.AddArc(rectangle, 180f, 90f);
		rectangle.X = rect.Right - num;
		val.AddArc(rectangle, 270f, 90f);
		rectangle.Y = rect.Bottom - num;
		val.AddArc(rectangle, 0f, 90f);
		rectangle.X = rect.Left;
		val.AddArc(rectangle, 90f, 90f);
		val.CloseFigure();
		return val;
	}

	public static void PaintGlassBackground(Graphics g, Rectangle bounds)
	{
		//IL_0017: Unknown result type (might be due to invalid IL or missing references)
		//IL_001d: Expected O, but got Unknown
		//IL_0031: Unknown result type (might be due to invalid IL or missing references)
		//IL_0037: Expected O, but got Unknown
		//IL_006a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0070: Expected O, but got Unknown
		//IL_00c3: Unknown result type (might be due to invalid IL or missing references)
		//IL_00ca: Expected O, but got Unknown
		//IL_010a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0111: Expected O, but got Unknown
		g.SmoothingMode = (SmoothingMode)4;
		LinearGradientBrush val = new LinearGradientBrush(bounds, BgGradientTop, BgGradientBottom, 90f);
		try
		{
			g.FillRectangle((Brush)(object)val, bounds);
		}
		finally
		{
			((IDisposable)val)?.Dispose();
		}
		GraphicsPath val2 = new GraphicsPath();
		try
		{
			Rectangle rectangle = new Rectangle(-Scale(50), -Scale(50), Scale(360), Scale(260));
			val2.AddEllipse(rectangle);
			PathGradientBrush val3 = new PathGradientBrush(val2);
			try
			{
				val3.CenterColor = GlowColor1;
				val3.SurroundColors = new Color[1] { Color.FromArgb(0, GlowColor1) };
				g.FillPath((Brush)(object)val3, val2);
			}
			finally
			{
				((IDisposable)val3)?.Dispose();
			}
		}
		finally
		{
			((IDisposable)val2)?.Dispose();
		}
		GraphicsPath val4 = new GraphicsPath();
		try
		{
			Rectangle rectangle2 = new Rectangle(bounds.Width - Scale(280), -Scale(40), Scale(340), Scale(240));
			val4.AddEllipse(rectangle2);
			PathGradientBrush val5 = new PathGradientBrush(val4);
			try
			{
				val5.CenterColor = GlowColor2;
				val5.SurroundColors = new Color[1] { Color.FromArgb(0, GlowColor2) };
				g.FillPath((Brush)(object)val5, val4);
			}
			finally
			{
				((IDisposable)val5)?.Dispose();
			}
		}
		finally
		{
			((IDisposable)val4)?.Dispose();
		}
	}
}
