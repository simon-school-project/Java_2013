//���ð���3����ʹ��������ͱ��ʽ
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum1=7,iNum2=5,iNum3=10;
		System.out.println("---������iNum1=7 iNum2=5 iNum3=10");
		System.out.println("x����y�Ľ��Ϊ��"+iNum1/iNum2);
		System.out.println("x����y������Ϊ��"+iNum1%iNum2);
		System.out.println("x>=y�Ľ��Ϊ��"+(iNum1>iNum2));
		System.out.println("x==y�Ľ��Ϊ��"+(iNum1==iNum2));

		boolean bFirst,bSecond;
		bFirst = iNum1>iNum2;
		bSecond = iNum1<iNum2;
		System.out.println("\n---������a=x>y:"+bFirst+"b=x<z:"+bSecond);
		System.out.println("a��(&)b�Ľ��Ϊ��"+(bFirst&bSecond));
		System.out.println("a��b(|)�Ľ��Ϊ:"+(bFirst|bSecond));
		System.out.println("a��b���Ľ��Ϊ��"+(bFirst^bSecond));
		System.out.println("a��(&&)b�Ľ��Ϊ��"+(bFirst&&bSecond));
		System.out.println("a���b(||)���Ϊ��"+(bFirst||bSecond));
		System.out.println("aȡ�����b�Ľ��Ϊ��"+(!bFirst|bSecond));
		System.out.println("a��b�Ľ��ȡ��Ϊ��"+(!bFirst|bSecond));

		int iTemp = 12;
		System.out.println("\n---������x=7 iTemp=10");
		iTemp+=iNum1;
		System.out.println("iTemp+=x���Ϊ"+iTemp);
		iTemp-=iNum1;
		System.out.println("iTemp-=x���Ϊ��"+iTemp);
		iTemp*=iNum1;
		System.out.println("iTemp*=x���Ϊ��"+iTemp);
		iTemp/=iNum1;
		System.out.println("iTemp/=x���Ϊ��"+iTemp);

		int iResult = (iNum1>4)?iNum2:iNum3;
		System.out.println("d=(x>4)?y:z�Ľ��Ϊ��"+iResult);

	}

}
