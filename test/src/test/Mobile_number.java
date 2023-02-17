package test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Mobile_number {

	public void mobile(String a) {
		
		
	      String regex = "[6789][0-9]{9}";
	      boolean result = a.matches(regex);
	      if(result) {
	         System.out.println("valid number");				
	      } else {
	         System.out.println("not a valid number");
	      }
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter number : ");
	      String em = sc.next();
	      Mobile_number ev=new Mobile_number();
	      ev.mobile(em);
	}

}
