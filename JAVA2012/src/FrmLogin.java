//课堂案例3-创建用户登录窗口
import javax.swing.*;
import java.awt.*;



public class FrmLogin extends JFrame{

	/**
	 * 
	 */
	/**
	 * @param args
	 */
	JPanel pnlLogin;
	JButton btnLogin,btnExit;
	JLabel lblUserName,lblPassword,lblLogo;
	JTextField txtUserName;
	JPasswordField pwdPassword;
	Dimension dsSize;
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	public FrmLogin()
	{
		super("欢迎进入");
		pnlLogin = new JPanel();
		this.getContentPane().add(pnlLogin);
		lblUserName = new JLabel("用户名(U)");
		lblPassword = new JLabel("口令(P)");
		txtUserName = new JTextField(20);
		pwdPassword = new JPasswordField(20);
		btnLogin = new JButton("登录(L)");
		btnLogin.setToolTipText("登录到服务器");
		btnLogin.setMnemonic('L');
		btnExit = new JButton("退出(X)");
		btnExit.setToolTipText("退出系统");
		btnExit.setMnemonic('X');
		Font fontstr = new Font("宋体",Font.PLAIN,12);
		lblUserName.setFont(fontstr);
		txtUserName.setFont(fontstr);
		lblPassword.setFont(fontstr);
		pwdPassword.setFont(fontstr);
		btnLogin.setFont(fontstr);
		btnExit.setFont(fontstr);
		lblUserName.setForeground(Color.BLACK);
		lblPassword.setForeground(Color.BLACK);
		btnLogin.setBackground(Color.ORANGE);
		btnExit.setBackground(Color.ORANGE);
		Icon logol = new ImageIcon("loginlogo.jpg");
		lblLogo = new JLabel(logol);
		pnlLogin.add(lblLogo);
		pnlLogin.add(lblUserName);
		pnlLogin.add(txtUserName);
		pnlLogin.add(lblPassword);
		pnlLogin.add(pwdPassword);
		pnlLogin.add(btnLogin);
		pnlLogin.add(btnExit);
		setResizable(false);
		setSize(260,200);
		setVisible(true);
		dsSize = toolkit.getScreenSize();
		setLocation(dsSize.width/2-this.getWidth()/2,
				dsSize.height/2-this.getHeight()/2);
		Image img = toolkit.getImage("appico.jpg");
		setIconImage(img);
		
		
	
	}
	public static void main(String[] args) {
		
		new FrmLogin();
	}

}

