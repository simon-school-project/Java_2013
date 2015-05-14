/*自然数的平方数是：1 4 9 16 25 …
自然数的立方数是：1 8 27 64 125 …
自然数的4次方数是：1 16 81 256 …
…
这些数字都可以称为次方数。
1~10000中，去掉所有的次方数，还剩下回答个数字。
*/
import java.math.*;
public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int [10000];
		int count=0;
		for(int i=0; i<10000; i++)
			{a[i]=i+1;}
	
		for(int j=1; j<=10000; j++)
			for(int s=2; s<=10000; s++)
				for(int i=0; i<10000; i++)
			{
				if(pow(j,s)==a[i])
					{a[i]=0;
					break;}
				
			}
	for(int i=0; i<10000; i++)
	{
		if(a[i]!=0)
			{count++;}
		System.out.println(count);	
	}
		
	}

	private static int pow(int j, int s) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
