import java.util.Scanner;
/*
���һ��������������������ֵ������ͣ���Ƹ���Ϊ��ķ˹������(���Ϊ��������)��
�� 407=4^3+0^3+7^3����һ����ķ˹���������Ա����1000���ڵ����а�ķ˹��������
*/
public class  BT024
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("1000���ڵİ�ķ˹�������У�");
		for (int i=1;i<= 9;i++ )
		{
			for (int j=0;j<=9 ;j++ )
			{
				for (int k=0;k<=9 ;k++ )
				{
					if (i*100+j*10+k == i*i*i+j*j*j+k*k*k)
					{
						
						System.out.println((i*100+j*10+k));
					}
				}
			}
		}
	}
}