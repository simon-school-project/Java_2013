import java.util.Scanner;
/*
��һ���ڴ��з���12����������3����ġ�
3���׵ĺ�6���\�ģ�
�ʴ�����ȡ8�����ж����ֲ�ͬ����ɫ���䣿
*/
public class  BT040
{
	public static void main(String[] args)
	{
		int count=0;
		Scanner sc =  new Scanner(System.in);
		for (int i=0;i<=3 ;i++ )
		{
			for (int j=0; j<=3;j++ )
			{
				for (int k=0;k<=6 ;k++ )
				{
					if (i+j+k==8)
					{
						count++;
					}
				}
			}
		}
		System.out.println("�ܹ��У�"+count);
	}
}