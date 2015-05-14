package me.loveyous.xueyao.ui;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//用作显示的主窗体
public class MainFrame extends Frame implements KeyListener 
{
	JLabel lab_wolf;
	
	//设置一下窗口最基本的信息
	//构造方法
	public MainFrame()
	{
		/*由于添加图片组件的时候存在顺序，因此要根据需要调整
		 * 添加图片顺序
		 * 
		 * */
		
		//做笼子（目标位置）
		targetInit();
		
		//做人物
		wolfInit();
		
		//做箱子
		sheepInit();
		
		
		//做障碍
		treeInit();
		//背景初始化
		backgroundInit();
		
		
		//	设置整个窗体
		setMainFrameUI();
		//使用窗口能够监督用户是不是点击键盘
		this.addKeyListener(this);
		
	}
	//设定一个数据存储对应着的JLabel存储数组
	JLabel [][] sheeps =new JLabel[12][16];
	
	
	//场景数据的模拟，使用二维数组模拟
	//1表示障碍，0表示空地

	int [][] datas={
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,1,1,1,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,1,1,1,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,1,1,1,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
	};
	//代表人物横向的位置
	 int wx ;
	//代表人物纵向的位置
	 int wy ;
	 //代表当前有多少个箱子移动到了目标中
	 int num = 0;
	 //代表箱子的总数
	 int total = 3 ;
	private void treeInit() 
	{
		//创建图片
		ImageIcon icon = new ImageIcon("tree.png");
		//遍历二维数组
		for (int i = 0; i < datas.length; i++)
		{
			for (int j = 0; j < datas[i].length; j++)
			{
				if (datas[i][j]==1) 
				{
					//障碍的初始化
					//创建JLabel
					JLabel lab_tree = new JLabel(icon);
					//设置大小位置
					lab_tree.setBounds(12+50*j, 36+50*i, 50, 50);
					//添加到窗体中
					this.add(lab_tree);
				}
				
			}
		}
		
	}
	
	//推箱子目标的初始化
	private void targetInit() 
	{
		//创建笼子一
		ImageIcon icon = new ImageIcon("target.png");
		JLabel lab_target1 = new JLabel(icon);
		lab_target1.setBounds(712, 236, 50, 50);
		this.add(lab_target1);
		datas[4][14]= 8;
		//创建笼子二、三
		JLabel lab_target2 = new JLabel(icon);
		lab_target2.setBounds(712, 286, 50, 50);
		this.add(lab_target2);
		datas[5][14]= 8;
		JLabel lab_target3 = new JLabel(icon);
		lab_target3.setBounds(712, 336, 50, 50);
		this.add(lab_target3);
		datas[6][14]= 8;
	}

	//推箱子箱子的初始化
	private void sheepInit()
	{
		//第一只羊
		ImageIcon icon = new ImageIcon("sheep_no.png");
		JLabel lab_sheep1 = new JLabel(icon);
		lab_sheep1.setBounds(312, 236, 50, 50);
		this.add(lab_sheep1);
		//修改箱子对应位置上的数据为4
		datas[4][6] = 4;
		//把这个JLabel组件放入到sheeps的数组中
		sheeps[4][6] = lab_sheep1;
		
		//第二只羊
		JLabel lab_sheep2 = new JLabel(icon);
		lab_sheep2.setBounds(312, 336, 50, 50);
		this.add(lab_sheep2);
		datas[6][6] = 4;
		//把这个JLabel组件放入到sheeps的数组中
		sheeps[6][6] = lab_sheep2;
		
		//第三只羊
		JLabel lab_sheep3 = new JLabel(icon);
		lab_sheep3.setBounds(312, 436, 50, 50);
		this.add(lab_sheep3);
		datas[8][6] = 4;
		//把这个JLabel组件放入到sheeps的数组中
		sheeps[8][6] = lab_sheep3;
	}

	//推箱子人物的初始化
	private void wolfInit()
	{
		//人物最初位置
		wx = 3;
		wy = 2;
		//创建一张图片，人物的图片
		ImageIcon i = new ImageIcon("zm.png");
		//使用JLabel组件模拟人物
		lab_wolf = new JLabel(i);
		//设置人物在屏幕上的显示位置
		lab_wolf.setBounds(12+wx*50, 36+wy*50, 50, 50);
		//把这个人物放到窗体里面
		this.add(lab_wolf);
		
		
	}

	//背景初始化
	private void backgroundInit()
	{
		//创建一个图片
		ImageIcon i = new ImageIcon("bg.png");
		//使用JLabel制作背景
		JLabel lab_bg = new JLabel(i);
		//背景放在窗体里的位置与大小
		lab_bg.setBounds(12, 36, 800, 600);
		//将这个东西添加到窗体里
		this.add(lab_bg);
		
		
	}


	//	设置整个窗体
	private void setMainFrameUI()
	{
				//设置整个窗体的布局模式为自由布局
				this.setLayout(null);
				//设置窗口的标题
				this.setTitle("推箱子");
				//设置窗口的位置
				this.setLocation(110,30);
				//设置窗口的宽高
				this.setSize(826, 650);
				//设置窗口不能最大化
				this.setResizable(false);
				//设置窗口显示出来
				this.setVisible(true);
	}
		//判断是否胜利
		private void victory()
		{
			
			if (num==total) 
			{
				System.out.println("游戏胜利");
				//Dialog
				JOptionPane.showMessageDialog(null, "游戏胜利","推箱子",JOptionPane.CLOSED_OPTION);
				//移除键盘监听
				this.removeKeyListener(this);
			}
		}
		//弹起键盘
		@Override
		public void keyReleased(KeyEvent e) 
		{
			int key = e.getKeyCode();
			//右
			if (key==39)
			{
				if (datas[wy][wx+1] == 0) 
				{
					//人物的位置
					wx++;
					//使用lab_wolf.getLocation()，得到人物的位置
					int x = (int)lab_wolf.getLocation().getX();
					int y = (int)lab_wolf.getLocation().getY();
					lab_wolf.setLocation(x+50,y);
					ImageIcon icon = new ImageIcon("youm.png");
					lab_wolf.setIcon(icon);
					return;
				}
				//让人物向右移动
				//方向上第一位的坐标是wy wx+1
				//方向上第二位的坐标是wy wx+2
				if (datas[wy][wx+1] == 1)
				{
					return;
				}
				if (datas[wy][wx+1] == 4 && datas[wy][wx+2] == 1) 
				{
					return;
				}
				if (datas[wy][wx+1] == 4 && datas[wy][wx+2] == 4) 
				{
					return;
				}
				if (datas[wy][wx+1] == 4 && datas[wy][wx+2] == 12) 
				{
					return;
				}
				if (datas[wy][wx+1] == 12 && datas[wy][wx+2] == 1) 
				{
					return;
				}
				if (datas[wy][wx+1] == 12 && datas[wy][wx+2] == 4) 
				{
					return;
				}
				if (datas[wy][wx+1] == 12 && datas[wy][wx+2] == 12) 
				{
					return;
				}
				
				
				if (datas[wy][wx+1] == 8) 
				{
					//人物的位置
					wx++;
					//使用lab_wolf.getLocation()，得到人物的位置
					int x = (int)lab_wolf.getLocation().getX();
					int y = (int)lab_wolf.getLocation().getY();
					lab_wolf.setLocation(x+50,y);
					ImageIcon icon = new ImageIcon("youm.png");
					lab_wolf.setIcon(icon);
					return;
				}
				if (datas[wy][wx+1] == 4 && datas[wy][wx+2]==0) 
				{
					datas[wy][wx+1]= 0;
					datas[wy][wx+2]= 4;
				}
				
				if (datas[wy][wx+1] == 4 && datas[wy][wx+2]==8) 
				{
					datas[wy][wx+1]= 0;
					datas[wy][wx+2]= 12;
					num++;
					
				}
				if (datas[wy][wx+1] == 12 && datas[wy][wx+2]==0) 
				{
					datas[wy][wx+1]= 8;
					datas[wy][wx+2]= 4;
					num--;
					
				}
				if (datas[wy][wx+1] == 12 && datas[wy][wx+2]==8) 
				{
					datas[wy][wx+1]= 8;
					datas[wy][wx+2]= 12;
				}
				sheeps[wy][wx+1].setLocation(12+wx*50+100, 36+wy*50);
				sheeps[wy][wx+2] = sheeps[wy][wx+1];
				sheeps[wy][wx+1] =null;
				//人物的位置
				wx++;
				//使用lab_wolf.getLocation()，得到人物的位置
				int x = (int)lab_wolf.getLocation().getX();
				int y = (int)lab_wolf.getLocation().getY();
				lab_wolf.setLocation(x+50,y);
				ImageIcon icon = new ImageIcon("youm.png");
				lab_wolf.setIcon(icon);
				//判断胜利
				victory();
				return;
				
				
			}
			//左
			if (key==37)
			{
				if (datas[wy][wx-1] == 0) 
				{
					//人物的位置
					wx--;
					//使用lab_wolf.getLocation()，得到人物的位置
					int x = (int)lab_wolf.getLocation().getX();
					int y = (int)lab_wolf.getLocation().getY();
					lab_wolf.setLocation(x-50,y);
					ImageIcon icon = new ImageIcon("zuom.png");
					lab_wolf.setIcon(icon);
					return;
				}
				//让人物向右移动
				//方向上第一位的坐标是wy wx+1
				//方向上第二位的坐标是wy wx+2
				if (datas[wy][wx-1] == 1)
				{
					return;
				}
				if (datas[wy][wx-1] == 4 && datas[wy][wx-2] == 1) 
				{
					return;
				}
				if (datas[wy][wx-1] == 4 && datas[wy][wx-2] == 4) 
				{
					return;
				}
				if (datas[wy][wx-1] == 4 && datas[wy][wx-2] == 12) 
				{
					return;
				}
				if (datas[wy][wx-1] == 12 && datas[wy][wx-2] == 1) 
				{
					return;
				}
				if (datas[wy][wx-1] == 12 && datas[wy][wx-2] == 4) 
				{
					return;
				}
				if (datas[wy][wx-1] == 12 && datas[wy][wx-2] == 12) 
				{
					return;
				}
				
				
				if (datas[wy][wx-1] == 8) 
				{
					//人物的位置
					wx--;
					//使用lab_wolf.getLocation()，得到人物的位置
					int x = (int)lab_wolf.getLocation().getX();
					int y = (int)lab_wolf.getLocation().getY();
					lab_wolf.setLocation(x-50,y);
					ImageIcon icon = new ImageIcon("zuom.png");
					lab_wolf.setIcon(icon);
					return;
				}
				if (datas[wy][wx-1] == 4 && datas[wy][wx-2]==0) 
				{
					datas[wy][wx-1]= 0;
					datas[wy][wx-2]= 4;
				}
				
				if (datas[wy][wx-1] == 4 && datas[wy][wx-2]==8) 
				{
					datas[wy][wx-1]= 0;
					datas[wy][wx-2]= 12;
					num++;
				}
				if (datas[wy][wx-1] == 12 && datas[wy][wx-2]==0) 
				{
					datas[wy][wx-1]= 8;
					datas[wy][wx-2]= 4;
					num--;
				}
				if (datas[wy][wx-1] == 12 && datas[wy][wx-2]==8) 
				{
					datas[wy][wx-1]= 8;
					datas[wy][wx-2]= 12;
				}
				sheeps[wy][wx-1].setLocation(12+wx*50-100, 36+wy*50);
				sheeps[wy][wx-2] = sheeps[wy][wx-1];
				sheeps[wy][wx-1] =null;
				//人物的位置
				wx--;
				//使用lab_wolf.getLocation()，得到人物的位置
				int x = (int)lab_wolf.getLocation().getX();
				int y = (int)lab_wolf.getLocation().getY();
				lab_wolf.setLocation(x-50,y);
				ImageIcon icon = new ImageIcon("zuom.png");
				lab_wolf.setIcon(icon);
				//判断胜利
				victory();
				return;
			}
			//下
			if (key==40)
			{
				if (datas[wy+1][wx] == 0) 
				{
					//人物的位置
					wy++;
					//使用lab_wolf.getLocation()，得到人物的位置
					int x = (int)lab_wolf.getLocation().getX();
					int y = (int)lab_wolf.getLocation().getY();
					lab_wolf.setLocation(x,y+50);
					ImageIcon icon = new ImageIcon("zm.png");
					lab_wolf.setIcon(icon);
					return;
				}
				//让人物向右移动
				//方向上第一位的坐标是wy wx+1
				//方向上第二位的坐标是wy wx+2
				if (datas[wy+1][wx] == 1)
				{
					return;
				}
				if (datas[wy+1][wx] == 4 && datas[wy+2][wx] == 1) 
				{
					return;
				}
				if (datas[wy+1][wx] == 4 && datas[wy+2][wx] == 4) 
				{
					return;
				}
				if (datas[wy+1][wx] == 4 && datas[wy+2][wx] == 12) 
				{
					return;
				}
				if (datas[wy+1][wx] == 12 && datas[wy+2][wx] == 1) 
				{
					return;
				}
				if (datas[wy+1][wx] == 12 && datas[wy+2][wx] == 4) 
				{
					return;
				}
				if (datas[wy+1][wx] == 12 && datas[wy+2][wx] == 12) 
				{
					return;
				}
				
				
				if (datas[wy+1][wx] == 8) 
				{
					//人物的位置
					wy++;
					//使用lab_wolf.getLocation()，得到人物的位置
					int x = (int)lab_wolf.getLocation().getX();
					int y = (int)lab_wolf.getLocation().getY();
					lab_wolf.setLocation(x,y+50);
					ImageIcon icon = new ImageIcon("zm.png");
					lab_wolf.setIcon(icon);
					return;
				}
				if (datas[wy+1][wx] == 4 && datas[wy+2][wx]==0) 
				{
					datas[wy+1][wx]= 0;
					datas[wy+2][wx]= 4;
				}
				
				if (datas[wy+1][wx] == 4 && datas[wy+2][wx]==8) 
				{
					datas[wy+1][wx]= 0;
					datas[wy+2][wx]= 12;
					num++;
				}
				if (datas[wy+1][wx] == 12 && datas[wy+2][wx]==0) 
				{
					datas[wy+1][wx]= 8;
					datas[wy+2][wx]= 4;
					num--;
				}
				if (datas[wy+1][wx] == 12 && datas[wy+2][wx]==8) 
				{
					datas[wy+1][wx]= 8;
					datas[wy+2][wx]= 12;
				}
				sheeps[wy+1][wx].setLocation(12+wx*50, 36+wy*50+100);
				sheeps[wy+2][wx] = sheeps[wy+1][wx];
				sheeps[wy+1][wx] =null;
				//人物的位置
				wy++;
				//使用lab_wolf.getLocation()，得到人物的位置
				int x = (int)lab_wolf.getLocation().getX();
				int y = (int)lab_wolf.getLocation().getY();
				lab_wolf.setLocation(x,y+50);
				ImageIcon icon = new ImageIcon("zm.png");
				lab_wolf.setIcon(icon);
				//判断胜利
				victory();
				return;
				
			}
			//上
			if (key==38)
			{
				if (datas[wy-1][wx] == 0) 
				{
					//人物的位置
					wy--;
					//使用lab_wolf.getLocation()，得到人物的位置
					int x = (int)lab_wolf.getLocation().getX();
					int y = (int)lab_wolf.getLocation().getY();
					lab_wolf.setLocation(x,y-50);
					ImageIcon icon = new ImageIcon("fanm.png");
					lab_wolf.setIcon(icon);
					return;
				}
				//让人物向右移动
				//方向上第一位的坐标是wy wx+1
				//方向上第二位的坐标是wy wx+2
				if (datas[wy-1][wx] == 1)
				{
					return;
				}
				if (datas[wy-1][wx] == 4 && datas[wy-2][wx] == 1) 
				{
					return;
				}
				if (datas[wy-1][wx] == 4 && datas[wy-2][wx] == 4) 
				{
					return;
				}
				if (datas[wy-1][wx] == 4 && datas[wy-2][wx] == 12) 
				{
					return;
				}
				if (datas[wy-1][wx] == 12 && datas[wy-2][wx] == 1) 
				{
					return;
				}
				if (datas[wy-1][wx] == 12 && datas[wy-2][wx] == 4) 
				{
					return;
				}
				if (datas[wy-1][wx] == 12 && datas[wy-2][wx] == 12) 
				{
					return;
				}
				
				
				if (datas[wy-1][wx] == 8) 
				{
					//人物的位置
					wy--;
					//使用lab_wolf.getLocation()，得到人物的位置
					int x = (int)lab_wolf.getLocation().getX();
					int y = (int)lab_wolf.getLocation().getY();
					lab_wolf.setLocation(x,y-50);
					ImageIcon icon = new ImageIcon("fanm.png");
					lab_wolf.setIcon(icon);
					return;
				}
				if (datas[wy-1][wx] == 4 && datas[wy-2][wx]==0) 
				{
					datas[wy-1][wx]= 0;
					datas[wy-2][wx]= 4;
				}
				
				if (datas[wy-1][wx] == 4 && datas[wy-2][wx]==8) 
				{
					datas[wy-1][wx]= 0;
					datas[wy-2][wx]= 12;
					num++;
					
				}
				if (datas[wy-1][wx] == 12 && datas[wy-2][wx]==0) 
				{
					datas[wy-1][wx]= 8;
					datas[wy-2][wx]= 4;
					num--;
					
				}
				if (datas[wy-1][wx] == 12 && datas[wy-2][wx]==8) 
				{
					datas[wy-1][wx]= 8;
					datas[wy-2][wx]= 12;
				}
				sheeps[wy-1][wx].setLocation(12+wx*50, 36+wy*50-100);
				sheeps[wy-2][wx] = sheeps[wy-1][wx];
				sheeps[wy-1][wx] =null;
				//人物的位置
				wy--;
				//使用lab_wolf.getLocation()，得到人物的位置
				int x = (int)lab_wolf.getLocation().getX();
				int y = (int)lab_wolf.getLocation().getY();
				lab_wolf.setLocation(x,y-50);
				ImageIcon icon = new ImageIcon("fanm.png");
				lab_wolf.setIcon(icon);
				//判断胜利
				victory();
				return;
			}
//			//左：37  上：38  右：39  下：40
//			int key = e.getKeyCode();
//			//向左移动
//			if (key==37) 
//			{
//				//如果有障碍，什么事情都不做
//				//碰撞检测之人物
//				if (datas[wy][wx-1]==1) 
//				{
//					return;
//				}
//				
//				//碰撞检测之人物遇到箱子
//				if (datas[wy][wx-1] == 4)
//				{
//					if (datas[wy][wx-2]!= 1 && datas[wy][wx-2]!= 4) {
//						//---------箱子移动代码开始---------------
//						//当前箱子所在的位置值变成0
//						datas[wy][wx-1] = 0 ;
//						//移动以后箱子所在的位置值变成4
//						datas[wy][wx-2] = 4 ;
//						//获取箱子的对象
//						sheeps[wy][wx-1].setLocation(12+wx*50-100, 36+wy*50);
//						//将组件的位置进行调整
//						sheeps[wy][wx-2] = sheeps[wy][wx-1];
//						sheeps[wy][wx-1] =null;
//						//---------箱子移动代码结束---------------
//					//---------人物移动代码开始---------------
//						//人物的位置
//						wx--;
//						//使用lab_wolf.getLocation()，得到人物的位置
//						int x = (int)lab_wolf.getLocation().getX();
//						int y = (int)lab_wolf.getLocation().getY();
//						lab_wolf.setLocation(x-50,y);
//						ImageIcon icon = new ImageIcon("zuom.png");
//						lab_wolf.setIcon(icon);
//					//---------人物移动代码结束---------------
//						return;
//					}
//				}
//				if (datas[wy][wx-1] == 0)
//				{
//					//人物的位置
//					wx--;
//					//使用lab_wolf.getLocation()，得到人物的位置
//					int x = (int)lab_wolf.getLocation().getX();
//					int y = (int)lab_wolf.getLocation().getY();
//					lab_wolf.setLocation(x-50,y);
//					ImageIcon icon = new ImageIcon("zuom.png");
//					lab_wolf.setIcon(icon);
//				}
//			}
//			//向上移动
//			if (key==38) 
//			{
//				//如果有障碍，什么事情都不做
//				//碰撞检测之人物
//				if (datas[wy-1][wx]==1) 
//				{
//					return;
//				}
//				
//				//碰撞检测之人物遇到箱子
//				if (datas[wy-1][wx] == 4)
//				{
//					if (datas[wy-2][wx]!= 1 && datas[wy-2][wx]!= 4) {
//					//---------箱子移动代码开始---------------
//					//当前箱子所在的位置值变成0
//					datas[wy-1][wx] = 0 ;
//					//移动以后箱子所在的位置值变成4
//					datas[wy-2][wx] = 4 ;
//					//获取箱子的对象
//					sheeps[wy-1][wx].setLocation(12+wx*50, 36+wy*50-100);
//					//将组件的位置进行调整
//					sheeps[wy-2][wx] = sheeps[wy-1][wx];
//					sheeps[wy-1][wx] =null;
//					//---------箱子移动代码结束---------------
//					
//					//---------人物移动代码开始---------------
//						//人物的位置
//						wy--;
//						//使用lab_wolf.getLocation()，得到人物的位置
//						int x = (int)lab_wolf.getLocation().getX();
//						int y = (int)lab_wolf.getLocation().getY();
//						lab_wolf.setLocation(x,y-50);
//						ImageIcon icon = new ImageIcon("fanm.png");
//						lab_wolf.setIcon(icon);
//					//---------人物移动代码结束---------------
//						return;
//					}
//				}
//				if (datas[wy-1][wx] == 0)
//				{
//					//人物的位置
//					wy--;
//					//使用lab_wolf.getLocation()，得到人物的位置
//					int x = (int)lab_wolf.getLocation().getX();
//					int y = (int)lab_wolf.getLocation().getY();
//					lab_wolf.setLocation(x,y-50);
//					ImageIcon icon = new ImageIcon("fanm.png");
//					lab_wolf.setIcon(icon);
//				}
//			}
//			//向右移动
//			if (key==39) 
//			{
//				
//				//如果有障碍，什么事情都不做
//				//碰撞检测之人物
//				if (datas[wy][wx+1]==1) 
//				{
//					return;
//				}
//				
//				//碰撞检测之人物遇到箱子
//				if (datas[wy][wx+1] == 4)
//				{
//					if (datas[wy][wx+2]!= 1 && datas[wy][wx+2]!= 4) {
//						
//					
//					//---------箱子移动代码开始---------------
//						//当前箱子所在的位置值变成0
//						datas[wy][wx+1] = 0 ;
//						//移动以后箱子所在的位置值变成4
//						datas[wy][wx+2] = 4 ;
//						//获取箱子的对象
//						sheeps[wy][wx+1].setLocation(12+wx*50+100, 36+wy*50);
//						//将组件的位置进行调整
//						sheeps[wy][wx+2] = sheeps[wy][wx+1];
//						sheeps[wy][wx+1] =null;
//					//---------箱子移动代码结束---------------
//					//---------人物移动代码开始---------------
//						//人物的位置
//						wx++;
//						//使用lab_wolf.getLocation()，得到人物的位置
//						int x = (int)lab_wolf.getLocation().getX();
//						int y = (int)lab_wolf.getLocation().getY();
//						lab_wolf.setLocation(x+50,y);
//						ImageIcon icon = new ImageIcon("youm.png");
//						lab_wolf.setIcon(icon);
//					//---------人物移动代码结束---------------
//						return;
//					}
//				}
//				
//				if (datas[wy][wx+1] == 0)
//				{
//					//人物的位置
//					wx++;
//					//使用lab_wolf.getLocation()，得到人物的位置
//					int x = (int)lab_wolf.getLocation().getX();
//					int y = (int)lab_wolf.getLocation().getY();
//					lab_wolf.setLocation(x+50,y);
//					ImageIcon icon = new ImageIcon("youm.png");
//					lab_wolf.setIcon(icon);
//					
//				}
//				
//			}
//			//向下移动
//			if (key==40) 
//			{
//				//如果有障碍，什么事情都不做
//				//碰撞检测之人物遇到障碍
//				if (datas[wy+1][wx]==1) 
//				{
//					return;
//				}
//				
//				//碰撞检测之人物遇到箱子
//				if (datas[wy+1][wx] == 4)
//				{
//					if (datas[wy+2][wx]!= 1 && datas[wy+2][wx]!= 4) {
//						//---------箱子移动代码开始---------------
//						//当前箱子所在的位置值变成0
//						datas[wy+1][wx] = 0 ;
//						//移动以后箱子所在的位置值变成4
//						datas[wy+2][wx] = 4 ;
//						//获取箱子的对象
//						sheeps[wy+1][wx].setLocation(12+wx*50, 36+wy*50+100);
//						//将组件的位置进行调整
//						sheeps[wy+2][wx] = sheeps[wy+1][wx];
//						sheeps[wy+1][wx] =null;
//						//---------箱子移动代码结束---------------
//					
//					//---------人物移动代码开始---------------
//						//人物的位置
//						wy++;
//						//使用lab_wolf.getLocation()，得到人物的位置
//						int x = (int)lab_wolf.getLocation().getX();
//						int y = (int)lab_wolf.getLocation().getY();
//						lab_wolf.setLocation(x,y+50);
//						ImageIcon icon = new ImageIcon("zm.png");
//						lab_wolf.setIcon(icon);
//					//---------人物移动代码结束---------------
//						return;
//					}
//				}
//				
//				if (datas[wy+1][wx]==0) 
//				{
//					//人物的位置
//					wy++;
//					//使用lab_wolf.getLocation()，得到人物的位置
//					int x = (int)lab_wolf.getLocation().getX();
//					int y = (int)lab_wolf.getLocation().getY();
//					lab_wolf.setLocation(x,y+50);
//					ImageIcon icon = new ImageIcon("zm.png");
//					lab_wolf.setIcon(icon);
//				}
//				
//				
//			}
		}

		//键盘类型
		@Override
		public void keyTyped(KeyEvent e) 
		{
			
			
		}
	
		//按下键盘
		@Override
		public void keyPressed(KeyEvent e) 
		{
			
			
		}

	
	
}
