package test;

import java.util.Scanner;

public class Root_quard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double r1,r2;
		System.out.println("Enter  value a");
		double a =sc.nextInt();
		System.out.println("Enter  value b");
		double b =sc.nextInt();
		System.out.println("Enter  value c");
		double c =sc.nextInt();
		double d=b * b - 4 * a * c;
		if(d>0) {
			 r1 = (-b + Math.sqrt(d)) / (2 * a);
		     r2 = (-b - Math.sqrt(d)) / (2 * a);
		     System.out.format("value r1 = %.2f and value r2 = %.2f", r1, r2);

		}
		else if (d == 0) {

		      r1 = r2 = -b / (2 * a);
		      System.out.format("value r1 = value r2 = %.2f;", r1);
		    }
		else {

		    
		      double real = -b / (2 * a);
		      double img = Math.sqrt(-d) / (2 * a);
		      System.out.format("value root 1  = %.2f+%.2fi", real, img);
		      System.out.format("value root 2 = %.2f-%.2fi", real, img);
		    }
		
	}
	
}
