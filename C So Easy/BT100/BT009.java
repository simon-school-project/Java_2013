import java.util.Scanner;
/**
在屏幕上显示杨辉三角形
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
*/
public class  BT009
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("你想要生成几行杨辉三角");
		int n = sc.nextInt();
		int [][] num = new int[n][n];
		for (int i=0;i<n ;i++ )
		{ 
			for (int j=0;j<n ;j++ )
			{
				num[i][j] =1;
			}
		}
		for (int i=2;i<n ;i++ )
		{ 
			for (int j=1;j<i ;j++ )
			{
				num[i][j] =num[i-1][j-1]+num[i-1][j];
			}
		}
		
		for (int i=0;i<n ;i++ )
		{
			for (int j=0; j<=i;j++ )
			{
				System.out.print("   "+num[i][j]);
			}
			System.out.println();
		}
	}
}