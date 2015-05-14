package me.loveyous.xueyao.ui;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//������ʾ��������
public class MainFrame extends Frame implements KeyListener 
{
	JLabel lab_wolf;
	
	//����һ�´������������Ϣ
	//���췽��
	public MainFrame()
	{
		/*�������ͼƬ�����ʱ�����˳�����Ҫ������Ҫ����
		 * ���ͼƬ˳��
		 * 
		 * */
		
		//�����ӣ�Ŀ��λ�ã�
		targetInit();
		
		//������
		wolfInit();
		
		//������
		sheepInit();
		
		
		//���ϰ�
		treeInit();
		//������ʼ��
		backgroundInit();
		
		
		//	������������
		setMainFrameUI();
		//ʹ�ô����ܹ��ල�û��ǲ��ǵ������
		this.addKeyListener(this);
		
	}
	//�趨һ�����ݴ洢��Ӧ�ŵ�JLabel�洢����
	JLabel [][] sheeps =new JLabel[12][16];
	
	
	//�������ݵ�ģ�⣬ʹ�ö�ά����ģ��
	//1��ʾ�ϰ���0��ʾ�յ�

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
	//������������λ��
	 int wx ;
	//�������������λ��
	 int wy ;
	 //����ǰ�ж��ٸ������ƶ�����Ŀ����
	 int num = 0;
	 //�������ӵ�����
	 int total = 3 ;
	private void treeInit() 
	{
		//����ͼƬ
		ImageIcon icon = new ImageIcon("tree.png");
		//������ά����
		for (int i = 0; i < datas.length; i++)
		{
			for (int j = 0; j < datas[i].length; j++)
			{
				if (datas[i][j]==1) 
				{
					//�ϰ��ĳ�ʼ��
					//����JLabel
					JLabel lab_tree = new JLabel(icon);
					//���ô�Сλ��
					lab_tree.setBounds(12+50*j, 36+50*i, 50, 50);
					//��ӵ�������
					this.add(lab_tree);
				}
				
			}
		}
		
	}
	
	//������Ŀ��ĳ�ʼ��
	private void targetInit() 
	{
		//��������һ
		ImageIcon icon = new ImageIcon("target.png");
		JLabel lab_target1 = new JLabel(icon);
		lab_target1.setBounds(712, 236, 50, 50);
		this.add(lab_target1);
		datas[4][14]= 8;
		//�������Ӷ�����
		JLabel lab_target2 = new JLabel(icon);
		lab_target2.setBounds(712, 286, 50, 50);
		this.add(lab_target2);
		datas[5][14]= 8;
		JLabel lab_target3 = new JLabel(icon);
		lab_target3.setBounds(712, 336, 50, 50);
		this.add(lab_target3);
		datas[6][14]= 8;
	}

	//���������ӵĳ�ʼ��
	private void sheepInit()
	{
		//��һֻ��
		ImageIcon icon = new ImageIcon("sheep_no.png");
		JLabel lab_sheep1 = new JLabel(icon);
		lab_sheep1.setBounds(312, 236, 50, 50);
		this.add(lab_sheep1);
		//�޸����Ӷ�Ӧλ���ϵ�����Ϊ4
		datas[4][6] = 4;
		//�����JLabel������뵽sheeps��������
		sheeps[4][6] = lab_sheep1;
		
		//�ڶ�ֻ��
		JLabel lab_sheep2 = new JLabel(icon);
		lab_sheep2.setBounds(312, 336, 50, 50);
		this.add(lab_sheep2);
		datas[6][6] = 4;
		//�����JLabel������뵽sheeps��������
		sheeps[6][6] = lab_sheep2;
		
		//����ֻ��
		JLabel lab_sheep3 = new JLabel(icon);
		lab_sheep3.setBounds(312, 436, 50, 50);
		this.add(lab_sheep3);
		datas[8][6] = 4;
		//�����JLabel������뵽sheeps��������
		sheeps[8][6] = lab_sheep3;
	}

	//����������ĳ�ʼ��
	private void wolfInit()
	{
		//�������λ��
		wx = 3;
		wy = 2;
		//����һ��ͼƬ�������ͼƬ
		ImageIcon i = new ImageIcon("zm.png");
		//ʹ��JLabel���ģ������
		lab_wolf = new JLabel(i);
		//������������Ļ�ϵ���ʾλ��
		lab_wolf.setBounds(12+wx*50, 36+wy*50, 50, 50);
		//���������ŵ���������
		this.add(lab_wolf);
		
		
	}

	//������ʼ��
	private void backgroundInit()
	{
		//����һ��ͼƬ
		ImageIcon i = new ImageIcon("bg.png");
		//ʹ��JLabel��������
		JLabel lab_bg = new JLabel(i);
		//�������ڴ������λ�����С
		lab_bg.setBounds(12, 36, 800, 600);
		//�����������ӵ�������
		this.add(lab_bg);
		
		
	}


	//	������������
	private void setMainFrameUI()
	{
				//������������Ĳ���ģʽΪ���ɲ���
				this.setLayout(null);
				//���ô��ڵı���
				this.setTitle("������");
				//���ô��ڵ�λ��
				this.setLocation(110,30);
				//���ô��ڵĿ��
				this.setSize(826, 650);
				//���ô��ڲ������
				this.setResizable(false);
				//���ô�����ʾ����
				this.setVisible(true);
	}
		//�ж��Ƿ�ʤ��
		private void victory()
		{
			
			if (num==total) 
			{
				System.out.println("��Ϸʤ��");
				//Dialog
				JOptionPane.showMessageDialog(null, "��Ϸʤ��","������",JOptionPane.CLOSED_OPTION);
				//�Ƴ����̼���
				this.removeKeyListener(this);
			}
		}
		//�������
		@Override
		public void keyReleased(KeyEvent e) 
		{
			int key = e.getKeyCode();
			//��
			if (key==39)
			{
				if (datas[wy][wx+1] == 0) 
				{
					//�����λ��
					wx++;
					//ʹ��lab_wolf.getLocation()���õ������λ��
					int x = (int)lab_wolf.getLocation().getX();
					int y = (int)lab_wolf.getLocation().getY();
					lab_wolf.setLocation(x+50,y);
					ImageIcon icon = new ImageIcon("youm.png");
					lab_wolf.setIcon(icon);
					return;
				}
				//�����������ƶ�
				//�����ϵ�һλ��������wy wx+1
				//�����ϵڶ�λ��������wy wx+2
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
					//�����λ��
					wx++;
					//ʹ��lab_wolf.getLocation()���õ������λ��
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
				//�����λ��
				wx++;
				//ʹ��lab_wolf.getLocation()���õ������λ��
				int x = (int)lab_wolf.getLocation().getX();
				int y = (int)lab_wolf.getLocation().getY();
				lab_wolf.setLocation(x+50,y);
				ImageIcon icon = new ImageIcon("youm.png");
				lab_wolf.setIcon(icon);
				//�ж�ʤ��
				victory();
				return;
				
				
			}
			//��
			if (key==37)
			{
				if (datas[wy][wx-1] == 0) 
				{
					//�����λ��
					wx--;
					//ʹ��lab_wolf.getLocation()���õ������λ��
					int x = (int)lab_wolf.getLocation().getX();
					int y = (int)lab_wolf.getLocation().getY();
					lab_wolf.setLocation(x-50,y);
					ImageIcon icon = new ImageIcon("zuom.png");
					lab_wolf.setIcon(icon);
					return;
				}
				//�����������ƶ�
				//�����ϵ�һλ��������wy wx+1
				//�����ϵڶ�λ��������wy wx+2
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
					//�����λ��
					wx--;
					//ʹ��lab_wolf.getLocation()���õ������λ��
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
				//�����λ��
				wx--;
				//ʹ��lab_wolf.getLocation()���õ������λ��
				int x = (int)lab_wolf.getLocation().getX();
				int y = (int)lab_wolf.getLocation().getY();
				lab_wolf.setLocation(x-50,y);
				ImageIcon icon = new ImageIcon("zuom.png");
				lab_wolf.setIcon(icon);
				//�ж�ʤ��
				victory();
				return;
			}
			//��
			if (key==40)
			{
				if (datas[wy+1][wx] == 0) 
				{
					//�����λ��
					wy++;
					//ʹ��lab_wolf.getLocation()���õ������λ��
					int x = (int)lab_wolf.getLocation().getX();
					int y = (int)lab_wolf.getLocation().getY();
					lab_wolf.setLocation(x,y+50);
					ImageIcon icon = new ImageIcon("zm.png");
					lab_wolf.setIcon(icon);
					return;
				}
				//�����������ƶ�
				//�����ϵ�һλ��������wy wx+1
				//�����ϵڶ�λ��������wy wx+2
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
					//�����λ��
					wy++;
					//ʹ��lab_wolf.getLocation()���õ������λ��
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
				//�����λ��
				wy++;
				//ʹ��lab_wolf.getLocation()���õ������λ��
				int x = (int)lab_wolf.getLocation().getX();
				int y = (int)lab_wolf.getLocation().getY();
				lab_wolf.setLocation(x,y+50);
				ImageIcon icon = new ImageIcon("zm.png");
				lab_wolf.setIcon(icon);
				//�ж�ʤ��
				victory();
				return;
				
			}
			//��
			if (key==38)
			{
				if (datas[wy-1][wx] == 0) 
				{
					//�����λ��
					wy--;
					//ʹ��lab_wolf.getLocation()���õ������λ��
					int x = (int)lab_wolf.getLocation().getX();
					int y = (int)lab_wolf.getLocation().getY();
					lab_wolf.setLocation(x,y-50);
					ImageIcon icon = new ImageIcon("fanm.png");
					lab_wolf.setIcon(icon);
					return;
				}
				//�����������ƶ�
				//�����ϵ�һλ��������wy wx+1
				//�����ϵڶ�λ��������wy wx+2
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
					//�����λ��
					wy--;
					//ʹ��lab_wolf.getLocation()���õ������λ��
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
				//�����λ��
				wy--;
				//ʹ��lab_wolf.getLocation()���õ������λ��
				int x = (int)lab_wolf.getLocation().getX();
				int y = (int)lab_wolf.getLocation().getY();
				lab_wolf.setLocation(x,y-50);
				ImageIcon icon = new ImageIcon("fanm.png");
				lab_wolf.setIcon(icon);
				//�ж�ʤ��
				victory();
				return;
			}
//			//��37  �ϣ�38  �ң�39  �£�40
//			int key = e.getKeyCode();
//			//�����ƶ�
//			if (key==37) 
//			{
//				//������ϰ���ʲô���鶼����
//				//��ײ���֮����
//				if (datas[wy][wx-1]==1) 
//				{
//					return;
//				}
//				
//				//��ײ���֮������������
//				if (datas[wy][wx-1] == 4)
//				{
//					if (datas[wy][wx-2]!= 1 && datas[wy][wx-2]!= 4) {
//						//---------�����ƶ����뿪ʼ---------------
//						//��ǰ�������ڵ�λ��ֵ���0
//						datas[wy][wx-1] = 0 ;
//						//�ƶ��Ժ��������ڵ�λ��ֵ���4
//						datas[wy][wx-2] = 4 ;
//						//��ȡ���ӵĶ���
//						sheeps[wy][wx-1].setLocation(12+wx*50-100, 36+wy*50);
//						//�������λ�ý��е���
//						sheeps[wy][wx-2] = sheeps[wy][wx-1];
//						sheeps[wy][wx-1] =null;
//						//---------�����ƶ��������---------------
//					//---------�����ƶ����뿪ʼ---------------
//						//�����λ��
//						wx--;
//						//ʹ��lab_wolf.getLocation()���õ������λ��
//						int x = (int)lab_wolf.getLocation().getX();
//						int y = (int)lab_wolf.getLocation().getY();
//						lab_wolf.setLocation(x-50,y);
//						ImageIcon icon = new ImageIcon("zuom.png");
//						lab_wolf.setIcon(icon);
//					//---------�����ƶ��������---------------
//						return;
//					}
//				}
//				if (datas[wy][wx-1] == 0)
//				{
//					//�����λ��
//					wx--;
//					//ʹ��lab_wolf.getLocation()���õ������λ��
//					int x = (int)lab_wolf.getLocation().getX();
//					int y = (int)lab_wolf.getLocation().getY();
//					lab_wolf.setLocation(x-50,y);
//					ImageIcon icon = new ImageIcon("zuom.png");
//					lab_wolf.setIcon(icon);
//				}
//			}
//			//�����ƶ�
//			if (key==38) 
//			{
//				//������ϰ���ʲô���鶼����
//				//��ײ���֮����
//				if (datas[wy-1][wx]==1) 
//				{
//					return;
//				}
//				
//				//��ײ���֮������������
//				if (datas[wy-1][wx] == 4)
//				{
//					if (datas[wy-2][wx]!= 1 && datas[wy-2][wx]!= 4) {
//					//---------�����ƶ����뿪ʼ---------------
//					//��ǰ�������ڵ�λ��ֵ���0
//					datas[wy-1][wx] = 0 ;
//					//�ƶ��Ժ��������ڵ�λ��ֵ���4
//					datas[wy-2][wx] = 4 ;
//					//��ȡ���ӵĶ���
//					sheeps[wy-1][wx].setLocation(12+wx*50, 36+wy*50-100);
//					//�������λ�ý��е���
//					sheeps[wy-2][wx] = sheeps[wy-1][wx];
//					sheeps[wy-1][wx] =null;
//					//---------�����ƶ��������---------------
//					
//					//---------�����ƶ����뿪ʼ---------------
//						//�����λ��
//						wy--;
//						//ʹ��lab_wolf.getLocation()���õ������λ��
//						int x = (int)lab_wolf.getLocation().getX();
//						int y = (int)lab_wolf.getLocation().getY();
//						lab_wolf.setLocation(x,y-50);
//						ImageIcon icon = new ImageIcon("fanm.png");
//						lab_wolf.setIcon(icon);
//					//---------�����ƶ��������---------------
//						return;
//					}
//				}
//				if (datas[wy-1][wx] == 0)
//				{
//					//�����λ��
//					wy--;
//					//ʹ��lab_wolf.getLocation()���õ������λ��
//					int x = (int)lab_wolf.getLocation().getX();
//					int y = (int)lab_wolf.getLocation().getY();
//					lab_wolf.setLocation(x,y-50);
//					ImageIcon icon = new ImageIcon("fanm.png");
//					lab_wolf.setIcon(icon);
//				}
//			}
//			//�����ƶ�
//			if (key==39) 
//			{
//				
//				//������ϰ���ʲô���鶼����
//				//��ײ���֮����
//				if (datas[wy][wx+1]==1) 
//				{
//					return;
//				}
//				
//				//��ײ���֮������������
//				if (datas[wy][wx+1] == 4)
//				{
//					if (datas[wy][wx+2]!= 1 && datas[wy][wx+2]!= 4) {
//						
//					
//					//---------�����ƶ����뿪ʼ---------------
//						//��ǰ�������ڵ�λ��ֵ���0
//						datas[wy][wx+1] = 0 ;
//						//�ƶ��Ժ��������ڵ�λ��ֵ���4
//						datas[wy][wx+2] = 4 ;
//						//��ȡ���ӵĶ���
//						sheeps[wy][wx+1].setLocation(12+wx*50+100, 36+wy*50);
//						//�������λ�ý��е���
//						sheeps[wy][wx+2] = sheeps[wy][wx+1];
//						sheeps[wy][wx+1] =null;
//					//---------�����ƶ��������---------------
//					//---------�����ƶ����뿪ʼ---------------
//						//�����λ��
//						wx++;
//						//ʹ��lab_wolf.getLocation()���õ������λ��
//						int x = (int)lab_wolf.getLocation().getX();
//						int y = (int)lab_wolf.getLocation().getY();
//						lab_wolf.setLocation(x+50,y);
//						ImageIcon icon = new ImageIcon("youm.png");
//						lab_wolf.setIcon(icon);
//					//---------�����ƶ��������---------------
//						return;
//					}
//				}
//				
//				if (datas[wy][wx+1] == 0)
//				{
//					//�����λ��
//					wx++;
//					//ʹ��lab_wolf.getLocation()���õ������λ��
//					int x = (int)lab_wolf.getLocation().getX();
//					int y = (int)lab_wolf.getLocation().getY();
//					lab_wolf.setLocation(x+50,y);
//					ImageIcon icon = new ImageIcon("youm.png");
//					lab_wolf.setIcon(icon);
//					
//				}
//				
//			}
//			//�����ƶ�
//			if (key==40) 
//			{
//				//������ϰ���ʲô���鶼����
//				//��ײ���֮���������ϰ�
//				if (datas[wy+1][wx]==1) 
//				{
//					return;
//				}
//				
//				//��ײ���֮������������
//				if (datas[wy+1][wx] == 4)
//				{
//					if (datas[wy+2][wx]!= 1 && datas[wy+2][wx]!= 4) {
//						//---------�����ƶ����뿪ʼ---------------
//						//��ǰ�������ڵ�λ��ֵ���0
//						datas[wy+1][wx] = 0 ;
//						//�ƶ��Ժ��������ڵ�λ��ֵ���4
//						datas[wy+2][wx] = 4 ;
//						//��ȡ���ӵĶ���
//						sheeps[wy+1][wx].setLocation(12+wx*50, 36+wy*50+100);
//						//�������λ�ý��е���
//						sheeps[wy+2][wx] = sheeps[wy+1][wx];
//						sheeps[wy+1][wx] =null;
//						//---------�����ƶ��������---------------
//					
//					//---------�����ƶ����뿪ʼ---------------
//						//�����λ��
//						wy++;
//						//ʹ��lab_wolf.getLocation()���õ������λ��
//						int x = (int)lab_wolf.getLocation().getX();
//						int y = (int)lab_wolf.getLocation().getY();
//						lab_wolf.setLocation(x,y+50);
//						ImageIcon icon = new ImageIcon("zm.png");
//						lab_wolf.setIcon(icon);
//					//---------�����ƶ��������---------------
//						return;
//					}
//				}
//				
//				if (datas[wy+1][wx]==0) 
//				{
//					//�����λ��
//					wy++;
//					//ʹ��lab_wolf.getLocation()���õ������λ��
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

		//��������
		@Override
		public void keyTyped(KeyEvent e) 
		{
			
			
		}
	
		//���¼���
		@Override
		public void keyPressed(KeyEvent e) 
		{
			
			
		}

	
	
}
