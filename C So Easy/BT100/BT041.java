import java.util.Scanner;
/*
马克思手稿中有一道趣味数学问题：
有30个人，其中有男人、女人和小孩，
在一家饭馆吃饭花了50先令；
每个男人花3先令，每个女人花2先令，每个小孩花1先令；
问男人、女人和小孩各有几人？

*/
public class  BT041
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		for(int i=1;i<=30;i++)
		{
			for (int j=1;j<=30 ;j++ )
			{
				for (int k=1;k<=30 ;k++ )
				{
					if ((i+j+k==30) &&( i*3+j*2+k==50))
					{
						System.out.println("男人："+i+"人");
						System.out.println("女人："+j+"人");
						System.out.println("小孩："+k+"人");
					}
				}
			}
		}
	}
}