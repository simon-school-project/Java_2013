package me.loveyous.xueyao.ui;

import java.util.Scanner;



public class isLeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean leap;
		int year;
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		if (year%4==0) 
		{
			if (year%100==0) 
			{
				if (year%400==0)
				{
					leap=true;
				}else 
				{
					leap=false;	
				}
			}else 
			{
				leap=true;
			}
			}else 
		{
				leap=false;
		}
		
		if (leap) 
		{
			System.out.println(year+":是闰年");
		}else {
			System.out.println(year+":不是闰年");
		}
	}
	
}
