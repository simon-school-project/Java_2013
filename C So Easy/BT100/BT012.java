import java.util.Scanner;
/*
һ������Υ����ͨ����ײ�˺����ܡ�
�ֳ�������Ŀ���¼�������û�м�ס���ţ�
ֻ���³��ŵ�һЩ������
��˵�����յ�ǰ��λ��������ͬ�ģ�
��˵�����յĺ���λ��������ͬ�ģ�����ǰ��λ��ͬ��
������ѧ�ң���˵����λ�ĳ��Ÿպ���һ��������ƽ����
�������������������š�
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
										System.out.println("�����ߵĳ��ƺ��ǣ�"+num);
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