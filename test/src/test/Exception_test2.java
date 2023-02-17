package test;
import java.util.*;
public class Exception_test2 extends Exception{

	

	    public String toString() {
	        return "Invalid input";
	        
	    }
	    public String getMessage() {
	        return "Data is Stored";
	        
	    }



	   public static void main(String[] args)  {
	        // TODO Auto-generated method stub
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter String ::");
	        String s=sc.next();
	        if(!"harry".equals(s)) {
	            
	            try {
	                throw new Exception_test2();
	            }
	            catch(Exception e) {
	                System.out.println(e.toString());
	            
	            }
	            
	        }
	        else {
	            try {
	                
	                throw new Exception_test2();
	            }
	            catch(Exception e) {
	                System.out.println(e.getMessage());
	        }
	        
	    }



	}
	}
