//���ð���1��������ָ���İ뾶��Բ�����
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
		System.out.println("������뾶��");
		Scanner sc = new Scanner(System.in);
		fRadius = sc.nextFloat();
		fArea = PI*fRadius*fRadius;
		System.out.println("�뾶Ϊ"+fRadius+"��Բ�����Ϊ"+fArea);
	}

}
