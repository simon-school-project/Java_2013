import java.util.Scanner;
//小明有五本新书，要借给A，B，C三位小朋友，
//若每人每次只能借一本，则可以有多少种不同的借法？
//2014/1/21
public class  BT008
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int count=0;
		/*
		
		*/
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				for (int k=1;k<=5 ;k++ )
				{
					if (i!=j&&i!=k&&j!=k)
					{
						count++;
					}
				}
			}
		}
		System.out.println("借书的方法总共有："+count);
		
	}
}