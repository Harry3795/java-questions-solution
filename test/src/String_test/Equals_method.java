package String_test;

public class Equals_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="HARRY";

//		equals method check with case sensitivity
		System.out.println(s.equals("harry"));
		
//		equalIgnoreCase method not check case sensitivity
		System.out.println(s.equalsIgnoreCase("harry"));

	}

}
