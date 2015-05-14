/*
 * 三个神秘蒙面人来访F博士。

博士询问他们年龄时，他们说：我们中年龄最小的不超过19岁。我们3人年龄总和为70岁。且我们三人年龄的乘积是所有可能情况中最大的。


请帮助F博士计算他们的年龄，从小到大排列，用逗号分开。
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		for(int i=1;i<=19;i++)
			for(int j=1;j<51;j++)
				for(int s=1;s<51-i;s++)
					if(i+j+s==70 && i*j*s==12350)
						{System.out.println(i);
						System.out.println(j);
						System.out.println(s);
						}
	}

}
