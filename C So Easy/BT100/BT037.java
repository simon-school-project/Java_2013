import java.util.Scanner;
/*
����˹̹����һ����������ѧ�⣺
��һ�������ݣ���ÿ����2�ף��������ʣһ�ף�
��ÿ����3 �ף������ʣ2�ף�
��ÿ����5�ף������ʣ4�ף�
��ÿ����6�������ʣ5�ס�
ֻ��ÿ�ο�7�ף���������һ�ײ�ʣ��
�����������ݹ��ж��ٽף�
*/
public class  BT037
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		for (int i=1; ;i++ )
		{
			if (i%2==1 && i%3==2 && i%5== 4 &&
				i%6==5 && i%7==0)
			{
				System.out.println("�������ݹ��У�"+i);
				break;
			}
		}
	}
}