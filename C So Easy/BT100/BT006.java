import java.util.Scanner;

//13��13�η��������λ��
public class  BT006
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int n,m,num=1;
		System.out.println("��������Ҫ�����֣�");
		
		n = sc.nextInt();
		System.out.println("���������ֵĴη�����");
		m = sc.nextInt();
		for (int i = 1;i<=m ;i++ )
		{
				num= num*n%1000;
		}
		System.out.println("�������������λ����");
		System.out.println(num%1000);
	}
}