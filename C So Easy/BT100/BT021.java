import java.util.Scanner;
/*
��N��һ����λ��������9��ǡ�����䷴��������N��
���������ǽ����������ֵ������γɵ�������
���磺1234�ķ�������4321��


*/
public class  BT021
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		for (int i=1;i<=9 ;i++ )
		{
			for (int j=0;j<=9 ;j++ )
			{
				for (int k=0;k<=9 ;k++ )
				{
					for (int m=0;m<=9 ;m++ )
					{
						if((i*1000+j*100+k*10+m)*9==(m*1000+k*100+j*10+i))
						{
							System.out.println("N��Ϊ��"+(i*1000+j*100+k*10+m));
						}
					}
				}
			}
		}
	}
}