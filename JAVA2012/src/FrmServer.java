//课堂案例8——完善程序主窗口

import javax.swing.*;
import java.awt.*;

public class FrmServer extends JFrame {
	JMenuBar mbMain;
	JMenu mnuServer,mnuHelp;
	JMenuItem mnuiStart,mnuiStop,mnuiExit,mnuiContent,mnuiIndex,mnuiAbout;
	JToolBar tbMain;
	public FrmServer() {
		super("Happy聊天服务器");
		mbMain = new JMenuBar();
		mnuServer = new JMenu("服务器(S)");
		mnuHelp = new JMenu("帮助(H)");
		mnuServer.setMnemonic('S');
		mbMain.add(mnuServer);
		mbMain.add(mnuHelp);
		mnuiStart = new JMenuItem("启动");
		mnuiStop = new JMenuItem("停止");
		mnuiExit = new JMenuItem("退出");
		mnuServer.add(mnuiStart);
		mnuServer.addSeparator();
		mnuServer.add(mnuiStop);
		mnuServer.addSeparator();
		mnuServer.add(mnuiExit);
		Icon icnContent = new ImageIcon("help.gif");
		mnuiContent = new JMenuItem("目录",icnContent);
		mnuiIndex = new JMenuItem("索引");
		mnuiAbout = new JMenuItem("关于[Happy;]……");
		mnuHelp.add(mnuiContent);
		mnuHelp.add(mnuiIndex);
		mnuHelp.add(mnuiAbout);
		setJMenuBar(mbMain);
		tbMain = new JToolBar();
		JButton btnNew = null;
		btnNew = makeButton("new","新建一个文件");
		tbMain.add(btnNew);
		JButton btnOpen = null;
		btnOpen = makeButton("open","打开一个文件");
		tbMain.add(btnOpen);
		JButton btnSave = null;
		btnSave = makeButton("save","保存一个文件");
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
