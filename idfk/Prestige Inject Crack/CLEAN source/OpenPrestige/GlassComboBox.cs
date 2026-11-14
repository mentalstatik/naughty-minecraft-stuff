using System;
using System.Drawing;
using System.Drawing.Drawing2D;
using System.Windows.Forms;

namespace OpenPrestige;

public class GlassComboBox : ComboBox
{
	private bool _isHovered;

	public GlassComboBox()
	{
		base.SetStyle((ControlStyles)139266, true);
		((ComboBox)this).DrawMode = (DrawMode)1;
		((ComboBox)this).DropDownStyle = (ComboBoxStyle)2;
		((Control)this).BackColor = UITheme.CardBgSolid;
		((Control)this).ForeColor = UITheme.TextPrimary;
		((Control)this).Font = UITheme.FontSmall;
		((ComboBox)this).ItemHeight = UITheme.Scale(28);
		((ComboBox)this).FlatStyle = (FlatStyle)0;
		((Control)this).Cursor = Cursors.Hand;
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
		((Control)this).Invalidate();
	}

	protected override void OnPaint(PaintEventArgs e)
	{
		//IL_00f2: Unknown result type (might be due to invalid IL or missing references)
		//IL_00f9: Expected O, but got Unknown
		//IL_011f: Unknown result type (might be due to invalid IL or missing references)
		//IL_0126: Expected O, but got Unknown
		//IL_012d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0134: Expected O, but got Unknown
		//IL_026a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0271: Expected O, but got Unknown
		Color color = ((((Control)this).Parent != null) ? ((Control)this).Parent.BackColor : UITheme.CardBgSolid);
		e.Graphics.Clear(color);
		e.Graphics.SmoothingMode = (SmoothingMode)4;
		Rectangle rectangle = new Rectangle(0, 0, ((Control)this).Width - 1, ((Control)this).Height - 1);
		Color color2 = (_isHovered ? Color.FromArgb(36, 44, 62) : Color.FromArgb(24, 30, 44));
		Color color3 = (_isHovered ? Color.FromArgb(140, 255, 255, 255) : Color.FromArgb(70, 255, 255, 255));
		Color color4 = (_isHovered ? Color.FromArgb(60, 255, 255, 255) : Color.FromArgb(25, 255, 255, 255));
		int radius = UITheme.Scale(8);
		GraphicsPath val = UITheme.CreateRoundedRectanglePath(rectangle, radius);
		try
		{
			SolidBrush val2 = new SolidBrush(color2);
			try
			{
				e.Graphics.FillPath((Brush)(object)val2, val);
			}
			finally
			{
				((IDisposable)val2)?.Dispose();
			}
			LinearGradientBrush val3 = new LinearGradientBrush(rectangle, color3, color4, 90f);
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
		string text = ((((ComboBox)this).SelectedItem != null) ? ((ComboBox)this).SelectedItem.ToString() : ((((ComboBox)this).Items.Count > 0) ? ((ComboBox)this).Items[0].ToString() : Variables.NoProcessSelected));
		Rectangle rectangle2 = new Rectangle(UITheme.Scale(10), 0, ((Control)this).Width - UITheme.Scale(34), ((Control)this).Height);
		TextRenderer.DrawText((IDeviceContext)(object)e.Graphics, text, ((Control)this).Font, rectangle2, UITheme.TextPrimary, (TextFormatFlags)32772);
		int num = ((Control)this).Width - UITheme.Scale(18);
		int num2 = ((Control)this).Height / 2 - 1;
		Point[] array = new Point[3]
		{
			new Point(num - 4, num2 - 2),
			new Point(num, num2 + 2),
			new Point(num + 4, num2 - 2)
		};
		Pen val5 = new Pen(UITheme.TextMuted, 1.8f);
		try
		{
			val5.StartCap = (LineCap)2;
			val5.EndCap = (LineCap)2;
			e.Graphics.DrawLines(val5, array);
		}
		finally
		{
			((IDisposable)val5)?.Dispose();
		}
	}

	protected override void OnDrawItem(DrawItemEventArgs e)
	{
		//IL_000b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0011: Unknown result type (might be due to invalid IL or missing references)
		//IL_0013: Invalid comparison between Unknown and I4
		//IL_003d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0043: Expected O, but got Unknown
		if (e.Index >= 0)
		{
			bool flag = (e.State & DrawItemState.Selected) == DrawItemState.Selected;
			Color color = (flag ? UITheme.Accent : Color.FromArgb(24, 30, 44));
			Color color2 = (flag ? Color.White : UITheme.TextPrimary);
			SolidBrush val = new SolidBrush(color);
			try
			{
				e.Graphics.FillRectangle((Brush)(object)val, e.Bounds);
			}
			finally
			{
				((IDisposable)val)?.Dispose();
			}
			string text = ((ComboBox)this).Items[e.Index].ToString();
			Rectangle rectangle = new Rectangle(e.Bounds.X + 10, e.Bounds.Y, e.Bounds.Width - 20, e.Bounds.Height);
			TextRenderer.DrawText((IDeviceContext)(object)e.Graphics, text, ((Control)this).Font, rectangle, color2, (TextFormatFlags)32772);
		}
	}
}
