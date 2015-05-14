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
	String[]strType = {"����","����","����_GB2312","����_GB2312"};
	
	public SetFont() {
	super("����������");
	lblType = new JLabel("��ѡ������");
	lblSize = new JLabel("��ѡ������");
	lstSize = new List();
	for(int i=10; i<30; i+=2)
		lstSize.add(String.valueOf(i));
	lstSize.select(0);
	cmbType = new JComboBox(strType);
	cmbType.setSelectedIndex(0);
	grpColor = new ButtonGroup();
	rbtnRed = new JRadioButton("��ɫ");
	grpColor.add(rbtnRed);
	rbtnRed.setSelected(true);
	rbtnGreen = new JRadioButton("��ɫ");
	grpColor.add(rbtnGreen);
	chkBold = new JCheckBox("�Ӵ�");
	chkItalic = new JCheckBox("��б");
	lblTest = new JLabel("���ǲ�������");
	lblTest.setBorder(BorderFactory.createBevelBorder(1));
	btnExit = new JButton("�˳�");
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
