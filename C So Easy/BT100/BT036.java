import java.util.Scanner;
/*
�й��Ŵ���ѧ�����������ġ��㾭��
������������ġ���Ǯ��ټ����⡱��
����һ��ֵǮ�壬��ĸһ��ֵǮ������������ֵǮһ��
��Ǯ��ټ������̡�ĸ���������Σ�
*/
public class  BT036
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		for (int x=0; x<=20;x++ )
		{
			for (int y=0;y<=33 ;y++ )
			{
				int z= 100-x-y;
				if (z%3==0&&(5*x+3*y+z/3==100))
				{
					System.out.println("������"+x+"ֻ");
					System.out.println("��ĸ��"+y+"ֻ");
					System.out.println("������"+z+"ֻ");
				}

			}
		}
	}
}