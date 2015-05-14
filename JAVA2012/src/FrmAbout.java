//课堂案例2-创建程序“”
import javax.swing.*;

@SuppressWarnings("serial")
public class FrmAbout extends JFrame {

	/**
	 * @param args
	 */
	JLabel lblText,lblLogo;
	JButton btnSysinfo,btnExit;
	JPanel pnlMain;
	public FrmAbout()
	{
		lblText = new JLabel("Happy 聊天室v1.1 Copyright2007-2010");
		lblLogo = new JLabel(new ImageIcon("logo.gif"));
		btnSysinfo = new JButton("系统信息(S)");
		btnSysinfo.setMnemonic('S');
		btnExit = new JButton("退出",new ImageIcon("exit.gif"));
		pnlMain = new JPanel();
		pnlMain.add(lblText);
		pnlMain.add(lblLogo);
		pnlMain.add(btnSysinfo);
		pnlMain.add(btnExit);
		this.setContentPane(pnlMain);
		setSize(250,200);
		setTitle("关于……");
		setVisible(true);
		setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FrmAbout();
	}

}
