//���ð���2���������쳣
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
			System.out.println("�Ƿ���ȡ��"+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("����Խ�磺"+e);
		}
		catch(ArithmeticException e){
			System.out.println("��0������"+e);
		}
		finally{
			System.out.println("���ִ�е���䣡");
		}
	}

}
