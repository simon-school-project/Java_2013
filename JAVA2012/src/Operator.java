//课堂案例3——使用运算符和表达式
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum1=7,iNum2=5,iNum3=10;
		System.out.println("---条件：iNum1=7 iNum2=5 iNum3=10");
		System.out.println("x除以y的结果为："+iNum1/iNum2);
		System.out.println("x除以y的余数为："+iNum1%iNum2);
		System.out.println("x>=y的结果为："+(iNum1>iNum2));
		System.out.println("x==y的结果为："+(iNum1==iNum2));

		boolean bFirst,bSecond;
		bFirst = iNum1>iNum2;
		bSecond = iNum1<iNum2;
		System.out.println("\n---条件：a=x>y:"+bFirst+"b=x<z:"+bSecond);
		System.out.println("a与(&)b的结果为："+(bFirst&bSecond));
		System.out.println("a或b(|)的结果为:"+(bFirst|bSecond));
		System.out.println("a与b异或的结果为："+(bFirst^bSecond));
		System.out.println("a与(&&)b的结果为："+(bFirst&&bSecond));
		System.out.println("a或的b(||)结果为："+(bFirst||bSecond));
		System.out.println("a取反后或b的结果为："+(!bFirst|bSecond));
		System.out.println("a或b的结果取反为："+(!bFirst|bSecond));

		int iTemp = 12;
		System.out.println("\n---条件：x=7 iTemp=10");
		iTemp+=iNum1;
		System.out.println("iTemp+=x结果为"+iTemp);
		iTemp-=iNum1;
		System.out.println("iTemp-=x结果为："+iTemp);
		iTemp*=iNum1;
		System.out.println("iTemp*=x结果为："+iTemp);
		iTemp/=iNum1;
		System.out.println("iTemp/=x结果为："+iTemp);

		int iResult = (iNum1>4)?iNum2:iNum3;
		System.out.println("d=(x>4)?y:z的结果为："+iResult);

	}

}
