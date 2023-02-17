package String_test;

public class String_pool {

	
	
	int i;
	int j;
        void A() {
            i = 1;
            j = 2;
        } 	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s1=new String("you cannot change me");
		String  s2=new String("you cannot change me");
		System.out.println(s1==s2);

		String  s3="you cannot change me";
		System.out.println(s1==s3);

		String  s4="you cannot change me";
		System.out.println(s3==s4);

		String s5="you cannot "+"change me";
		System.out.println(s4==s5);
		
		String s6="you cannot ";
		String s7=s6+"change me";
		
		System.out.println(s4==s7);
		final String s8="you cannot ";
		
		String s9=s8+"change me";
		System.out.println(s9==s4);
		int ascii[] = { 65, 66, 67, 68};
        String str = new String(ascii, 0,3);
        System.out.println(str);
        final String str1="social";
        final String str2="media";
        String str3=str1+str2;
        String str4="socialmedia";
        System.out.println(str3==str4); 
        String JavaStr = "Are you a Java expert? Yes, you are.";
        System.out.println(JavaStr.length());
        String Str1 = " Java ";
        String Str2 = " is ";
        String Str3 = " awesome .";
        String StrResult  = Str1.trim() + Str2 + Str3.trim();
        System.out.println(StrResult);
        
        String_pool testObj = new String_pool();
	     System.out.print(testObj.toString());
	     String x = "techbeamers";
	     String y = new String(new char[] { 't', 'e', 'c', 'h', 'b', 'e', 'a', 'm', 'e', 'r', 's' });

	     System.out.println(x == y);
	     System.out.println("kjk");
	     System.out.println(x.equals(y));
	     System.out.println(Integer.parseInt("10"));
	     
	     StringBuilder sb = new StringBuilder("top 30 Java String interview questions.");
	     System.out.println(sb.length());
	     
	    
	}

}
