import java.util.Scanner;
/*
如果一个正整数等于其各个数字的立方和，则称该数为阿姆斯特朗数(亦称为自恋性数)。
如 407=4^3+0^3+7^3就是一个阿姆斯特朗数。试编程求1000以内的所有阿姆斯特朗数。
*/
public class  BT024
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("1000以内的阿姆斯特朗数有：");
		for (int i=1;i<= 9;i++ )
		{
			for (int j=0;j<=9 ;j++ )
			{
				for (int k=0;k<=9 ;k++ )
				{
					if (i*100+j*10+k == i*i*i+j*j*j+k*k*k)
					{
						
						System.out.println((i*100+j*10+k));
					}
				}
			}
		}
	}
}