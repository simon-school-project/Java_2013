import java.util.Scanner;
/*
һ���Թ̶��ٶ���ʻ��������
˾��������10�㿴����̱��ϵĶ�����һ���Գ���
(��������������Ҷ��ʹ������������ȫһ����)��Ϊ95859��
��Сʱ����̱��ϳ�����һ���µĶԳ�����
�ʸó����ٶ��Ƕ��٣��µĶԳ����Ƕ��٣�
*/
public class  BT022
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int a,b,c,d;
		for (int i=95859; ; i++)
		{
			a = i/10000;//ȡ����һλ��
			b =i/1000%10;//ȡ���ڶ�λ��
			c = i%100/10;//ȡ������λ��
			d = i%10;//ȡ������λ��
			if (a==d&&b==c)
			{
				System.out.println("�µĶԳ���:"+i);
				break;
			}
		}
	}
}