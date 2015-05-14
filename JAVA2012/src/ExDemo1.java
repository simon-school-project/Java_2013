//课堂案例1——声明和抛出异常
public class ExDemo1 {
	static void throwDemo() throws IllegalAccessException{
		System.out.println("执行声明了抛出异常的方法");
		throw new ArithmeticException();
		//throw new IllegalAccessException
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throwDemo();
		}
		catch(ArithmeticException e){
			System.out.println("捕获的异常为："+e);
		}
		catch(IllegalAccessException e){
			System.out.println("捕获的异常为："+e);
		}
	}

}
