import java.util.Scanner;
/*
用一元人民币兑换成1分、2分和5分硬币，
共有多少种不同的兑换方法。
*/
public class  BT038
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int count=0;
		for (int x=0;x<=100 ;x++ )
		{
			for (int y=0;y<=100-x;y=y+2 )
			{
				for (int z=0;z<=100-x-2*y ;z=z+5 )
				{
					if (x+y+z==100)
					{
						count++;
					}
				}
			}
		}
		System.out.println("总共有："+count+"兑换方法");
	}
}