//课堂案例——实现组件布局
import java.awt.*;
import javax.swing.*;
public class LayoutDemo extends JFrame {
	JButton btnFirst,btnSecond,btnThird,btnFourth,btnFifth;
	JPanel pnlMain;
	FlowLayout flMain;
	GridLayout glMain;
	BorderLayout blMain;
	CardLayout clMain;
	public LayoutDemo(){
		super("布局演示");
		pnlMain = new JPanel();
		flMain = new FlowLayout(FlowLayout.LEFT);
		glMain = new GridLayout(3,2);
		blMain = new BorderLayout();
		clMain = new CardLayout(10,10);
//		pnlMain.setLayout(flMain);
		pnlMain.setLayout(glMain);
//		pnlMain.setLayout(blMain);
//		pnlMian.setLayout(clMain);
		getContentPane().add(pnlMain);
		btnFirst = new JButton("按钮1");
		btnSecond = new JButton("按钮2");
		btnThird= new JButton("按钮3");
		btnFourth = new JButton("按钮4");
		btnFifth = new JButton("按钮5");
		pnlMain.add(btnFirst);
		pnlMain.add(btnSecond);
		pnlMain.add(btnThird);
		pnlMain.add(btnFourth);
		pnlMain.add(btnFifth);
//		pnlMain.add(btnFirst,"West");
//		pnlMain.add(btnSecond,"North");
//		pnlMain.add("East",btnThird);
//		pnlMain.add(btnFourth,BorderLayout.SOUTH);
//		pnlMain.add(BorderLayout.CENTRE,btnFifth);
		setSize(250,150);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LayoutDemo();
	}

}
