/*
 * ������������������F��ʿ��

��ʿѯ����������ʱ������˵��������������С�Ĳ�����19�ꡣ����3�������ܺ�Ϊ70�ꡣ��������������ĳ˻������п�����������ġ�


�����F��ʿ�������ǵ����䣬��С�������У��ö��ŷֿ���
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		for(int i=1;i<=19;i++)
			for(int j=1;j<51;j++)
				for(int s=1;s<51-i;s++)
					if(i+j+s==70 && i*j*s==12350)
						{System.out.println(i);
						System.out.println(j);
						System.out.println(s);
						}
	}

}
