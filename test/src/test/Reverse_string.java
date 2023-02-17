package test;

import java.util.Scanner;

public class Reverse_string {

	public String reverse(String c ) {
		String rev="";
		for(int i=c.length()-1;i>=0;i--) {
			rev=rev+c.charAt(i);
		}
//		System.out.println("Reverse String is :: "+rev);
		return rev;
	}
	
	public static void main(String[] args) {
		Reverse_string rs=new Reverse_string();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String ::");
		String s=sc.nextLine();
		String p=rs.reverse(s);
		System.out.println(p);
		
	}
}
