/*��Ȼ����ƽ�����ǣ�1 4 9 16 25 ��
��Ȼ�����������ǣ�1 8 27 64 125 ��
��Ȼ����4�η����ǣ�1 16 81 256 ��
��
��Щ���ֶ����Գ�Ϊ�η�����
1~10000�У�ȥ�����еĴη�������ʣ�»ش�����֡�
*/
import java.math.*;
public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int [10000];
		int count=0;
		for(int i=0; i<10000; i++)
			{a[i]=i+1;}
	
		for(int j=1; j<=10000; j++)
			for(int s=2; s<=10000; s++)
				for(int i=0; i<10000; i++)
			{
				if(pow(j,s)==a[i])
					{a[i]=0;
					break;}
				
			}
	for(int i=0; i<10000; i++)
	{
		if(a[i]!=0)
			{count++;}
		System.out.println(count);	
	}
		
	}

	private static int pow(int j, int s) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
