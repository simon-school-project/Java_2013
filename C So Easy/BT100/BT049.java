import java.util.Scanner;
/*
ĳ���ӽӵ�һ���������Ҫ����A��B��C��D��E��F������Ա�о����ܶ���������ˣ�������������������
1)A��B����������ȥһ�ˣ�
2)A��D����һ��ȥ��
3)A��E��F������Ҫ������ȥ��
4)B��C��ȥ�򶼲�ȥ��
5)C��D������ȥһ����
6)��D��ȥ����EҲ��ȥ��
��Ӧ�����ļ�����ȥ��
*/
public class  BT049
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		//1��ʾȥ��0��ʾ��ȥ
		for (int a=1;a>=0 ;a-- )
		{
			for (int b=1;b>=0 ;b-- )
			{
				for (int c=1;c>=0 ;c-- )
				{
					for (int d=1;d>=0 ;d-- )
					{
						for (int e=1;e>=0 ;e-- )
						{
							for (int f=1;f>=0 ; f--)
							{
								if ((a+b>=1)&&(a+d!=2)&&(a+e+f==2)&&
									(b+c==0||b+c==2)&&(c!=d)&&(d+e==0||d==1))
								{
									System.out.println("A��ֵΪ��"+a);
									System.out.println("B��ֵΪ��"+b);
									System.out.println("C��ֵΪ��"+c);
									System.out.println("D��ֵΪ��"+d);
									System.out.println("E��ֵΪ��"+e);
									System.out.println("F��ֵΪ��"+f);
								}
							}
						}
					}
				}
			}
		}
	}
}