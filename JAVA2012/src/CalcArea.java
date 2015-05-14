//课堂案例1——根据指定的半径求圆的面积
import java.util.Scanner;

public class CalcArea {
	static final float PI=3.14f;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float fRadius;
		float fArea = 0;
		System.out.println("请输入半径：");
		Scanner sc = new Scanner(System.in);
		fRadius = sc.nextFloat();
		fArea = PI*fRadius*fRadius;
		System.out.println("半径为"+fRadius+"的圆的面积为"+fArea);
	}

}
