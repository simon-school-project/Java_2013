
public class TestB {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPrimes(5));
	}
	

/**  
 * �ж�����һ�������Ƿ�����  
 *   
 * @param n  
 * @return boolean  
 */  
public static boolean isPrimes(int n)   
{   
    for (int i = 2; i <= Math.sqrt(n); i++)   
    {   
        if (n % i == 0)   
        {   
            return false;   
        }   
    }   
    return true;   
}  


}
