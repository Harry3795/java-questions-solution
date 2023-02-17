package String_test;

import java.util.Scanner;

public class Prime_print {
	
	   void  prime1(int start,int last ) {
		 int count;
		 int i;
			for(i=start; i<last;i++) {
				count=0;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						count=1;
						break;
					}
				}
				if(count==0) {
					System.out.print(i+ " ");
				}
			}
			
		 
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Intial Value ::");
		int start=sc.nextInt();
		System.out.println("Enter Last Value ::");
		int last=sc.nextInt();
		Prime_print pp=new Prime_print();
		pp.prime1(start,last);
		
		
	}

}
