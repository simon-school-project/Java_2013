import java.util.Scanner;
//100!��β���ж��ٸ��㣿
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
	System.out.println("ĩβ��ĸ�����");
	System.out.println(count);
	}
}