import java.util.Scanner;
public class Abcd {
	  public static void main(String[] args)
	  {   int n,i,j,max;
	  	Scanner sc = new Scanner(System.in);
	  	n=sc.nextInt();
	  	int a[][]= new int[n][n];
	  	for(i=0;i<n;i++)
	  		{
		  		for(j=0;j<n;j++)
		  	   {
		  			a[i][j]=sc.nextInt();
		  	    }
	  	   }
	       max=a[0][0];
	       for(i=0;i<n;i++)
	       	for(j=0;j<n;j++)
	       	{
	  	    if(max<a[i][j])
	       	max=a[i][j];
	          System.out.print(max);
	          System.out.print(i);
	          System.out.print(j);
	  	    }
	      
	  	    
	  }
	         

}
