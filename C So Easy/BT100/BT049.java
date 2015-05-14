import java.util.Scanner;
/*
某侦察队接到一项紧急任务，要求在A、B、C、D、E、F六个队员中尽可能多地挑若干人，但有以下限制条件：
1)A和B两人中至少去一人；
2)A和D不能一起去；
3)A、E和F三人中要派两人去；
4)B和C都去或都不去；
5)C和D两人中去一个；
6)若D不去，则E也不去。
问应当让哪几个人去？
*/
public class  BT049
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		//1表示去，0表示不去
		for (int a=1;a>=0 ;a-- )
		{
			for (int b=1;b>=0 ;b-- )
			{
				for (int c=1;c>=0 ;c-- )
				{
					for (int d=1;d>=0 ;d-- )
					{
						for (int e=1;e>=0 ;e-- )
						{
							for (int f=1;f>=0 ; f--)
							{
								if ((a+b>=1)&&(a+d!=2)&&(a+e+f==2)&&
									(b+c==0||b+c==2)&&(c!=d)&&(d+e==0||d==1))
								{
									System.out.println("A的值为："+a);
									System.out.println("B的值为："+b);
									System.out.println("C的值为："+c);
									System.out.println("D的值为："+d);
									System.out.println("E的值为："+e);
									System.out.println("F的值为："+f);
								}
							}
						}
					}
				}
			}
		}
	}
}