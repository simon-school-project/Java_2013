import java.util.Scanner;
/*
�������A��ȫ������(����1��������A����)֮�͵���B��
������B��ȫ������(����1��������B����)֮�͵���A��
������A��B��Ϊ��������
��3000���ڵ�ȫ����������
*/
public class  BT026
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		//�ж�3000���ڵ�������
		for (int i=1;i<3000 ;i++ )
		{
			int sum = 0;
			for (int j=1;j<i ;j++ )
			{
				if (i%j==0)
				{
					sum  = sum +j;
				}
			}
			int num = 0;
			for (int k=1;k<sum ;k++ )
			{
					if (sum%k==0)
					{
						num = num +k;
					}
			}
			if(num==i)
			{
				System.out.println(i+"�����������ǣ�"+sum);
			}
			}
	}
}