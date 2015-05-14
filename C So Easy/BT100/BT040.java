import java.util.Scanner;
/*
若一个口袋中放有12个球，其中有3个红的。
3个白的和6个黒的，
问从中任取8个共有多少种不同的颜色搭配？
*/
public class  BT040
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc =  new Scanner(System.in);
		for (int i=0;i<=3 ;i++ )
		{
			for (int j=0; j<=3;j++ )
			{
				for (int k=0;k<=6 ;k++ )
				{
					if (i+j+k==8)
					{
						count++;
					}
				}
			}
		}
		System.out.println("总共有："+count);
	}
}