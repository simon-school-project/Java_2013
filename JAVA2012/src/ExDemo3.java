//���ð���3�����Զ����쳣
public class ExDemo3 {
	static void compute(int a) throws MyException{
		System.out.println("����compute("+ a +")");
		if(a>10)
			throw new MyException(a);
		System.out.println("�����˳�");
		
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
			System.out.println("������쳣Ϊ��"+ e);
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
		return "�Զ����MyException["+ detail + "]";
	}
}