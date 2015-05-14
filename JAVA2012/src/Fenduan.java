import java.util.Scanner;
import java.util.*;

public class Fenduan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		double m ;
		if (x<0) {
			m = fabs(x);
		} 
		else if (x>=0&&x<2) {
			m = sqrt(x+1);
		} 
		else if (x>=2&&x<4) {
			m = pow(x+2,5);
		}
		else {
			m = 2*x+5;
		}
		System.out.printf("%.2f", m);
		
	}

	private static double pow(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static double sqrt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static double fabs(int x) {
		// TODO Auto-generated method stub
		return 0;
	}

}
