import java.util.Scanner;
//С�����屾���飬Ҫ���A��B��C��λС���ѣ�
//��ÿ��ÿ��ֻ�ܽ�һ����������ж����ֲ�ͬ�Ľ跨��
//2014/1/21
public class  BT008
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int count=0;
		/*
		
		*/
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				for (int k=1;k<=5 ;k++ )
				{
					if (i!=j&&i!=k&&j!=k)
					{
						count++;
					}
				}
			}
		}
		System.out.println("����ķ����ܹ��У�"+count);
		
	}
}