import java.util.Scanner;
/*
�������²μӻ����������OΪA��B��C����������ΪX��Y��Z��
���˲�֪��˭��˭��飬����ѯ������λ�����е���λ��
�������Ļش��������ģ�A˵������X��飻
X˵����δ�����C��C˵������Z��顣
��������֪�������ڿ���Ц��ȫ�Ǽٻ���
�����ҳ�˭����˭��顣
*/
public class  BT048
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		for (int x=1;x<=3 ;x++ )
		{
			for (int y=1;y<=3 ;y++ )
			{
				for (int z=1;z<=3 ;z++ )
				{
					if (x!=1&&x!=3&&z!=3&&x!=y&&y!=z&&x!=z)
					{
						System.out.println("X��"+x+"���");
						System.out.println("Y��"+y+"���");
						System.out.println("Z��"+z+"���");
					}
				}
			}
		}
	}
}