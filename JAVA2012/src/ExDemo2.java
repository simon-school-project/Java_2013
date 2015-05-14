//课堂案例2——处理异常
public class ExDemo2 {
	static void calculate() throws IllegalAccessException{
		int c[]={1,2};
		c[5]=60;
		int a = 0;
		System.out.println("a="+a);
		int b= 50/a;
		throw new IllegalAccessException();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			calculate();
		}
		catch (IllegalAccessException e){
			System.out.println("非法存取："+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("数组越界："+e);
		}
		catch(ArithmeticException e){
			System.out.println("被0整除："+e);
		}
		finally{
			System.out.println("最后执行的语句！");
		}
	}

}
