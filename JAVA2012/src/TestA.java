import java.util.Scanner;
public class TestA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		
		int sum=0;
		if(m<n)
		{
			for(int i=m;i<=n;i++)
			{ 
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					continue;
					if(i==j)
						sum+=i;
						
				}
				
			}
		}
		System.out.println(sum);
		}

}
