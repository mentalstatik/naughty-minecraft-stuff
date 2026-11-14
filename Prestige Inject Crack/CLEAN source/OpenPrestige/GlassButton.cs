using System;
using System.Drawing;
using System.Drawing.Drawing2D;
using System.Windows.Forms;

namespace OpenPrestige;

public class GlassButton : Button
{
	private bool _isHovered;

	private bool _isPressed;

	public bool IsAccent { get; set; }

	public int BorderRadius { get; set; }

	public GlassButton()
	{
		base.SetStyle((ControlStyles)139266, true);
		((Control)this).Cursor = Cursors.Hand;
		((ButtonBase)this).FlatStyle = (FlatStyle)0;
		((ButtonBase)this).FlatAppearance.BorderSize = 0;
		BorderRadius = 8;
		((Control)this).Font = UITheme.FontBodyBold;
		((Control)this).ForeColor = UITheme.TextPrimary;
		IsAccent = false;
		((Control)this).BackColor = UITheme.CardBgSolid;
		Action value = delegate
		{
			((Control)this).BackColor = ((((Control)this).Parent != null) ? ((Control)this).Parent.BackColor : UITheme.CardBgSolid);
			((Control)this).Invalidate();
		};
		UITheme.ThemeChanged += value;
	}

	protected override void OnMouseEnter(EventArgs e)
	{
		base.OnMouseEnter(e);
		_isHovered = true;
		((Control)this).Invalidate();
	}

	protected override void OnMouseLeave(EventArgs e)
	{
		base.OnMouseLeave(e);
		_isHovered = false;
		_isPressed = false;
		((Control)this).Invalidate();
	}

	protected override void OnMouseDown(MouseEventArgs e)
	{
		base.OnMouseDown(e);
		_isPressed = true;
		((Control)this).Invalidate();
	}

	protected override void OnMouseUp(MouseEventArgs e)
	{
		base.OnMouseUp(e);
		_isPressed = false;
		((Control)this).Invalidate();
	}

	protected override void OnPaint(PaintEventArgs e)
	{
		//IL_02ee: Unknown result type (might be due to invalid IL or missing references)
		//IL_02f5: Expected O, but got Unknown
		//IL_031c: Unknown result type (might be due to invalid IL or missing references)
		//IL_0323: Expected O, but got Unknown
		//IL_032a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0331: Expected O, but got Unknown
		Color color = ((((Control)this).Parent != null) ? ((Control)this).Parent.BackColor : UITheme.CardBgSolid);
		e.Graphics.Clear(color);
		e.Graphics.SmoothingMode = (SmoothingMode)4;
		Rectangle rectangle = new Rectangle(0, 0, ((Control)this).Width - 1, ((Control)this).Height - 1);
		Color color2;
		Color color3;
		Color color4;
		Color color5;
		if (IsAccent)
		{
			if (!((Control)this).Enabled)
			{
				color2 = Color.FromArgb(45, 48, 62);
				color3 = Color.FromArgb(35, 38, 50);
				color4 = Color.FromArgb(60, 255, 255, 255);
				color5 = Color.FromArgb(20, 255, 255, 255);
			}
			else if (_isPressed)
			{
				color2 = UITheme.AccentEnd;
				color3 = UITheme.Accent;
				color4 = Color.FromArgb(180, 255, 255, 255);
				color5 = Color.FromArgb(80, 255, 255, 255);
			}
			else if (_isHovered)
			{
				color2 = UITheme.AccentHover;
				color3 = UITheme.Accent;
				color4 = Color.FromArgb(240, 255, 255, 255);
				color5 = Color.FromArgb(120, 255, 255, 255);
			}
			else
			{
				color2 = UITheme.Accent;
				color3 = UITheme.AccentEnd;
				color4 = Color.FromArgb(160, 255, 255, 255);
				color5 = Color.FromArgb(60, 255, 255, 255);
			}
		}
		else if (!((Control)this).Enabled)
		{
			color2 = Color.FromArgb(24, 28, 38);
			color3 = Color.FromArgb(20, 24, 32);
			color4 = Color.FromArgb(30, 255, 255, 255);
			color5 = Color.FromArgb(15, 255, 255, 255);
		}
		else if (_isPressed)
		{
			color2 = Color.FromArgb(22, 26, 38);
			color3 = Color.FromArgb(18, 22, 32);
			color4 = Color.FromArgb(70, 255, 255, 255);
			color5 = Color.FromArgb(30, 255, 255, 255);
		}
		else if (_isHovered)
		{
			color2 = Color.FromArgb(44, 52, 74);
			color3 = Color.FromArgb(32, 38, 54);
			color4 = Color.FromArgb(140, 255, 255, 255);
			color5 = Color.FromArgb(60, 255, 255, 255);
		}
		else
		{
			color2 = Color.FromArgb(32, 38, 54);
			color3 = Color.FromArgb(24, 28, 42);
			color4 = Color.FromArgb(70, 255, 255, 255);
			color5 = Color.FromArgb(30, 255, 255, 255);
		}
		int radius = UITheme.Scale(BorderRadius);
		GraphicsPath val = UITheme.CreateRoundedRectanglePath(rectangle, radius);
		try
		{
			LinearGradientBrush val2 = new LinearGradientBrush(rectangle, color2, color3, 90f);
			try
			{
				e.Graphics.FillPath((Brush)(object)val2, val);
			}
			finally
			{
				((IDisposable)val2)?.Dispose();
			}
			LinearGradientBrush val3 = new LinearGradientBrush(rectangle, color4, color5, 90f);
			try
			{
				Pen val4 = new Pen((Brush)(object)val3, 1.2f);
				try
				{
					e.Graphics.DrawPath(val4, val);
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
		Color color6 = ((!((Control)this).Enabled) ? UITheme.TextFaint : (IsAccent ? Color.White : UITheme.TextPrimary));
		TextRenderer.DrawText((IDeviceContext)(object)e.Graphics, ((Control)this).Text, ((Control)this).Font, rectangle, color6, (TextFormatFlags)37);
	}
}
