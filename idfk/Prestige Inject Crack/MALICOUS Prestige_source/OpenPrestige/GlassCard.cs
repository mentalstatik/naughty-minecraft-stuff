using System;
using System.Drawing;
using System.Drawing.Drawing2D;
using System.Windows.Forms;

namespace OpenPrestige;

public class GlassCard : Panel
{
	public int BorderRadius { get; set; }

	public bool DrawShineLine { get; set; }

	public GlassCard()
	{
		//IL_0031: Unknown result type (might be due to invalid IL or missing references)
		((Control)this).SetStyle((ControlStyles)139266, true);
		BorderRadius = 12;
		DrawShineLine = true;
		((Control)this).BackColor = UITheme.CardBgSolid;
		((Control)this).Padding = new Padding(14);
		Action value = delegate
		{
			((Control)this).BackColor = UITheme.CardBgSolid;
			((Control)this).Invalidate();
		};
		UITheme.ThemeChanged += value;
	}

	protected override void OnPaint(PaintEventArgs e)
	{
		//IL_0059: Unknown result type (might be due to invalid IL or missing references)
		//IL_005f: Expected O, but got Unknown
		//IL_0088: Unknown result type (might be due to invalid IL or missing references)
		//IL_008f: Expected O, but got Unknown
		//IL_0096: Unknown result type (might be due to invalid IL or missing references)
		//IL_009d: Expected O, but got Unknown
		//IL_00f4: Unknown result type (might be due to invalid IL or missing references)
		//IL_00fb: Expected O, but got Unknown
		e.Graphics.Clear(UITheme.BgDark);
		e.Graphics.SmoothingMode = (SmoothingMode)4;
		Rectangle rectangle = new Rectangle(0, 0, ((Control)this).Width - 1, ((Control)this).Height - 1);
		int num = UITheme.Scale(BorderRadius);
		GraphicsPath val = UITheme.CreateRoundedRectanglePath(rectangle, num);
		try
		{
			LinearGradientBrush val2 = new LinearGradientBrush(rectangle, UITheme.CardBgLight, UITheme.CardBgSolid, 90f);
			try
			{
				e.Graphics.FillPath((Brush)(object)val2, val);
			}
			finally
			{
				((IDisposable)val2)?.Dispose();
			}
			LinearGradientBrush val3 = new LinearGradientBrush(rectangle, UITheme.GlassBorderTop, UITheme.GlassBorderBottom, 90f);
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
			if (DrawShineLine && ((Control)this).Width > 30)
			{
				Pen val5 = new Pen(Color.FromArgb(40, 255, 255, 255), 1f);
				try
				{
					e.Graphics.DrawLine(val5, num + 4, 2, ((Control)this).Width - num - 4, 2);
					return;
				}
				finally
				{
					((IDisposable)val5)?.Dispose();
				}
			}
		}
		finally
		{
			((IDisposable)val)?.Dispose();
		}
	}
}
