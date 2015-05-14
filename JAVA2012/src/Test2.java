//ø™µ∆Œ Ã‚

import java.util.Scanner;
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		boolean []a=new boolean [n+1];
		
		for(int i=1;i<=n;i++)
			a[i]=false;
			//System.out.println(a[i]);
			
		for(int i=1;i<=k;i++)
			for(int j=1;j<=n;j++)
				if(j%i==0)
				{
					a[j]=!a[j];
				}
		for(int i=1;i<n+1;i++)
		{
			
			if(a[i])
			{
				System.out.println(i);
			}
		}
	
		}

}
