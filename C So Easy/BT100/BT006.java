import java.util.Scanner;

//13的13次方的最后三位数
public class  BT006
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int n,m,num=1;
		System.out.println("请输入你要的数字：");
		
		n = sc.nextInt();
		System.out.println("请输入数字的次方数：");
		m = sc.nextInt();
		for (int i = 1;i<=m ;i++ )
		{
				num= num*n%1000;
		}
		System.out.println("次数方的最后三位数：");
		System.out.println(num%1000);
	}
}