//课堂案例1-创建程序主窗口

import javax.swing.*;
import java.awt.*;
public class FrmMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frm = new JFrame();
		JPanel pnlLeft = new JPanel();
		pnlLeft.setBackground(Color.WHITE);
		JPanel pnlRight = new JPanel();
		pnlRight.setBackground(Color.GRAY);
		JPanel pnlMain = new JPanel();
		pnlMain.setBackground(Color.CYAN);
		frm.setContentPane(pnlMain);
		pnlMain.add(pnlLeft);
		pnlMain.add(pnlRight);
		frm.setTitle("使用面板分割框架");
		frm.setSize(250,150);
		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
