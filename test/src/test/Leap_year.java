package test;

import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Year to check Leap Year");
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
//		if(year%4==0) {
//			if(year%100==0) {
//				if(year%400==0) {
//					System.out.println("leap year");
//				}
//				else {
//					System.out.println("not leap year");
//				}
//				}
//				else 
//				{
//					System.out.println("leap year");
//				}
//			}
//		else {
//			System.out.println("not leap year");
//		}

	if((year%4==0) && (year%100!=0)|| (year%400==0)) {
		System.out.println("leap year");
	}
	else {
		System.out.println("not leap year");
	}
	}

}
