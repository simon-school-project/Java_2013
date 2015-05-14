import java.util.Scanner;
public class  BT010
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		int i = 10;  
        System.out.println("十进制数 " + i +" 转换成十六进制为 " + Integer.toHexString(i));  
        System.out.println("十进制数 " + i +" 转换成八进制为 " + Integer.toOctalString(i));  
        System.out.println("十进制数 " + i +" 转换成二进制为 " + Integer.toBinaryString(i));  
        String str = "A" ;  
        System.out.println("十六进制数 " + str + " 转换成10进制为 "+Integer.parseInt(str,16));  
        str = "12";  
        System.out.println("八进制数 " + str + " 转换成10进制为 "+Integer.parseInt(str,8));  
        str = "1010";  
        System.out.println("二进制数 " + str + " 转换成10进制为 "+Integer.parseInt(str,2));  
	}
}