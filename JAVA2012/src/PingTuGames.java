
/*
* JAVAС��Ϸ��ƴͼ �����ĵ�һ��С��Ϸ
* Cell���Ǽ̳еİ�ť�࣬��������Ӧͼ�Σ��γɷ���
*MyCanvas��һ����壬����Cell��Ķ��󣨷��񣩣������������еĺ���
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
JPanel panelNorth,panelPreview;//�����Ϸ�����壬��Ԥ����������
Button start,preview,set;//���忪ʼ��Ԥ�����趨��ť
Container container;//�������õ��������
public PingTuGames() {//��ʹ��
container=this.getContentPane();
start=new Button("��ʼ");
start.addActionListener(this);
preview=new Button("Ԥ��");
preview.addActionListener(this);
set = new Button("����");
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
this.setTitle("ƴͼС��Ϸ");
this.setLocation(300,200);
this.setSize(308,365);
this.setResizable(false);
this.setVisible(true);

this.setDefaultCloseOperation(3);
}
public static void main(String[] args) {
// TODO �Զ����ɷ������
new PingTuGames();

}
public void actionPerformed(ActionEvent arg0) {//��������ť�¼��Ĵ���
// TODO �Զ����ɷ������
Button button=(Button)arg0.getSource();
if(button==start){
myCanvas.Start();

}else if(button==preview){
if(button.getLabel()=="Ԥ��"){
container.remove(myCanvas);
container.add(panelPreview);
panelPreview.updateUI();
container.repaint();

button.setLabel("����");
}else{
container.remove(panelPreview);
container.add(myCanvas);
container.repaint();
button.setLabel("Ԥ��");
}
}else if(button==set){//�޸���ѡͼƬ
Choice pic = new Choice();
pic.add("Сè");
pic.add("С��");
pic.add("��");
pic.add("QQ");
pic.add("��ͨ");
pic.add("��");
int i=JOptionPane.showConfirmDialog(this, pic, "ѡ��ͼƬ", JOptionPane.OK_CANCEL_OPTION);
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
boolean hasAddActionListener=false;//���÷���Ķ����������ı�־λ��TRUEΪ�Ѿ�����϶����¼���FALSE����δ��Ӷ����¼�
Cell cell[];//���巽��
Rectangle cellNull;//����շ�������
public static int pictureID=1;//��ǰѡ���ͼƬ����
public MyCanvas() {
this.setLayout(null);
this.setSize(400,400);
cellNull=new Rectangle(200,200,100,100);//�շ��������ڵ�����ÿ����
cell=new Cell[9];
Icon icon;
for (int i = 0; i < 3; i++) {//Ϊ9���������ͼƬ������ʹ�����꣬�γ���������
for(int j=0;j<3;j++){
icon=new ImageIcon("pic_"+pictureID+"_"+(i*3+j+1)+".jpg");
cell[i*3+j]=new Cell(icon);
cell[i*3+j].setLocation(j*100,i*100);
this.add(cell[i*3+j]);
}
}
this.remove(cell[8]);//�Ƴ����һ������ķ���
}
public void reLoadPictrue(){//��ѡ������ͼ�ν���ƴͼʱ�������¼�����ͼƬ
Icon icon;
for (int i = 0; i < 3; i++) {
for(int j=0;j<3;j++){
icon=new ImageIcon("pic_"+pictureID+"_"+(i*3+j+1)+".jpg");
cell[i*3+j].setIcon(icon);
}
}
}
public boolean isFinish(){//�ж��Ƿ�ƴ�ϳɹ�
for(int i=0;i<8;i++){
int x=cell[i].getBounds().x;
int y=cell[i].getBounds().y;
if(y/100*3+x/100!=i)
return false;
}
return true;
}
public void Start(){//�Է�������������У�����˳��

while(cell[0].getBounds().x<=100&&cell[0].getBounds().y<=100){//����һ����������ϽǽϽ�ʱ
int x=cellNull.getBounds().x;
int y=cellNull.getBounds().y;
int direction=(int)(Math.random()*4);//����0-4����Ӧ�շ�������������ƶ�
if(direction==0){//�շ������ƶ�������෽�񻥻�λ�ã���෽�����ƶ�
x-=100;
if(test(x,y)){
for(int j=0;j<8;j++){
if((cell[j].getBounds().x==x)&&(cell[j].getBounds().y==y)){//����Ѱ�����İ�ť
cell[j].move("RIGHT",100);
cellNull.setLocation(x,y);
break;//�ҵ�������forѭ��
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

if(!hasAddActionListener)//�����δ��Ӷ����¼��������
for(int i=0;i<8;i++)//Ϊ�ڸ�������Ӷ����¼�������������ť�����ƶ���
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
public void mousePressed(MouseEvent arg0) {//���������¼�����Ϊ�õ���MyCanvas�е�һЩ���������û����Cell���д�������¼�
Cell button=(Cell)arg0.getSource();
int x1=button.getBounds().x;//�õ����������������
int y1=button.getBounds().y;

int x2=cellNull.getBounds().x;//�õ��շ��������
int y2=cellNull.getBounds().y;

if(x1==x2&&y1-y2==100)//���бȽϣ����������������н���
button.move("UP",100);
else if(x1==x2&&y1-y2==-100)
button.move("DOWN",100);
else if(x1-x2==100&y1==y2)
button.move("LEFT",100);
else if(x1-x2==-100&&y1==y2)
button.move("RIGHT",100);
else
return;//������Ͳ������κδ���

cellNull.setLocation(x1,y1);
this.repaint();
if(this.isFinish()){//�����Ƿ���ɵ��ж�
JOptionPane.showMessageDialog(this,"��ϲ�����ƴͼ,���ͣ�");
for(int i=0;i<8;i++)
cell[i].removeMouseListener(this);//�������ɣ���������¼�����굥��������������
hasAddActionListener=false;
}
}

}
class Cell extends JButton {
Cell(Icon icon){//ʵ��ΪICON
super(icon);
this.setSize(100,100);
}
public void move(String direction,int sleep){//������ƶ�
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