//���ð���5������¼���ܣ������¼���ʵ��

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
		btnLogin.addActionListener(this);//������Ϊ�����¼�����ĳ������
		btnExit.addActionListener(this);//
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
	//����Ϊ�����¼�����ĳ������
	public void actionPerformed(ActionEvent ae){
			if(ae.getSource()==btnLogin){
				if((txtUserName.getText().equals("admin"))&&
						(pwdPassword.getText().equals("admin")))
					JOptionPane.showMessageDialog(null, "�û���½�ɹ�");
				else
					JOptionPane.showMessageDialog(null, "�û��������������");
			}
			if(ae.getSource()==btnExit)
				System.exit(0);
		}
	//�Խ���	
	public static void main(String[] args) {
		
		new FrmLogin2();
	}

}

