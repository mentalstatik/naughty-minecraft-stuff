using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Drawing;
using System.Threading;
using System.Windows.Forms;

namespace OpenPrestige;

public class MainForm : Form
{
	private CrlServer _crlServer;

	private ReplayServer _replayServer;

	private Label _lblTitle;

	private Label _lblDevBadge;

	private Label _lblSubtitle;

	private Label _lblThemeTag;

	private GlassComboBox _cmbTheme;

	private Label _lblCrlStatus;

	private Label _lblReplayStatus;

	private GlassCard _cardProcess;

	private Label _lblProcessHeader;

	private GlassComboBox _cmbProcesses;

	private GlassButton _btnRefresh;

	private GlassButton _btnInject;

	private Label _lblProcessStatus;

	private GlassCard _cardLogs;

	private Label _lblLogHeader;

	private GlassButton _btnClearLog;

	private RichTextBox _rtbLog;

	private Label _lblFooter;

	private System.Windows.Forms.Timer _processScanTimer; // decompiler ambiguity fix: System.Threading is also imported

	public MainForm()
	{
		UITheme.Initialize();
		InitializeComponent();
		UITheme.ThemeChanged += OnThemeChanged;
	}

	protected override void OnHandleCreated(EventArgs e)
	{
		base.OnHandleCreated(e);
		UITheme.EnableDarkMode(((Control)this).Handle);
	}

	private void InitializeComponent()
	{
		//IL_0090: Unknown result type (might be due to invalid IL or missing references)
		//IL_0097: Expected O, but got Unknown
		//IL_00eb: Unknown result type (might be due to invalid IL or missing references)
		//IL_00f2: Expected O, but got Unknown
		//IL_016d: Unknown result type (might be due to invalid IL or missing references)
		//IL_0187: Unknown result type (might be due to invalid IL or missing references)
		//IL_018e: Expected O, but got Unknown
		//IL_02b6: Unknown result type (might be due to invalid IL or missing references)
		//IL_02bd: Expected O, but got Unknown
		//IL_033b: Unknown result type (might be due to invalid IL or missing references)
		//IL_0342: Expected O, but got Unknown
		//IL_03af: Unknown result type (might be due to invalid IL or missing references)
		//IL_03b6: Expected O, but got Unknown
		//IL_04f3: Unknown result type (might be due to invalid IL or missing references)
		//IL_04fa: Expected O, but got Unknown
		//IL_06ce: Unknown result type (might be due to invalid IL or missing references)
		//IL_06d5: Expected O, but got Unknown
		//IL_0815: Unknown result type (might be due to invalid IL or missing references)
		//IL_081c: Expected O, but got Unknown
		//IL_0918: Unknown result type (might be due to invalid IL or missing references)
		//IL_091f: Expected O, but got Unknown
		//IL_0a1a: Unknown result type (might be due to invalid IL or missing references)
		//IL_0a21: Expected O, but got Unknown
		//IL_0aa2: Unknown result type (might be due to invalid IL or missing references)
		//IL_0aac: Expected O, but got Unknown
		//IL_0aad: Unknown result type (might be due to invalid IL or missing references)
		//IL_0ab4: Expected O, but got Unknown
		((Control)this).Text = Variables.WindowTitle;
		((Form)this).Size = new Size(UITheme.Scale(840), UITheme.Scale(670));
		((Control)this).MinimumSize = new Size(UITheme.Scale(720), UITheme.Scale(560));
		((Form)this).StartPosition = (FormStartPosition)1;
		((Control)this).BackColor = UITheme.BgDark;
		((Control)this).ForeColor = UITheme.TextPrimary;
		try
		{
			((Form)this).Icon = Icon.ExtractAssociatedIcon(Application.ExecutablePath);
		}
		catch
		{
		}
		base.SetStyle((ControlStyles)139266, true);
		int num = UITheme.Scale(24);
		Label val = new Label();
		((Control)val).Text = Variables.AppTitle;
		((Control)val).Font = UITheme.FontDisplay;
		((Control)val).ForeColor = UITheme.TextPrimary;
		((Control)val).Location = new Point(num, UITheme.Scale(18));
		((Control)val).AutoSize = true;
		((Control)val).BackColor = Color.Transparent;
		_lblTitle = val;
		Label val2 = new Label();
		((Control)val2).Text = Variables.AuthorCredit;
		((Control)val2).Font = UITheme.FontSmallBold;
		((Control)val2).ForeColor = UITheme.HighlightTag;
		((Control)val2).BackColor = Color.FromArgb(140, 24, 28, 44);
		((Control)val2).Location = new Point(((Control)_lblTitle).Right + UITheme.Scale(12), UITheme.Scale(21));
		((Control)val2).Padding = new Padding(UITheme.Scale(8), UITheme.Scale(3), UITheme.Scale(8), UITheme.Scale(3));
		((Control)val2).AutoSize = true;
		_lblDevBadge = val2;
		Label val3 = new Label();
		((Control)val3).Text = Variables.AppSubtitle;
		((Control)val3).Font = UITheme.FontSubtitle;
		((Control)val3).ForeColor = UITheme.TextMuted;
		((Control)val3).Location = new Point(num, UITheme.Scale(46));
		((Control)val3).AutoSize = true;
		((Control)val3).BackColor = Color.Transparent;
		_lblSubtitle = val3;
		int width = UITheme.Scale(125);
		int x = ((Control)this).Width - UITheme.Scale(310);
		GlassComboBox glassComboBox = new GlassComboBox();
		((Control)glassComboBox).Anchor = (AnchorStyles)9;
		((Control)glassComboBox).Location = new Point(x, UITheme.Scale(18));
		((Control)glassComboBox).Size = new Size(width, UITheme.Scale(28));
		((Control)glassComboBox).Font = UITheme.FontSmall;
		_cmbTheme = glassComboBox;
		((ComboBox)_cmbTheme).Items.AddRange(new object[5] { "Cyber Indigo", "Emerald Matrix", "Obsidian Crimson", "Sapphire Ice", "Amethyst Sunset" });
		((ListControl)_cmbTheme).SelectedIndex = (int)UITheme.CurrentTheme;
		((ComboBox)_cmbTheme).SelectedIndexChanged += delegate
		{
			if (((ListControl)_cmbTheme).SelectedIndex >= 0)
			{
				UITheme.ApplyTheme((ThemePreset)((ListControl)_cmbTheme).SelectedIndex);
			}
		};
		Label val4 = new Label();
		((Control)val4).Text = Variables.ThemeLabel;
		((Control)val4).Font = UITheme.FontSmallBold;
		((Control)val4).ForeColor = UITheme.TextMuted;
		((Control)val4).Anchor = (AnchorStyles)9;
		((Control)val4).AutoSize = true;
		((Control)val4).BackColor = Color.Transparent;
		_lblThemeTag = val4;
		((Control)_lblThemeTag).Location = new Point(((Control)_cmbTheme).Left - _lblThemeTag.PreferredWidth - UITheme.Scale(8), UITheme.Scale(22));
		Label val5 = new Label();
		((Control)val5).Text = Variables.CrlBadgeOnline;
		((Control)val5).Font = UITheme.FontSmallBold;
		((Control)val5).ForeColor = UITheme.StatusAmber;
		((Control)val5).Anchor = (AnchorStyles)9;
		((Control)val5).Location = new Point(((Control)this).Width - UITheme.Scale(170), UITheme.Scale(22));
		((Control)val5).AutoSize = true;
		((Control)val5).BackColor = Color.Transparent;
		_lblCrlStatus = val5;
		Label val6 = new Label();
		((Control)val6).Text = Variables.ReplayBadgeOnline;
		((Control)val6).Font = UITheme.FontSmallBold;
		((Control)val6).ForeColor = UITheme.StatusAmber;
		((Control)val6).Anchor = (AnchorStyles)9;
		((Control)val6).Location = new Point(((Control)this).Width - UITheme.Scale(85), UITheme.Scale(22));
		((Control)val6).AutoSize = true;
		((Control)val6).BackColor = Color.Transparent;
		_lblReplayStatus = val6;
		((Control)this).Controls.Add((Control)(object)_lblTitle);
		((Control)this).Controls.Add((Control)(object)_lblDevBadge);
		((Control)this).Controls.Add((Control)(object)_lblSubtitle);
		((Control)this).Controls.Add((Control)(object)_lblThemeTag);
		((Control)this).Controls.Add((Control)(object)_cmbTheme);
		((Control)this).Controls.Add((Control)(object)_lblCrlStatus);
		((Control)this).Controls.Add((Control)(object)_lblReplayStatus);
		int width2 = ((Control)this).Width - num * 2 - UITheme.Scale(16);
		GlassCard glassCard = new GlassCard();
		((Control)glassCard).Location = new Point(num, UITheme.Scale(76));
		((Control)glassCard).Size = new Size(width2, UITheme.Scale(114));
		((Control)glassCard).Anchor = (AnchorStyles)13;
		glassCard.BorderRadius = 14;
		_cardProcess = glassCard;
		Label val7 = new Label();
		((Control)val7).Text = Variables.ProcessSectionHeader;
		((Control)val7).Font = UITheme.FontSmallBold;
		((Control)val7).ForeColor = UITheme.HighlightTag;
		((Control)val7).Location = new Point(UITheme.Scale(16), UITheme.Scale(14));
		((Control)val7).AutoSize = true;
		((Control)val7).BackColor = Color.Transparent;
		_lblProcessHeader = val7;
		int num2 = UITheme.Scale(96);
		int num3 = UITheme.Scale(104);
		int height = UITheme.Scale(34);
		int num4 = UITheme.Scale(10);
		GlassButton glassButton = new GlassButton();
		((Control)glassButton).Text = Variables.BtnInjectText;
		((Control)glassButton).Anchor = (AnchorStyles)9;
		((Control)glassButton).Location = new Point(((Control)_cardProcess).Width - num3 - UITheme.Scale(16), UITheme.Scale(36));
		((Control)glassButton).Size = new Size(num3, height);
		glassButton.IsAccent = true;
		glassButton.BorderRadius = 8;
		_btnInject = glassButton;
		((Control)_btnInject).Click += delegate
		{
			OnInjectClicked();
		};
		GlassButton glassButton2 = new GlassButton();
		((Control)glassButton2).Text = Variables.BtnScanText;
		((Control)glassButton2).Anchor = (AnchorStyles)9;
		((Control)glassButton2).Location = new Point(((Control)_btnInject).Left - num2 - num4, UITheme.Scale(36));
		((Control)glassButton2).Size = new Size(num2, height);
		glassButton2.IsAccent = false;
		glassButton2.BorderRadius = 8;
		_btnRefresh = glassButton2;
		((Control)_btnRefresh).Click += delegate
		{
			RefreshProcesses();
		};
		GlassComboBox glassComboBox2 = new GlassComboBox();
		((Control)glassComboBox2).Location = new Point(UITheme.Scale(16), UITheme.Scale(36));
		((Control)glassComboBox2).Size = new Size(((Control)_btnRefresh).Left - UITheme.Scale(26), height);
		((Control)glassComboBox2).Anchor = (AnchorStyles)13;
		_cmbProcesses = glassComboBox2;
		Label val8 = new Label();
		((Control)val8).Text = Variables.StatusScanning;
		((Control)val8).Font = UITheme.FontSmall;
		((Control)val8).ForeColor = UITheme.TextMuted;
		((Control)val8).Location = new Point(UITheme.Scale(16), UITheme.Scale(80));
		((Control)val8).AutoSize = true;
		((Control)val8).BackColor = Color.Transparent;
		_lblProcessStatus = val8;
		((Control)_cardProcess).Controls.Add((Control)(object)_lblProcessHeader);
		((Control)_cardProcess).Controls.Add((Control)(object)_cmbProcesses);
		((Control)_cardProcess).Controls.Add((Control)(object)_btnRefresh);
		((Control)_cardProcess).Controls.Add((Control)(object)_btnInject);
		((Control)_cardProcess).Controls.Add((Control)(object)_lblProcessStatus);
		((Control)this).Controls.Add((Control)(object)_cardProcess);
		int num5 = ((Control)_cardProcess).Bottom + UITheme.Scale(14);
		int height2 = ((Control)this).Height - num5 - UITheme.Scale(70);
		GlassCard glassCard2 = new GlassCard();
		((Control)glassCard2).Location = new Point(num, num5);
		((Control)glassCard2).Size = new Size(width2, height2);
		((Control)glassCard2).Anchor = (AnchorStyles)15;
		glassCard2.BorderRadius = 14;
		_cardLogs = glassCard2;
		Label val9 = new Label();
		((Control)val9).Text = Variables.LogSectionHeader;
		((Control)val9).Font = UITheme.FontSmallBold;
		((Control)val9).ForeColor = UITheme.TextMuted;
		((Control)val9).Location = new Point(UITheme.Scale(16), UITheme.Scale(12));
		((Control)val9).AutoSize = true;
		((Control)val9).BackColor = Color.Transparent;
		_lblLogHeader = val9;
		int num6 = UITheme.Scale(84);
		int height3 = UITheme.Scale(26);
		GlassButton glassButton3 = new GlassButton();
		((Control)glassButton3).Text = Variables.BtnClearLogText;
		((Control)glassButton3).Location = new Point(((Control)_cardLogs).Width - num6 - UITheme.Scale(16), UITheme.Scale(10));
		((Control)glassButton3).Size = new Size(num6, height3);
		((Control)glassButton3).Anchor = (AnchorStyles)9;
		glassButton3.IsAccent = false;
		((Control)glassButton3).Font = UITheme.FontSmall;
		glassButton3.BorderRadius = 6;
		_btnClearLog = glassButton3;
		((Control)_btnClearLog).Click += delegate
		{
			((TextBoxBase)_rtbLog).Clear();
		};
		RichTextBox val10 = new RichTextBox();
		((Control)val10).Location = new Point(UITheme.Scale(16), UITheme.Scale(42));
		((Control)val10).Size = new Size(((Control)_cardLogs).Width - UITheme.Scale(32), ((Control)_cardLogs).Height - UITheme.Scale(56));
		((Control)val10).Anchor = (AnchorStyles)15;
		((Control)val10).BackColor = UITheme.ConsoleBg;
		((Control)val10).ForeColor = Color.FromArgb(226, 232, 240);
		((TextBoxBase)val10).BorderStyle = (BorderStyle)0;
		((Control)val10).Font = UITheme.FontMono;
		((TextBoxBase)val10).ReadOnly = true;
		val10.ScrollBars = (RichTextBoxScrollBars)2;
		_rtbLog = val10;
		((Control)_cardLogs).Controls.Add((Control)(object)_lblLogHeader);
		((Control)_cardLogs).Controls.Add((Control)(object)_btnClearLog);
		((Control)_cardLogs).Controls.Add((Control)(object)_rtbLog);
		((Control)this).Controls.Add((Control)(object)_cardLogs);
		Label val11 = new Label();
		((Control)val11).Text = Variables.FooterCredit;
		((Control)val11).Font = UITheme.FontSmall;
		((Control)val11).ForeColor = UITheme.TextFaint;
		((Control)val11).Dock = (DockStyle)2;
		((Control)val11).Height = UITheme.Scale(28);
		val11.TextAlign = (ContentAlignment)32;
		((Control)val11).BackColor = Color.Transparent;
		_lblFooter = val11;
		((Control)this).Controls.Add((Control)(object)_lblFooter);
		((Form)this).Load += OnMainFormLoad;
		((Form)this).FormClosing += new FormClosingEventHandler(OnMainFormClosing);
		System.Windows.Forms.Timer val12 = new System.Windows.Forms.Timer();
		val12.Interval = 2500;
		_processScanTimer = val12;
		_processScanTimer.Tick += delegate
		{
			if (((ComboBox)_cmbProcesses).Items.Count == 0)
			{
				RefreshProcesses(silent: true);
			}
		};
	}

	private void OnThemeChanged()
	{
		if (((Control)this).InvokeRequired)
		{
			((Control)this).Invoke((Delegate)new Action(OnThemeChanged));
			return;
		}
		((Control)this).BackColor = UITheme.BgDark;
		((Control)_lblDevBadge).ForeColor = UITheme.HighlightTag;
		((Control)_lblProcessHeader).ForeColor = UITheme.HighlightTag;
		if (_cardProcess != null)
		{
			((Control)_cardProcess).BackColor = UITheme.CardBgSolid;
		}
		if (_cardLogs != null)
		{
			((Control)_cardLogs).BackColor = UITheme.CardBgSolid;
		}
		if (_btnInject != null)
		{
			((Control)_btnInject).BackColor = UITheme.CardBgSolid;
		}
		if (_btnRefresh != null)
		{
			((Control)_btnRefresh).BackColor = UITheme.CardBgSolid;
		}
		if (_btnClearLog != null)
		{
			((Control)_btnClearLog).BackColor = UITheme.CardBgSolid;
		}
		if (_cmbProcesses != null)
		{
			((Control)_cmbProcesses).BackColor = UITheme.CardBgSolid;
		}
		((Control)this).Invalidate(true);
	}

	protected override void OnPaint(PaintEventArgs e)
	{
		base.OnPaint(e);
		UITheme.PaintGlassBackground(e.Graphics, ((Control)this).ClientRectangle);
	}

	private void OnMainFormLoad(object sender, EventArgs e)
	{
		AppendLog(Variables.LogStartup, Color.FromArgb(96, 165, 250));
		ThreadPool.QueueUserWorkItem(delegate
		{
			try
			{
				CertManager.EnsureRootCaTrusted(AppendLog);
				try
				{
					_crlServer = new CrlServer(8081, AppendLog);
					_crlServer.Start();
					if (((Control)this).IsHandleCreated)
					{
						((Control)this).Invoke((Delegate)(Action)delegate
						{
							if (_crlServer.IsRunning)
							{
								((Control)_lblCrlStatus).Text = Variables.CrlBadgeOnline;
								((Control)_lblCrlStatus).ForeColor = UITheme.StatusGreen;
							}
							else
							{
								((Control)_lblCrlStatus).Text = Variables.CrlBadgeOffline;
								((Control)_lblCrlStatus).ForeColor = UITheme.StatusRed;
							}
						});
					}
				}
				catch (Exception ex)
				{
					AppendLog(string.Format(Variables.LogCrlStartFailed, 8081, ex.Message), UITheme.StatusRed);
				}
				try
				{
					_replayServer = new ReplayServer(443, AppendLog);
					_replayServer.Start();
					if (((Control)this).IsHandleCreated)
					{
						((Control)this).Invoke((Delegate)(Action)delegate
						{
							if (_replayServer.IsRunning)
							{
								((Control)_lblReplayStatus).Text = Variables.ReplayBadgeOnline;
								((Control)_lblReplayStatus).ForeColor = UITheme.StatusGreen;
							}
							else
							{
								((Control)_lblReplayStatus).Text = Variables.ReplayBadgeOffline;
								((Control)_lblReplayStatus).ForeColor = UITheme.StatusRed;
							}
						});
					}
				}
				catch (Exception ex2)
				{
					AppendLog(string.Format(Variables.LogReplayStartFailed, 443, ex2.Message), UITheme.StatusRed);
				}
				ProcessInjector.EnsureDllExtracted(AppendLog);
				if (((Control)this).IsHandleCreated)
				{
					((Control)this).Invoke((Delegate)(Action)delegate
					{
						RefreshProcesses();
						if (_processScanTimer != null)
						{
							_processScanTimer.Start();
						}
					});
				}
			}
			catch (Exception ex3)
			{
				AppendLog("[!] Initialization error: " + ex3.Message, UITheme.StatusRed);
			}
		});
	}

	private void OnMainFormClosing(object sender, FormClosingEventArgs e)
	{
		if (_processScanTimer != null)
		{
			_processScanTimer.Stop();
			((Component)(object)_processScanTimer).Dispose();
		}
		if (_crlServer != null)
		{
			_crlServer.Stop();
		}
		if (_replayServer != null)
		{
			_replayServer.Stop();
		}
	}

	private void RefreshProcesses(bool silent = false)
	{
		int num = -1;
		if (((ComboBox)_cmbProcesses).SelectedItem is ProcessItem)
		{
			num = ((ProcessItem)((ComboBox)_cmbProcesses).SelectedItem).Pid;
		}
		List<ProcessItem> runningJavaProcesses = ProcessInjector.GetRunningJavaProcesses();
		((ComboBox)_cmbProcesses).Items.Clear();
		int num2 = -1;
		for (int i = 0; i < runningJavaProcesses.Count; i++)
		{
			((ComboBox)_cmbProcesses).Items.Add((object)runningJavaProcesses[i]);
			if (runningJavaProcesses[i].Pid == num)
			{
				num2 = i;
			}
		}
		if (num2 >= 0)
		{
			((ListControl)_cmbProcesses).SelectedIndex = num2;
		}
		else if (((ComboBox)_cmbProcesses).Items.Count > 0)
		{
			((ListControl)_cmbProcesses).SelectedIndex = 0;
		}
		if (!silent)
		{
			if (runningJavaProcesses.Count > 0)
			{
				((Control)_lblProcessStatus).Text = string.Format(Variables.StatusFoundProcesses, runningJavaProcesses.Count);
				((Control)_lblProcessStatus).ForeColor = UITheme.StatusGreen;
				AppendLog(string.Format(Variables.LogFoundProcesses, runningJavaProcesses.Count), UITheme.TextMuted);
			}
			else
			{
				((Control)_lblProcessStatus).Text = Variables.StatusNoProcesses;
				((Control)_lblProcessStatus).ForeColor = UITheme.StatusAmber;
			}
		}
	}

	private void OnInjectClicked()
	{
		//IL_0038: Unknown result type (might be due to invalid IL or missing references)
		ProcessItem selected = ((ComboBox)_cmbProcesses).SelectedItem as ProcessItem;
		if (selected == null)
		{
			MessageBox.Show(Variables.MsgNoProcessSelectedBody, Variables.MsgNoProcessSelectedTitle, (MessageBoxButtons)0, (MessageBoxIcon)48);
			return;
		}
		((Control)_btnInject).Enabled = false;
		((Control)_lblProcessStatus).Text = string.Format(Variables.StatusInjecting, selected.Pid, selected.ProcessName);
		((Control)_lblProcessStatus).ForeColor = UITheme.HighlightTag;
		ThreadPool.QueueUserWorkItem(delegate
		{
			bool success = ProcessInjector.Inject(selected.Pid, AppendLog);
			((Control)this).Invoke((Delegate)(Action)delegate
			{
				((Control)_btnInject).Enabled = true;
				if (success)
				{
					((Control)_lblProcessStatus).Text = string.Format(Variables.StatusInjectSuccess, selected.Pid);
					((Control)_lblProcessStatus).ForeColor = UITheme.StatusGreen;
				}
				else
				{
					((Control)_lblProcessStatus).Text = string.Format(Variables.StatusInjectFailed, selected.Pid);
					((Control)_lblProcessStatus).ForeColor = UITheme.StatusRed;
				}
			});
		});
	}

	public void AppendLog(string message)
	{
		Color color = UITheme.TextPrimary;
		if (message.StartsWith("[+]"))
		{
			color = UITheme.StatusGreen;
		}
		else if (message.StartsWith("[*]"))
		{
			color = UITheme.HighlightTag;
		}
		else if (message.StartsWith("[!]"))
		{
			color = UITheme.StatusRed;
		}
		else if (message.StartsWith("[CRL]"))
		{
			color = UITheme.StatusAmber;
		}
		else if (message.StartsWith("[CFG]"))
		{
			color = Color.FromArgb(192, 132, 252);
		}
		else if (message.StartsWith("[SERVE]"))
		{
			color = UITheme.StatusGreen;
		}
		else if (message.StartsWith("[MISS]"))
		{
			color = UITheme.StatusAmber;
		}
		AppendLog(message, color);
	}

	public void AppendLog(string message, Color color)
	{
		if (((Control)this).InvokeRequired)
		{
			try
			{
				((Control)this).Invoke((Delegate)(Action)delegate
				{
					AppendLog(message, color);
				});
				return;
			}
			catch
			{
				return;
			}
		}
		string text = DateTime.Now.ToString("HH:mm:ss.ff");
		((TextBoxBase)_rtbLog).SelectionStart = ((TextBoxBase)_rtbLog).TextLength;
		((TextBoxBase)_rtbLog).SelectionLength = 0;
		_rtbLog.SelectionColor = Color.FromArgb(100, 116, 139);
		((TextBoxBase)_rtbLog).AppendText(text + " ");
		_rtbLog.SelectionColor = color;
		((TextBoxBase)_rtbLog).AppendText(message + "\n");
		((TextBoxBase)_rtbLog).SelectionStart = ((TextBoxBase)_rtbLog).TextLength;
		((TextBoxBase)_rtbLog).ScrollToCaret();
	}
}
