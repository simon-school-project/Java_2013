import java.util.Scanner;
/*
3025���������һ�ֶ��ص����ʣ�
����ƽ��Ϊ���Σ���30��25��
ʹ֮��Ӻ���ƽ������(30+25)^2��ǡ�õ���3025����
����������������ʵ�ȫ����λ����
*/
public class  BT029
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("���������ʵ���λ�����£�");
		for (int a=1;a<=9 ;a++ )
		{
			for (int b=0;b<=9 ;b++ )
			{
				for (int c=0;c<=9 ;c++ )
				{
					for (int d=0;d<=9 ;d++ )
					{
						if ((a*1000+b*100+c*10+d)==((a*10+b)+(c*10+d))*((a*10+b)+(c*10+d)))
						{
							System.out.println((a*1000+b*100+c*10+d)+"  ");
						}
					}
				}
			}
		}
	}
}