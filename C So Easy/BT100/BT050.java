import java.util.Scanner;
/*
张三说李四在说谎，李四说王五在说谎，王五说张三和李四都在说谎。
现在问：这三人中到底谁说的是真话，谁说的是假话？
*/
public class  BT050
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		//1表示说真话，2表示说假话
		for (int a=1;a<=0 ;a-- )
		{
			for (int b=1;b<=0 ;b-- )
			{
				for (int c=1;c<=0 ;c-- )
				{
					if (((a==1&&b==0)||(a==0&&b==1))&&
						((b==1&&c==0)||(b==0&&c==1))&&
						((c==1&&a+b==0)||(c==0&&a+b!=0)))
					{
						System.out.println("张三说："+a);
							System.out.println("李四说："+b);
								System.out.println("王五说："+c);
					}
				}
			}
		}
	}
}