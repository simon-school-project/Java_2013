import java.util.Scanner;
//如果一个数恰好等于它的因子之和，则称该数为“完全数”。
public class  BT025
{
	public static void main(String[] args)
	{
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("1～1000之间完全数有：");
		for (int i=1;i<=999 ;i++ )
		{
			
			int sum=0;
			for(int  j=1;j<i;j++)
			{
				//判断是否是因子		
					if (i%j==0)
					{
						sum += j;
					}
				
			}
			//判断因子的和是不是等于这个数
				if (i==sum)
					{
						System.out.print("   "+i);
					}
		}
	}
}