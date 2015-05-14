//课堂案例3——自定义异常
public class ExDemo3 {
	static void compute(int a) throws MyException{
		System.out.println("调用compute("+ a +")");
		if(a>10)
			throw new MyException(a);
		System.out.println("正常退出");
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			compute(1);
			compute(20);
		}
		catch(MyException e){
			System.out.println("捕获的异常为："+ e);
		}
	}

}

class MyException extends Exception{
	private int detail;
	MyException(int a){
		detail = a;
		
	}
	@Override
	public String toString(){
		return "自定义的MyException["+ detail + "]";
	}
}