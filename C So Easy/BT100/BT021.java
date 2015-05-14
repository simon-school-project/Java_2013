import java.util.Scanner;
/*
设N是一个四位数，它的9倍恰好是其反序数，求N。
反序数就是将整数的数字倒过来形成的整数。
例如：1234的反序数是4321。


*/
public class  BT021
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		for (int i=1;i<=9 ;i++ )
		{
			for (int j=0;j<=9 ;j++ )
			{
				for (int k=0;k<=9 ;k++ )
				{
					for (int m=0;m<=9 ;m++ )
					{
						if((i*1000+j*100+k*10+m)*9==(m*1000+k*100+j*10+i))
						{
							System.out.println("N数为："+(i*1000+j*100+k*10+m));
						}
					}
				}
			}
		}
	}
}