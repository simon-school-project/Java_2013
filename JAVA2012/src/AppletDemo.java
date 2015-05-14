//课堂案例10——第一个Applet程序
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AppletDemo extends JApplet {
	private JPanel panel;
	private JLabel lblPhoto;
	private JComboBox cmbSelect;
	private String sPhotoName[]={"pl.gif","p2.gif","p3.gif"};
	public void init(){
		panel = new JPanel();
		lblPhoto = new JLabel(new ImageIcon("pl.gif"));
		cmbSelect = new JComboBox(sPhotoName);
		cmbSelect.addActionListener(new ComboBoxListener());
		panel.add(lblPhoto);
		panel.add(cmbSelect);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER,30,18));
		getContentPane().add(panel);
	}
	/**
	 * @param args
	 */
	class ComboBoxListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			int iItem = cmbSelect.getSelectedIndex();
			lblPhoto.setIcon(new ImageIcon(sPhotoName[iItem]));
		}
	}
		// TODO Auto-generated method stub
}