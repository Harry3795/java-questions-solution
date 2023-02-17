package test;
import java.util.*;
import java.util.regex.*;


public class Email_validation {

	public void email1(String a) {
		
		
	      String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+.com";
	      
	      //Pattern p= Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+.com");
	      boolean result = a.matches(regex);
	      if(result) {
	         System.out.println("valid  email Address");		
	      } else {
	         System.out.println("not a valid email address");
	      }
		
	}
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your Email: ");
	      String em = sc.next();
	      Email_validation ev=new Email_validation();
	      ev.email1(em);
	}

}
