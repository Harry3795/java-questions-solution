package test;
import java.util.*;
public class Exception_test {
	
	
	public int checjk(String a) {
		
		if(a.equals("harry")) {
			return 1;
			
		}	return 0;
	
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter String ::");
		String s=sc.nextLine();
		Exception_test et=new Exception_test();
		et.checjk(s);
		
		try {
		
			int i=2/et.checjk(s);
			System.out.println("data is saved");
			}
		
		catch(Exception e) {
			throw new Exception("it not store data");
//		System.out.println("Data is not stored");
		}
		}
		
	
	}


