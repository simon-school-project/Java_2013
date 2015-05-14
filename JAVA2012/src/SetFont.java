import javax.swing.*;
import java.awt.*;
public class SetFont extends JFrame {
	JPanel pnlMain;
	JLabel lblSize,lblType,lblTest;
	JRadioButton rbtnRed,rbtnGreen;
	JCheckBox chkBold,chkItalic;
	JButton btnExit;
	ButtonGroup grpColor;
	List lstSize;
	JComboBox cmbType;
	String[]strType = {"宋体","隶书","楷体_GB2312","仿宋_GB2312"};
	
	public SetFont() {
	super("字体设置器");
	lblType = new JLabel("请选择字体");
	lblSize = new JLabel("请选择字形");
	lstSize = new List();
	for(int i=10; i<30; i+=2)
		lstSize.add(String.valueOf(i));
	lstSize.select(0);
	cmbType = new JComboBox(strType);
	cmbType.setSelectedIndex(0);
	grpColor = new ButtonGroup();
	rbtnRed = new JRadioButton("红色");
	grpColor.add(rbtnRed);
	rbtnRed.setSelected(true);
	rbtnGreen = new JRadioButton("绿色");
	grpColor.add(rbtnGreen);
	chkBold = new JCheckBox("加粗");
	chkItalic = new JCheckBox("倾斜");
	lblTest = new JLabel("这是测试文字");
	lblTest.setBorder(BorderFactory.createBevelBorder(1));
	btnExit = new JButton("退出");
	pnlMain = new JPanel();
	pnlMain.add(lblType);
	pnlMain.add(cmbType);
	pnlMain.add(lblSize);
	pnlMain.add(lstSize);
	pnlMain.add(rbtnRed);
	pnlMain.add(rbtnGreen);
	pnlMain.add(chkBold);
	pnlMain.add(chkItalic);
	pnlMain.add(lblTest);
	pnlMain.add(btnExit);
	this.setContentPane(pnlMain);
	setSize(250,200);
	setVisible(true);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SetFont();
	}

}
