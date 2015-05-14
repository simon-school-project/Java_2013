import java.util.Scanner;
/*
一辆卡车违反交通规则，撞人后逃跑。
现场有三人目击事件，但都没有记住车号，
只记下车号的一些特征。
甲说：牌照的前两位数字是相同的；
乙说：牌照的后两位数字是相同的，但与前两位不同；
丙是数学家，他说：四位的车号刚好是一个整数的平方。
请根据以上线索求出车号。
*/
public class  BT012
{
	public static void main(String[] args)
	{
		int num=0;
		Scanner sc =  new Scanner(System.in);
		for (int i=0;i<=9 ;i++ )
		{
			for (int j=0;j<=9 ;j++ )
			{
				for (int k=0;k<=9 ;k++ )
				{
					for (int g=0;g<=9 ;g++ )
					{
							if (i==j&&k==g&&k!=j)
							{
								num=i*1000+j*100+k*10+g;
								for (int n=32;n<100 ;n++ )
								{
									if (n ==Math.sqrt(num))
									{
										System.out.println("肇事者的车牌号是："+num);
										break;
									}
								}
							}

					}
				}
			}
		}
	}
}