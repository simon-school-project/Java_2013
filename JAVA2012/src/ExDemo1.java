//���ð���1�����������׳��쳣
public class ExDemo1 {
	static void throwDemo() throws IllegalAccessException{
		System.out.println("ִ���������׳��쳣�ķ���");
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
			System.out.println("������쳣Ϊ��"+e);
		}
		catch(IllegalAccessException e){
			System.out.println("������쳣Ϊ��"+e);
		}
	}

}
