import java.util.Scanner;
//���һ����ǡ�õ�����������֮�ͣ���Ƹ���Ϊ����ȫ������
public class  BT025
{
	public static void main(String[] args)
	{
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("1��1000֮����ȫ���У�");
		for (int i=1;i<=999 ;i++ )
		{
			
			int sum=0;
			for(int  j=1;j<i;j++)
			{
				//�ж��Ƿ�������		
					if (i%j==0)
					{
						sum += j;
					}
				
			}
			//�ж����ӵĺ��ǲ��ǵ��������
				if (i==sum)
					{
						System.out.print("   "+i);
					}
		}
	}
}