//课堂案例2——使用数据类型

public class SimpleCal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int iNum1 = 3;
		float fNum2=2;
		double dResult = 0;
		dResult = 1.5+ iNum1/fNum2;
		System.out.println("result1="+dResult);
		dResult = 1.5+ (double)iNum1/fNum2;
		System.out.println("result2="+dResult);
		dResult = 1.5+ iNum1/(int)fNum2;
		System.out.println("result3="+dResult);
		
	}

}
