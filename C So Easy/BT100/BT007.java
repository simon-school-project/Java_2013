import java.util.Scanner;
//100!的尾数有多少个零？
public class  BT007
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int count = 0;
		for (int i=5;i<=100 ;i=i+5 )
		{
			count++;
			if (i%25==0)
			{
				count++;
			}
		}
	System.out.println("末尾零的个数：");
	System.out.println(count);
	}
}