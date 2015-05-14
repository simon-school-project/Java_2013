import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Date;
import java.text.SimpleDateFormat;

  public class jisuanqi extends JFrame implements ActionListener
  {
 static MenuBar mb=new MenuBar();
 static Menu m1=new Menu("查看（V）");
 static Menu m2=new Menu("编辑(E)");
 static Menu m3=new Menu("帮助（H）");
 static MenuItem m11=new MenuItem("作者");
 static MenuItem m12=new MenuItem("退出");
 static MenuItem m21=new MenuItem("操作说明");
 static MenuItem m31=new MenuItem("联系方式");
 static String a = "";
 static String c,x,p;
 static double b,d;
 static jisuanqi frm = new jisuanqi();
 static JTextField lb1 = new JTextField(a);
 static JPanel lb2 = new JPanel();
 static JPanel lb3 = new JPanel();
 static JPanel lb5 = new JPanel();
 static JButton x1 = new JButton("1");
 static JButton x2 = new JButton("2");
 static JButton x3 = new JButton("3");
 static JButton x4 = new JButton("4");
 static JButton x5 = new JButton("5");
 static JButton x6 = new JButton("6");
 static JButton x7 = new JButton("7");
 static JButton x8 = new JButton("8");
 static JButton x9 = new JButton("9");
 static JButton x10 = new JButton("0");
 static JButton x11 = new JButton("+");
 static JButton x12 = new JButton("-");
 static JButton x13 = new JButton("*");
 static JButton x14 = new JButton("/");
 static JButton x15 = new JButton(".");
 static JButton x16 = new JButton("=");
 static JLabel  lb6 = new JLabel();
 static Date nowTime=new Date();
 static SimpleDateFormat time=new SimpleDateFormat("");
  static String Tim = time.format(nowTime);
 

static class ActLis implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   JButton btn = (JButton) e.getSource();
   if(btn==x1)
   {
    a=a+x1.getText();
    lb1.setText(a); 
   }
   
   if(btn==x2)
   {
    a=a+x2.getText();
    lb1.setText(a); 
   }
   
   if(btn==x3)
   {
    a=a+x3.getText();
    lb1.setText(a); 
   }
   
   if(btn==x4)
   {
    a=a+x4.getText();
    lb1.setText(a); 
   }
   
   if(btn==x5)
   {
    a=a+x5.getText();
    lb1.setText(a); 
   }
   
   if(btn==x6)
   {
    a=a+x6.getText();
    lb1.setText(a); 
   }
   
   if(btn==x7)
   {
    a=a+x7.getText();
    lb1.setText(a); 
   }
   
   if(btn==x8)
   {
    a=a+x8.getText();
    lb1.setText(a); 
   }
   
   if(btn==x9)
   {
    a=a+x9.getText();
    lb1.setText(a); 
   }
   
   if(btn==x10)
   {
    a=a+x10.getText();
    lb1.setText(a); 
   }
   
   if(btn==x11)
   {
    b=Double.parseDouble(a);
    c=x11.getText();
    a="";
    lb1.setText(a); 
   }
   
   if(btn==x12)
   {
    b=Double.parseDouble(a);
    c=x12.getText();
    a="";
    lb1.setText(a);
   }
   
   if(btn==x13)
   {
    b=Double.parseDouble(a);
    c=x13.getText();
    a="";
    lb1.setText(a);
   }
   
   if(btn==x14)
   {
    b=Double.parseDouble(a);
    c=x14.getText();
    a="";
    lb1.setText(a);
   }
   
   if(btn==x15)
   {
    b=Double.parseDouble(a);
    c=x15.getText();
    a="";
    lb1.setText(a);
   }
   
   if(btn==x16)
   {
    if(c=="+")
    {
     d=Double.parseDouble(a);
     x=Double.toString(b+d);
     lb1.setText(x);
     a=x;
    }
    if(c=="-")
    {
     d=Double.parseDouble(a);
     x=Double.toString(b-d);
     lb1.setText(x);
     a=x;
    }
    if(c=="*")
    {
     d=Double.parseDouble(a);
     x=Double.toString(b*d);
     lb1.setText(x);
     a=x;
    }
    if(c=="/")
    {
     d=Double.parseDouble(a);
     x=Double.toString(b/d);
     lb1.setText(x);
     a=x;
    }
   }
  

}
 }

 public static void main(String[] args) {
  GridLayout m = new GridLayout(4, 4, 5, 5);
  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//实现关闭窗体

  frm.setBounds(450, 180, 300, 460);
  frm.setLayout(null);
  lb2.setLayout(m);
  lb2.setBounds(23, 120, 250, 200);
  lb3.setLayout(null);
  lb3.setBounds(0, 0, 300, 100);
  lb5.setLayout(null);
  lb5.setBounds(0,320,300,110);

lb3.add(lb1);
  lb1.setBounds(24, 50, 247, 40);
  lb1.setHorizontalAlignment(JTextField.RIGHT);//swing中的右对齐

lb2.add(x1);
  lb2.add(x2);
  lb2.add(x3);
  lb2.add(x4);
  lb2.add(x5);
  lb2.add(x6);
  lb2.add(x7);
  lb2.add(x8);
  lb2.add(x9);
  lb2.add(x10);
  lb2.add(x11);
  lb2.add(x12);
  lb2.add(x13);
  lb2.add(x14);
  lb2.add(x15);
  lb2.add(x16);
  lb5.add(lb6);
  lb6.setBounds(200,76, 80, 20);
  lb6.setText(Tim);
  
  mb.add(m1);
  mb.add(m2);
  mb.add(m3);
  m1.add(m11);
  m1.add(m12);
  m2.add(m21);
  m3.add(m31);
  frm.setMenuBar(mb);
  frm.add(lb2);
  frm.add(lb3);
  frm.add(lb5);
  
  frm.setTitle("小计算器");
  frm.setVisible(true);
  frm.setResizable(false);

  x1.addActionListener(new ActLis());
  x2.addActionListener(new ActLis());
  x3.addActionListener(new ActLis());
  x4.addActionListener(new ActLis());
  x5.addActionListener(new ActLis());
  x6.addActionListener(new ActLis());
  x7.addActionListener(new ActLis());
  x8.addActionListener(new ActLis());
  x9.addActionListener(new ActLis());
  x10.addActionListener(new ActLis());
  x11.addActionListener(new ActLis());
  x12.addActionListener(new ActLis());
  x13.addActionListener(new ActLis());
  x14.addActionListener(new ActLis());
  x15.addActionListener(new ActLis());
  x16.addActionListener(new ActLis());
  m31.addActionListener(frm);

 }
 
 public void actionPerformed(ActionEvent e)
 {
   //jisuanqi frm1 = new jisuanqi();
   //JLabel xx=new JLabel("Email:****@yahoo.com");
   //xx.setHorizontalAlignment(JTextField.CENTER);
   //frm1.add(xx);
   //frm1.setVisible(true);
   //frm1.setBounds(500, 300, 190, 130);
   JOptionPane.showMessageDialog(this,"Email:****@yahoo.com","联系",JOptionPane.INFORMATION_MESSAGE);
  }

}