import java.util.Scanner;
/*
问555555的约数中最大的三位数是多少？
*/
public class  BT005
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		for (int i=999;i>100 ;i-- )
		{
			//判断条件
			if (555555%i==0)
			{
				System.out.println("555555的约数中最大的三位数是::");
				System.out.println(i);
				break;
			}
		}
	}
}