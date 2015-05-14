import java.util.Scanner;
/*
3025这个数具有一种独特的性质：
将它平分为二段，即30和25，
使之相加后求平方，即(30+25)^2，恰好等于3025本身。
请求出具有这样性质的全部四位数。
*/
public class  BT029
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("有这样性质的四位数如下：");
		for (int a=1;a<=9 ;a++ )
		{
			for (int b=0;b<=9 ;b++ )
			{
				for (int c=0;c<=9 ;c++ )
				{
					for (int d=0;d<=9 ;d++ )
					{
						if ((a*1000+b*100+c*10+d)==((a*10+b)+(c*10+d))*((a*10+b)+(c*10+d)))
						{
							System.out.println((a*1000+b*100+c*10+d)+"  ");
						}
					}
				}
			}
		}
	}
}