import java.util.Scanner;
public class  BT010
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int i = 10;  
        System.out.println("ʮ������ " + i +" ת����ʮ������Ϊ " + Integer.toHexString(i));  
        System.out.println("ʮ������ " + i +" ת���ɰ˽���Ϊ " + Integer.toOctalString(i));  
        System.out.println("ʮ������ " + i +" ת���ɶ�����Ϊ " + Integer.toBinaryString(i));  
        String str = "A" ;  
        System.out.println("ʮ�������� " + str + " ת����10����Ϊ "+Integer.parseInt(str,16));  
        str = "12";  
        System.out.println("�˽����� " + str + " ת����10����Ϊ "+Integer.parseInt(str,8));  
        str = "1010";  
        System.out.println("�������� " + str + " ת����10����Ϊ "+Integer.parseInt(str,2));  
	}
}