import java.util.Scanner;
/*
���˼�ָ�����һ��Ȥζ��ѧ���⣺
��30���ˣ����������ˡ�Ů�˺�С����
��һ�ҷ��ݳԷ�����50���
ÿ�����˻�3���ÿ��Ů�˻�2���ÿ��С����1���
�����ˡ�Ů�˺�С�����м��ˣ�

*/
public class  BT041
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		for(int i=1;i<=30;i++)
		{
			for (int j=1;j<=30 ;j++ )
			{
				for (int k=1;k<=30 ;k++ )
				{
					if ((i+j+k==30) &&( i*3+j*2+k==50))
					{
						System.out.println("���ˣ�"+i+"��");
						System.out.println("Ů�ˣ�"+j+"��");
						System.out.println("С����"+k+"��");
					}
				}
			}
		}
	}
}