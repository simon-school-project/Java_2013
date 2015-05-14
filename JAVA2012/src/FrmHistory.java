//课堂案例9——查看用户登录信息
import javax.swing.*;
import java.awt.*;
public class FrmHistory extends JFrame {
	final String[] strColumn = {"编号","用户名","登录IP","登录时间"};
	final Object[][] objData={
			{new Integer(1),"liuzc","61.187.98.4","2010-1-18"},
			{new Integer(2),"ningyz","214.11.12.24","2010-1-18"},
			{new Integer(3),"liuj","61.287.98.9","2010-1-18"},
			{new Integer(4),"wangym","212.184.12.6","2010-1-19"},
			{new Integer(5),"zhaoar","192.168.0.12","2010-2-18"},
			{new Integer(6),"liux","200.168.12.34","2010-2-18"},
			{new Integer(7),"liux","200.168.12.34","2010-2-21"},
			{new Integer(8),"liufz","192.168.0.8","2010-2-22"}
	};
	public FrmHistory() {
		// TODO Auto-generated constructor stub
		super("用户登录信息");
		JTable tblHistory = new JTable(objData,strColumn);
		JScrollPane scrollpane = new JScrollPane(tblHistory);
		getContentPane().add(scrollpane,BorderLayout.CENTER);
		setSize(400,150);
		setVisible(true);
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FrmHistory();
	}

}
