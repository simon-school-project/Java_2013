import java.util.Scanner;
/*
�ڸ��Ǵ����У���10����ίΪ������ѡ�ִ�֣�����Ϊ1~100�֡�
ѡ�����÷�Ϊ��ȥ��һ����߷ֺ�һ����ͷֺ�����8��������ƽ��ֵ��
*/
public class  BT004
{
	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		double []score = new double[8];
		double max,min;
		double temp;//��ʱ����
		double avg=0.0;
		for (int i=0;i<score.length ; i++)
		{
			score[i] = sc.nextDouble();
			
		}
		//ð������
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
		min = score[0];//��Сֵ
		max = score[7];//���ֵ
		for (int i=0;i<score.length ;i++ )
		{
			avg +=score[i]; 
		}
		System.out.println("û��ȥ�������Сֵ���ܷ֣�"+avg);
		avg = avg-max-min;
		System.out.println("���ֵΪ��"+max+"��СֵΪ��"+min);

		System.out.println("����ܷ��ǣ�"+avg);

		System.out.println("���ƽ��ֵ��"+avg/8);
	}
}