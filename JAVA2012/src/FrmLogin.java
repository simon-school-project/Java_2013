//���ð���3-�����û���¼����
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
		super("��ӭ����");
		pnlLogin = new JPanel();
		this.getContentPane().add(pnlLogin);
		lblUserName = new JLabel("�û���(U)");
		lblPassword = new JLabel("����(P)");
		txtUserName = new JTextField(20);
		pwdPassword = new JPasswordField(20);
		btnLogin = new JButton("��¼(L)");
		btnLogin.setToolTipText("��¼��������");
		btnLogin.setMnemonic('L');
		btnExit = new JButton("�˳�(X)");
		btnExit.setToolTipText("�˳�ϵͳ");
		btnExit.setMnemonic('X');
		Font fontstr = new Font("����",Font.PLAIN,12);
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

