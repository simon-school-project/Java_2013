import java.util.Scanner;
/*
��λ��Ϊ6���ܱ�3��������λ�����ж��٣�
*/
public class  BT018
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int count=0;
		for ( int a=1;a<=9 ;a++ )
		{
			for (int b=0;b<=9 ;b++ )
			{
				for (int c=0;c<=9 ;c++ )
				{
					for (int d=0;d<=9 ;d++ )
					{
							if ( ( a*10000+b*1000+c*100+d*10+6)%3==0)
							{
								System.out.println("ĩ��Ϊ6�ܱ�3������5λ��:"+ ( a*10000+b*1000+c*100+d*10+6));
								count++;
							}
					}
				}
			}
		}
			System.out.println("�ܹ�����Ϊ��"+count);
	}
}