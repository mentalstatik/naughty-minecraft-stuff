using System;
using System.Drawing;
using System.Drawing.Drawing2D;
using System.Drawing.Text;
using System.Windows.Forms;

namespace OpenPrestige;

public class SplashScreen : Form
{
	private Timer _timer;

	private int _progress;

	private string _statusText = Variables.SplashStatusInit;

	public SplashScreen()
	{
		//IL_0069: Unknown result type (might be due to invalid IL or missing references)
		//IL_006f: Expected O, but got Unknown
		UITheme.Initialize();
		((Form)this).FormBorderStyle = (FormBorderStyle)0;
		((Form)this).StartPosition = (FormStartPosition)1;
		((Form)this).Size = new Size(UITheme.Scale(540), UITheme.Scale(320));
		((Control)this).BackColor = UITheme.BgDark;
		((Form)this).ShowInTaskbar = false;
		((Form)this).TopMost = true;
		base.SetStyle((ControlStyles)139266, true);
		Timer val = new Timer();
		val.Interval = 25;
		_timer = val;
		_timer.Tick += OnTick;
	}

	protected override void OnHandleCreated(EventArgs e)
	{
		base.OnHandleCreated(e);
		UITheme.EnableDarkMode(((Control)this).Handle);
	}

	protected override void OnShown(EventArgs e)
	{
		base.OnShown(e);
		_timer.Start();
	}

	private void OnTick(object sender, EventArgs e)
	{
		_progress += 2;
		if (_progress == 18)
		{
			_statusText = Variables.SplashStatusFonts;
		}
		else if (_progress == 40)
		{
			_statusText = Variables.SplashStatusDll;
		}
		else if (_progress == 65)
		{
			_statusText = Variables.SplashStatusCert;
		}
		else if (_progress == 85)
		{
			_statusText = Variables.SplashStatusEndpoints;
		}
		else if (_progress >= 100)
		{
			_timer.Stop();
			_statusText = Variables.SplashStatusReady;
			((Control)this).Invalidate();
			((Form)this).DialogResult = (DialogResult)1;
			((Form)this).Close();
			return;
		}
		((Control)this).Invalidate();
	}

	protected override void OnPaint(PaintEventArgs e)
	{
		//IL_0059: Unknown result type (might be due to invalid IL or missing references)
		//IL_0060: Expected O, but got Unknown
		//IL_00a9: Unknown result type (might be due to invalid IL or missing references)
		//IL_00b0: Expected O, but got Unknown
		//IL_00b7: Unknown result type (might be due to invalid IL or missing references)
		//IL_00be: Expected O, but got Unknown
		//IL_0143: Unknown result type (might be due to invalid IL or missing references)
		//IL_014a: Expected O, but got Unknown
		//IL_0173: Unknown result type (might be due to invalid IL or missing references)
		//IL_017a: Expected O, but got Unknown
		//IL_0273: Unknown result type (might be due to invalid IL or missing references)
		//IL_027a: Expected O, but got Unknown
		//IL_02e3: Unknown result type (might be due to invalid IL or missing references)
		//IL_02ea: Expected O, but got Unknown
		Graphics graphics = e.Graphics;
		graphics.SmoothingMode = (SmoothingMode)4;
		graphics.TextRenderingHint = (TextRenderingHint)5;
		UITheme.PaintGlassBackground(graphics, ((Control)this).ClientRectangle);
		int num = UITheme.Scale(12);
		Rectangle rectangle = new Rectangle(num, num, ((Control)this).Width - num * 2, ((Control)this).Height - num * 2);
		GraphicsPath val = UITheme.CreateRoundedRectanglePath(rectangle, UITheme.Scale(16));
		try
		{
			SolidBrush val2 = new SolidBrush(UITheme.GlassSurface);
			try
			{
				graphics.FillPath((Brush)(object)val2, val);
			}
			finally
			{
				((IDisposable)val2)?.Dispose();
			}
			LinearGradientBrush val3 = new LinearGradientBrush(rectangle, Color.FromArgb(120, 255, 255, 255), Color.FromArgb(20, 255, 255, 255), 90f);
			try
			{
				Pen val4 = new Pen((Brush)(object)val3, 1.4f);
				try
				{
					graphics.DrawPath(val4, val);
				}
				finally
				{
					((IDisposable)val4)?.Dispose();
				}
			}
			finally
			{
				((IDisposable)val3)?.Dispose();
			}
		}
		finally
		{
			((IDisposable)val)?.Dispose();
		}
		int num2 = UITheme.Scale(210);
		int height = UITheme.Scale(26);
		Rectangle rectangle2 = new Rectangle(((Control)this).Width / 2 - num2 / 2, UITheme.Scale(36), num2, height);
		GraphicsPath val5 = UITheme.CreateRoundedRectanglePath(rectangle2, UITheme.Scale(13));
		try
		{
			SolidBrush val6 = new SolidBrush(Color.FromArgb(180, 26, 32, 50));
			try
			{
				graphics.FillPath((Brush)(object)val6, val5);
			}
			finally
			{
				((IDisposable)val6)?.Dispose();
			}
			Pen val7 = new Pen(Color.FromArgb(120, UITheme.Accent), 1.2f);
			try
			{
				graphics.DrawPath(val7, val5);
			}
			finally
			{
				((IDisposable)val7)?.Dispose();
			}
		}
		finally
		{
			((IDisposable)val5)?.Dispose();
		}
		TextRenderer.DrawText((IDeviceContext)(object)graphics, Variables.SplashBadge, UITheme.FontSmallBold, rectangle2, UITheme.HighlightTag, (TextFormatFlags)5);
		Rectangle rectangle3 = new Rectangle(0, UITheme.Scale(80), ((Control)this).Width, UITheme.Scale(42));
		TextRenderer.DrawText((IDeviceContext)(object)graphics, Variables.SplashTitle, UITheme.FontDisplay, rectangle3, UITheme.TextPrimary, (TextFormatFlags)5);
		Rectangle rectangle4 = new Rectangle(0, UITheme.Scale(126), ((Control)this).Width, UITheme.Scale(22));
		TextRenderer.DrawText((IDeviceContext)(object)graphics, Variables.SplashSubtitle, UITheme.FontSmallBold, rectangle4, UITheme.TextMuted, (TextFormatFlags)5);
		int num3 = ((Control)this).Width - UITheme.Scale(100);
		int height2 = UITheme.Scale(6);
		int x = UITheme.Scale(50);
		int y = UITheme.Scale(200);
		Rectangle rect = new Rectangle(x, y, num3, height2);
		GraphicsPath val8 = UITheme.CreateRoundedRectanglePath(rect, 3);
		try
		{
			SolidBrush val9 = new SolidBrush(Color.FromArgb(100, 20, 24, 38));
			try
			{
				graphics.FillPath((Brush)(object)val9, val8);
			}
			finally
			{
				((IDisposable)val9)?.Dispose();
			}
		}
		finally
		{
			((IDisposable)val8)?.Dispose();
		}
		int num4 = (int)((float)num3 * ((float)_progress / 100f));
		if (num4 > 4)
		{
			Rectangle rectangle5 = new Rectangle(x, y, num4, height2);
			GraphicsPath val10 = UITheme.CreateRoundedRectanglePath(rectangle5, 3);
			try
			{
				LinearGradientBrush val11 = new LinearGradientBrush(rectangle5, UITheme.Accent, UITheme.HighlightTag, 0f);
				try
				{
					graphics.FillPath((Brush)(object)val11, val10);
				}
				finally
				{
					((IDisposable)val11)?.Dispose();
				}
			}
			finally
			{
				((IDisposable)val10)?.Dispose();
			}
		}
		Rectangle rectangle6 = new Rectangle(x, UITheme.Scale(218), num3, UITheme.Scale(24));
		TextRenderer.DrawText((IDeviceContext)(object)graphics, _statusText, UITheme.FontSmall, rectangle6, UITheme.TextMuted, (TextFormatFlags)4);
		TextRenderer.DrawText((IDeviceContext)(object)graphics, _progress + "%", UITheme.FontSmallBold, rectangle6, UITheme.HighlightTag, (TextFormatFlags)6);
		Rectangle rectangle7 = new Rectangle(0, ((Control)this).Height - UITheme.Scale(36), ((Control)this).Width, UITheme.Scale(20));
		TextRenderer.DrawText((IDeviceContext)(object)graphics, Variables.VersionTag + " • " + Variables.AuthorCredit, UITheme.FontSmall, rectangle7, UITheme.TextFaint, (TextFormatFlags)5);
	}
}
