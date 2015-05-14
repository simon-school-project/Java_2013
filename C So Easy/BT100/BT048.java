import java.util.Scanner;
/*
三对情侣参加婚礼，三个新郞为A、B、C，三个新娘为X、Y、Z。
有人不知道谁和谁结婚，于是询问了六位新人中的三位，
但听到的回答是这样的：A说他将和X结婚；
X说她的未婚夫是C；C说他将和Z结婚。
这人听后知道他们在开玩笑，全是假话。
请编程找出谁将和谁结婚。
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
						System.out.println("X和"+x+"结婚");
						System.out.println("Y和"+y+"结婚");
						System.out.println("Z和"+z+"结婚");
					}
				}
			}
		}
	}
}