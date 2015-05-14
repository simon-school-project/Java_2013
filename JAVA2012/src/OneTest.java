import java.util.Scanner;

public class OneTest{
	static boolean  is_ok(int m, int n)
	{
	    int i;
	    int a[]=new int [10];
	    if (m>99999) return false;
	    for (i=0; i<10; i++) a[i]=0;
	    for (i=1; i<=5; i++) {
	        a[n%10]=1;  
	        a[m%10]=1;
	        n = n / 10; 
	        m = m /10;
	    }
	    for (i=0; i<=9; i++)
	        if (a[i]==0) return false;
	    return true;
	}
	public static void main(String[] args){
		int k;
	  Scanner sc=new Scanner(System.in);
	  int n =sc.nextInt();
	    for (k=1000; k<100000; k++) {
	        if (is_ok(k*n, k))
	            System.out.printf("%5d/%05d=%d\n", k*n, k, n); 
	}
   }
}
	
	