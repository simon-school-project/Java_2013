
/*
* JAVA小游戏－拼图 我做的第一个小游戏
* Cell类是继承的按钮类，并加上相应图形，形成方格
*MyCanvas是一个面板，加载Cell类的对象（方格），是这三个类中的核心
*/
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Icon;
import javax.swing.JButton;
public class PingTuGames extends JFrame implements ActionListener {
MyCanvas myCanvas;
JPanel panelNorth,panelPreview;//定义上方的面板，及预览所需的面板
Button start,preview,set;//定义开始，预览，设定按钮
Container container;//容器，得到内容面板
public PingTuGames() {//初使化
container=this.getContentPane();
start=new Button("开始");
start.addActionListener(this);
preview=new Button("预览");
preview.addActionListener(this);
set = new Button("设置");
set.addActionListener(this);
panelPreview=new JPanel();
panelPreview.setLayout(null);
Icon icon=new ImageIcon("pic_"+MyCanvas.pictureID+".jpg");
JLabel label=new JLabel(icon);
label.setBounds(0,0,300,300);
panelPreview.add(label);


panelNorth=new JPanel();
panelNorth.setBackground(Color.red);
panelNorth.add(start);
panelNorth.add(preview);
panelNorth.add(set);
myCanvas=new MyCanvas();
container.add(myCanvas,BorderLayout.CENTER);
container.add(panelNorth,BorderLayout.NORTH);
this.setTitle("拼图小游戏");
this.setLocation(300,200);
this.setSize(308,365);
this.setResizable(false);
this.setVisible(true);

this.setDefaultCloseOperation(3);
}
public static void main(String[] args) {
// TODO 自动生成方法存根
new PingTuGames();

}
public void actionPerformed(ActionEvent arg0) {//对三个按钮事件的处理
// TODO 自动生成方法存根
Button button=(Button)arg0.getSource();
if(button==start){
myCanvas.Start();

}else if(button==preview){
if(button.getLabel()=="预览"){
container.remove(myCanvas);
container.add(panelPreview);
panelPreview.updateUI();
container.repaint();

button.setLabel("返回");
}else{
container.remove(panelPreview);
container.add(myCanvas);
container.repaint();
button.setLabel("预览");
}
}else if(button==set){//修改所选图片
Choice pic = new Choice();
pic.add("小猫");
pic.add("小猪");
pic.add("云");
pic.add("QQ");
pic.add("卡通");
pic.add("花");
int i=JOptionPane.showConfirmDialog(this, pic, "选择图片", JOptionPane.OK_CANCEL_OPTION);
if(i==JOptionPane.YES_OPTION){
MyCanvas.pictureID=pic.getSelectedIndex()+1;
myCanvas.reLoadPictrue();
Icon icon=new ImageIcon("pic_"+MyCanvas.pictureID+".jpg");
JLabel label=new JLabel(icon);
label.setBounds(0,0,300,300);
panelPreview.removeAll();
panelPreview.add(label);
panelPreview.repaint();
}
}
}
}
class MyCanvas extends JPanel implements MouseListener {
boolean hasAddActionListener=false;//设置方格的动作监听器的标志位，TRUE为已经添加上动作事件，FALSE是尚未添加动作事件
Cell cell[];//定义方格
Rectangle cellNull;//定义空方格区域
public static int pictureID=1;//当前选择的图片代号
public MyCanvas() {
this.setLayout(null);
this.setSize(400,400);
cellNull=new Rectangle(200,200,100,100);//空方格区域在第三行每三列
cell=new Cell[9];
Icon icon;
for (int i = 0; i < 3; i++) {//为9个方格加载图片，并初使化坐标，形成三行三列
for(int j=0;j<3;j++){
icon=new ImageIcon("pic_"+pictureID+"_"+(i*3+j+1)+".jpg");
cell[i*3+j]=new Cell(icon);
cell[i*3+j].setLocation(j*100,i*100);
this.add(cell[i*3+j]);
}
}
this.remove(cell[8]);//移除最后一个多余的方格
}
public void reLoadPictrue(){//当选择其它图形进行拼图时，需重新加载新图片
Icon icon;
for (int i = 0; i < 3; i++) {
for(int j=0;j<3;j++){
icon=new ImageIcon("pic_"+pictureID+"_"+(i*3+j+1)+".jpg");
cell[i*3+j].setIcon(icon);
}
}
}
public boolean isFinish(){//判断是否拼合成功
for(int i=0;i<8;i++){
int x=cell[i].getBounds().x;
int y=cell[i].getBounds().y;
if(y/100*3+x/100!=i)
return false;
}
return true;
}
public void Start(){//对方格进行重新排列，打乱顺序

while(cell[0].getBounds().x<=100&&cell[0].getBounds().y<=100){//当第一个方格距左上角较近时
int x=cellNull.getBounds().x;
int y=cellNull.getBounds().y;
int direction=(int)(Math.random()*4);//产生0-4，对应空方格的上下左右移动
if(direction==0){//空方格左移动，与左侧方格互换位置，左侧方格右移动
x-=100;
if(test(x,y)){
for(int j=0;j<8;j++){
if((cell[j].getBounds().x==x)&&(cell[j].getBounds().y==y)){//依次寻找左侧的按钮
cell[j].move("RIGHT",100);
cellNull.setLocation(x,y);
break;//找到后跳出for循环
}
}
}
}else if(direction==1){//RIGHT
x+=100;
if(test(x,y)){
for(int j=0;j<8;j++){
if((cell[j].getBounds().x==x)&&(cell[j].getBounds().y==y)){
cell[j].move("LEFT",100);
cellNull.setLocation(x,y);
break;
}
}
}
}else if(direction==2){//UP
y-=100;
if(test(x,y)){
for(int j=0;j<8;j++){
if((cell[j].getBounds().x==x)&&(cell[j].getBounds().y==y)){
cell[j].move("DOWN",100);
cellNull.setLocation(x,y);
break;
}
}
}
}else{//DOWN
y+=100;
if(test(x,y)){
for(int j=0;j<8;j++){
if((cell[j].getBounds().x==x)&&(cell[j].getBounds().y==y)){
cell[j].move("UP",100);
cellNull.setLocation(x,y);
break;
}
}
}
}

}

if(!hasAddActionListener)//如果尚未添加动作事件，则添加
for(int i=0;i<8;i++)//为第个方格添加动作事件，这样单击按钮就能移动了
cell[i].addMouseListener(this);
hasAddActionListener=true;
}
private boolean test(int x,int y){
if((x>=0&&x<=200)||(y>=0&&y<=200))
return true;
else
return false;
}
// public void paint(Graphics g){
// 
// for(int i=0;i<=300;i+=100)
// g.drawLine(0, i, 300, i);
// for(int i=0;i<=300;i+=100)
// g.drawLine(i, 0, i, 300);
// for(int i=0;i<8;i++)
// cell[i].repaint();
// }
public void mouseClicked(MouseEvent arg0) { }
public void mouseEntered(MouseEvent arg0) { }
public void mouseExited(MouseEvent arg0) { }
public void mouseReleased(MouseEvent arg0) { }
public void mousePressed(MouseEvent arg0) {//方格的鼠标事件，因为用到了MyCanvas中的一些方法，因此没有在Cell类中处理鼠标事件
Cell button=(Cell)arg0.getSource();
int x1=button.getBounds().x;//得到所单击方格的坐标
int y1=button.getBounds().y;

int x2=cellNull.getBounds().x;//得到空方格的坐标
int y2=cellNull.getBounds().y;

if(x1==x2&&y1-y2==100)//进行比较，如果满足条件则进行交换
button.move("UP",100);
else if(x1==x2&&y1-y2==-100)
button.move("DOWN",100);
else if(x1-x2==100&y1==y2)
button.move("LEFT",100);
else if(x1-x2==-100&&y1==y2)
button.move("RIGHT",100);
else
return;//不满足就不进行任何处理

cellNull.setLocation(x1,y1);
this.repaint();
if(this.isFinish()){//进行是否完成的判断
JOptionPane.showMessageDialog(this,"恭喜你完成拼图,加油！");
for(int i=0;i<8;i++)
cell[i].removeMouseListener(this);//如果已完成，撤消鼠标事件，鼠标单击方格不在起作用
hasAddActionListener=false;
}
}

}
class Cell extends JButton {
Cell(Icon icon){//实际为ICON
super(icon);
this.setSize(100,100);
}
public void move(String direction,int sleep){//方格的移动
if(direction=="UP"){
this.setLocation(this.getBounds().x,this.getBounds().y-100);
}else if(direction=="DOWN"){
this.setLocation(this.getBounds().x,this.getBounds().y+100);
}else if(direction=="LEFT"){
this.setLocation(this.getBounds().x-100,this.getBounds().y);
}else{
this.setLocation(this.getBounds().x+100,this.getBounds().y);
}
}
}