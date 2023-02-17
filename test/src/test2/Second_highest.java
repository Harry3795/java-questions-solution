package test2;
import java.util.*;
public class Second_highest {
	Scanner sc=new Scanner(System.in);
	String
	 a;
//	String a=sc.next();
int b;
//	String b=sc.next();
	 public void a() {
		 System.out.println("Enter a::");
//		 String a=sc.next();
		 int a=sc.nextInt();
		 System.out.println("Enter b::");
//		 String b=sc.next();
		 int b=sc.nextInt();
		 if(a==b) {
			 System.out.println("true1");
			 
		 }
		 else {
			 System.out.println("flase1");
			 
		 }
	 } 
		 
	
	
	public static void main(String[] args) {
		
//		int arr[]= {12,1,3,4,5,6,7,8,9};
//		Set<Integer> hs=new HashSet(Arrays.asList(arr));
//		System.out.println(Math.pow(2, 1));
		Second_highest sh=new Second_highest();
		Second_highest sh1=new Second_highest();

		sh1.a="10";
		sh.a=new String ("10");
		sh1.b=20;
		System.out.println(sh.a + sh.b+sh1.a+sh1.b);
//		sh.a();
		
		if(sh1.a==sh.a) {
			 System.out.println("true1");
				}
		else
		{
			
			System.out.println("flase1");
		}
		
		if((sh1.a).equals(sh.a)) {
			 System.out.println("true");
				}
		else
		{
			
			System.out.println("flase");
		}

 }
	

}
