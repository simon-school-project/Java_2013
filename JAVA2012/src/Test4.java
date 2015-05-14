public class Test4 {
	public static void main(String[] args) {
		int[] a=new int[10000];
		int count=0;
		for(int i=0;i<10000;i++)
		{
			a[i]=i+1;
			int sum=a[i];
			for(int j=1;j<=a[i];j++){
				sum=(int) Math.pow(j,j+1);				
			}
			if(sum<10000)
				count++;
		}
		int b=(10000-count);
		System.out.print(b);
	}
}
/*
用数组a来表示1~10000这些数的状态。 如果 a[i] = 1，表示这个数是次方数；如果a[i] = 0，表示这个数不是次方数。 初始状态下，所有数都不是次方数。

这里用到了数学函数 pow(i, j)，用于计算 i 的 j 次方。

C语言：

#include <stdio.h>
#include <math.h>
#define NN 10000
#define N  100
int main(int argc, char *argv[])
{
    int i, j, k, t, sum=0;
    int a[NN+1];
    for (i=1; i<=NN; i++) a[i] = 0;
    a[1] = 1;
    for (i=2; i<=N;i++)
        for (j=2; ;j++) {
            t = (int)pow(i, j);
            if (t>NN) break;
            a[t] = 1;
        }
    for (i=1; i<=NN; i++) sum += a[i];
    printf("%d\n", NN-sum);
    return 0;
}
JAVA语言：

public class Test {
    public static void main(String[] args) {
        int NN = 10000, N = 100;
        int i, j, k, t, sum = 0;
        int a[] = new int[NN + 1];
        for (i = 1; i <= NN; i++)
            a[i] = 0;
        a[1] = 1;
        for (i = 2; i <= N; i++)
            for (j = 2;; j++) {
                t = (int) Math.pow(i, j);
                if (t > NN)
                    break;
                a[t] = 1;
            }
        for (i = 1; i <= NN; i++)
            sum += a[i];
        System.out.printf("%d\n", NN-sum);
    }
}
*/