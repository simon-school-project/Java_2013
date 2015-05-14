
public class Maths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum;
		int a,b,c;
		for(int i=100;i<999;i++)
		{
			sum=Math.pow(i,2);
			a=(int)sum%10;
			b=(int)sum/10%10;
			c=(int)sum/100%10;
			if((c*100+b*10+a) == i){
				System.out.println(i);
			}
		}
	}

	

}
