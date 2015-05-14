import java.util.Scanner;
/*
在歌星大奖赛中，有10个评委为参赛的选手打分，分数为1~100分。
选手最后得分为：去掉一个最高分和一个最低分后其余8个分数的平均值。
*/
public class  BT004
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		double []score = new double[8];
		double max,min;
		double temp;//临时变量
		double avg=0.0;
		for (int i=0;i<score.length ; i++)
		{
			score[i] = sc.nextDouble();
			
		}
		//冒泡排序法
		for ( int i=0;i<score.length-1 ;i++ )
		{
			for (int j=0;j<score.length-1-i ;j++ )
			{
				if (score[j]>score[j+1])
				{
					temp = score[j];
					score[j]= score[j+1];
					score[j+1] = temp;
				}
			}
			
		}
		min = score[0];//最小值
		max = score[7];//最大值
		for (int i=0;i<score.length ;i++ )
		{
			avg +=score[i]; 
		}
		System.out.println("没有去掉最大、最小值的总分："+avg);
		avg = avg-max-min;
		System.out.println("最大值为："+max+"最小值为："+min);

		System.out.println("你的总分是："+avg);

		System.out.println("你的平均值："+avg/8);
	}
}