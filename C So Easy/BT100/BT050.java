import java.util.Scanner;
/*
����˵������˵�ѣ�����˵������˵�ѣ�����˵���������Ķ���˵�ѡ�
�����ʣ��������е���˭˵�����滰��˭˵���Ǽٻ���
*/
public class  BT050
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		//1��ʾ˵�滰��2��ʾ˵�ٻ�
		for (int a=1;a<=0 ;a-- )
		{
			for (int b=1;b<=0 ;b-- )
			{
				for (int c=1;c<=0 ;c-- )
				{
					if (((a==1&&b==0)||(a==0&&b==1))&&
						((b==1&&c==0)||(b==0&&c==1))&&
						((c==1&&a+b==0)||(c==0&&a+b!=0)))
					{
						System.out.println("����˵��"+a);
							System.out.println("����˵��"+b);
								System.out.println("����˵��"+c);
					}
				}
			}
		}
	}
}