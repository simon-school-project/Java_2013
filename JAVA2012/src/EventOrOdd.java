//���ð���1��������ָ��������ż��
import java.util.Scanner;

public class EventOrOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("���������֣�");
		int iNum = sc.nextInt();
		if(iNum%2==0){
			System.out.println ("����"+ iNum +"Ϊż��");
		}
		else{
			System.out.println ("����"+ iNum +"Ϊ����");

		}
	}

}
