package String_test;

public class String_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		String create a new objects
					
		String s=new String("Harry");
		String s4=new String("Harry");
		System.out.println(s.equals(s4));
		System.out.println(s==s4);
		s.concat("Sharma");
		System.out.println(s);

		
		StringBuffer s1=new StringBuffer("Harry");
		StringBuffer s5=new StringBuffer("Harry");
		System.out.println(s1.equals(s5));
		s1.append(" sharma");
		System.out.println(s1==s5);
		System.out.println(s1);
		
	}

}
