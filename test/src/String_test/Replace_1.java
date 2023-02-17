package String_test;

public class Replace_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="harryhhhhh";
		System.out.println(s.replace('h', 'p'));
		
//		substring   
		String s1="abcedefwghjhg";
		System.out.println(s1.substring(1));//begin to end 
		
		
		System.out.println(s1.substring(3, 8));//between begin to end point that is given
		System.out.println(s1.indexOf('g'));
		
		System.out.println(s1.lastIndexOf('g'));
	}

}
