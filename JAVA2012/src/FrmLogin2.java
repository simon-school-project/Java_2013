//课堂案例5——登录功能（动作事件）实现

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FrmLogin2 extends JFrame implements ActionListener{

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
	public FrmLogin2()
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
		btnLogin.addActionListener(this);//这两句为补充事件处理的程序代码
		btnExit.addActionListener(this);//
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
	//以下为补充事件处理的程序代码
	public void actionPerformed(ActionEvent ae){
			if(ae.getSource()==btnLogin){
				if((txtUserName.getText().equals("admin"))&&
						(pwdPassword.getText().equals("admin")))
					JOptionPane.showMessageDialog(null, "用户登陆成功");
				else
					JOptionPane.showMessageDialog(null, "用户名或者密码错误");
			}
			if(ae.getSource()==btnExit)
				System.exit(0);
		}
	//以结束	
	public static void main(String[] args) {
		
		new FrmLogin2();
	}

}

