import java.util.Scanner;


public class tiaohe {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int m = sc.nextInt();
	
		
//		double x2 = sc.nextDouble();
//		double y2 = sc.nextDouble();
//		
//		double sum = 0;
//		sum = Math.abs(Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
	//	System.out.printf("%.3f",sum);
		if (n%6==0) {
			System.out.println("Right!");
			System.out.println("Great!");
		}
		else {
			System.out.println("Wrong!");
			System.out.println("Soory!");
		}
		
	}

}
