package test;

public class Array_missing {

	
		public static void main(String args[]){  
		    //For positive number, >> and >>> works same  
			short a=10;  
			short b=10;  
			//a+=b;//a=a+b internally so fine  
			a=(short) (a+b);//Compile time error because 10+10=20 now int  
			System.out.println(a);  
		
		}
		}  
	

