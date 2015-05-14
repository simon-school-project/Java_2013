import java.util.Scanner;
/*
中国古代数学家张丘建在他的《算经》
中提出了著名的“百钱买百鸡问题”：
鸡翁一，值钱五，鸡母一，值钱三，鸡雏三，值钱一，
百钱买百鸡，问翁、母、雏各几何？
*/
public class  BT036
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		for (int x=0; x<=20;x++ )
		{
			for (int y=0;y<=33 ;y++ )
			{
				int z= 100-x-y;
				if (z%3==0&&(5*x+3*y+z/3==100))
				{
					System.out.println("鸡翁买："+x+"只");
					System.out.println("鸡母买："+y+"只");
					System.out.println("鸡雏买："+z+"只");
				}

			}
		}
	}
}