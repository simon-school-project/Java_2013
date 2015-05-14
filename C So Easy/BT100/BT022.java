import java.util.Scanner;
/*
一辆以固定速度行驶的汽车，
司机在上午10点看到里程表上的读数是一个对称数
(即这个数从左向右读和从右向左读是完全一样的)，为95859。
两小时后里程表上出现了一个新的对称数。
问该车的速度是多少？新的对称数是多少？
*/
public class  BT022
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int a,b,c,d;
		for (int i=95859; ; i++)
		{
			a = i/10000;//取出第一位数
			b =i/1000%10;//取出第二位数
			c = i%100/10;//取出第四位数
			d = i%10;//取出第五位数
			if (a==d&&b==c)
			{
				System.out.println("新的对称数:"+i);
				break;
			}
		}
	}
}