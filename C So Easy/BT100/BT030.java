import java.util.Scanner;
//����������1~1000֮�����������
public class  BT030
{
	public static void main(String[] args)
	{
		int flag = 0;
		Scanner sc =  new Scanner(System.in);
		for (int i=1;i<1000 ;i++ )
		{
			for (int j=2;j<i ;j++ )
			{
				if ((i%j)==0)
				{
					flag = 1;
				}
			}
			if (flag==0)
			{
				System.out.println(i);
			}
		}
	}
}