//���ð���6��������¼�����
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseEventDemo extends MouseMotionAdapter {
	JFrame frmMain;
	int intX,intY;
	JPanel pnlMain;
	JLabel lblX,lblY;
	JTextField txtX,txtY;
	GridLayout glMain;
	public MouseEventDemo() {
		// TODO Auto-generated constructor stub
		frmMain = new JFrame("����¼���ʾ");
		pnlMain = new JPanel();
		frmMain.getContentPane().add(pnlMain);
		glMain = new GridLayout(2,2);
		pnlMain.setLayout(glMain);
		lblX = new JLabel("��ǰ���X���꣺");
		lblY = new JLabel("��ǰ���Y���꣺");
		txtX = new JTextField(5);
		txtY = new JTextField(5);
		pnlMain.add(lblX);
		pnlMain.add(txtX);
		pnlMain.add(lblY);
		pnlMain.add(txtY);
		frmMain.addMouseMotionListener(this);
		frmMain.setSize(250,150);
		frmMain.setVisible(true);
		
	}
	public void mouseMoved(MouseEvent me){
		intX = me.getX();
		intY = me.getY();
		txtX.setText(String.valueOf(intX));
		txtY.setText(String.valueOf(intY));
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventDemo();
	}

}
