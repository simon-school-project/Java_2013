import java.util.Scanner;
/*
根据题意可以将解题过程分为三步：
1)计算从1990年1月1日开始至指定日期共有多少天；
2)由于“打鱼”和“晒网”的周期为5天，所以将计算出的天数用5去除；
3)根据余数判断他是在“打鱼”还是在“晒网”；
若 余数为1，2，3，则他是在“打鱼”
否则 是在“晒网”
在这三步中，关键是第一步。求从1990年1月1日至指定日期有多少天，要判断经历年份中是否有闰年，二月为29天，平年为28天。闰年的方法可以用伪语句描述如下：
如果 ((年能被4除尽 且 不能被100除尽)或 能被400除尽)
则 该年是闰年；
否则 不是闰年。
*/
public class  BT011
{
	public static void main(String[] args)
	{
		int sysYear = 1990;
		int sysMonth = 1;
		int sysDay = 1;
		Scanner sc =  new Scanner(System.in);
		System.out.println("输入年：");
		int year = sc.nextInt();
		System.out.println("输入月：");
		int month = sc.nextInt();
		System.out.println("输入日：");
		int day = sc.nextInt();
		for (int i=sysYear;i<=year ;400i++ )
		{
			
		}
	}
}