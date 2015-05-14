//课堂案例1——凑数指定数的奇偶性
import java.util.Scanner;

public class EventOrOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字：");
		int iNum = sc.nextInt();
		if(iNum%2==0){
			System.out.println ("数字"+ iNum +"为偶数");
		}
		else{
			System.out.println ("数字"+ iNum +"为奇数");

		}
	}

}
