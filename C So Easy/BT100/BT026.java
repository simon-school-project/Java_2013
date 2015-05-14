import java.util.Scanner;
/*
如果整数A的全部因子(包括1，不包括A本身)之和等于B；
且整数B的全部因子(包括1，不包括B本身)之和等于A，
则将整数A和B称为亲密数。
求3000以内的全部亲密数。
*/
public class  BT026
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		//判断3000以内的亲密数
		for (int i=1;i<3000 ;i++ )
		{
			int sum = 0;
			for (int j=1;j<i ;j++ )
			{
				if (i%j==0)
				{
					sum  = sum +j;
				}
			}
			int num = 0;
			for (int k=1;k<sum ;k++ )
			{
					if (sum%k==0)
					{
						num = num +k;
					}
			}
			if(num==i)
			{
				System.out.println(i+"：的亲密数是："+sum);
			}
			}
	}
}