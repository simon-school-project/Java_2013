import java.util.Scanner;
/*
个位数为6且能被3整除的五位数共有多少？
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
								System.out.println("末数为6能被3整除的5位数:"+ ( a*10000+b*1000+c*100+d*10+6));
								count++;
							}
					}
				}
			}
		}
			System.out.println("总共个数为："+count);
	}
}