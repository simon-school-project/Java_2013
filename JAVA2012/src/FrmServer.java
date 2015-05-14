//���ð���8�������Ƴ���������

import javax.swing.*;
import java.awt.*;

public class FrmServer extends JFrame {
	JMenuBar mbMain;
	JMenu mnuServer,mnuHelp;
	JMenuItem mnuiStart,mnuiStop,mnuiExit,mnuiContent,mnuiIndex,mnuiAbout;
	JToolBar tbMain;
	public FrmServer() {
		super("Happy���������");
		mbMain = new JMenuBar();
		mnuServer = new JMenu("������(S)");
		mnuHelp = new JMenu("����(H)");
		mnuServer.setMnemonic('S');
		mbMain.add(mnuServer);
		mbMain.add(mnuHelp);
		mnuiStart = new JMenuItem("����");
		mnuiStop = new JMenuItem("ֹͣ");
		mnuiExit = new JMenuItem("�˳�");
		mnuServer.add(mnuiStart);
		mnuServer.addSeparator();
		mnuServer.add(mnuiStop);
		mnuServer.addSeparator();
		mnuServer.add(mnuiExit);
		Icon icnContent = new ImageIcon("help.gif");
		mnuiContent = new JMenuItem("Ŀ¼",icnContent);
		mnuiIndex = new JMenuItem("����");
		mnuiAbout = new JMenuItem("����[Happy;]����");
		mnuHelp.add(mnuiContent);
		mnuHelp.add(mnuiIndex);
		mnuHelp.add(mnuiAbout);
		setJMenuBar(mbMain);
		tbMain = new JToolBar();
		JButton btnNew = null;
		btnNew = makeButton("new","�½�һ���ļ�");
		tbMain.add(btnNew);
		JButton btnOpen = null;
		btnOpen = makeButton("open","��һ���ļ�");
		tbMain.add(btnOpen);
		JButton btnSave = null;
		btnSave = makeButton("save","����һ���ļ�");
		tbMain.add(btnSave);
		JPanel pnlMain = new JPanel(new BorderLayout());
		setContentPane(pnlMain);
		pnlMain.add(tbMain,BorderLayout.PAGE_START);
		setSize(250,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	JButton makeButton(String strImage,String txtToolTip){
		String strLocation = strImage+ ".gif";
		JButton btnTemp = new JButton();
		btnTemp.setToolTipText(txtToolTip);
		btnTemp.setIcon(new ImageIcon(strLocation));
		return btnTemp;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FrmServer();
	}

}
