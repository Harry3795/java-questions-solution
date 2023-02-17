package test;

import java.util.*;

public class Reverse_integer {
	HashSet<Integer> s = new HashSet<Integer>();

	public void rev_num(int a, int b) {

		int rev = 0;
		for (int j = a; j <= b; j++) {

			for (int i = j; i > 0; i /= 10) {
				rev = rev * 10 + (i % 10);

			}
			if (j == rev) {

				s.add(j);
				
			}
//			
			Iterator<Integer> it = s.iterator();
			while(it.hasNext()) {
				  System.out.println(it.next());
				}


		}
		

	    // Print the first item
	   // System.out.println(it.next());
	//return it.next();
	}

	public static void main(String[] args) {
		Reverse_integer ri = new Reverse_integer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ::");
		int n = sc.nextInt();
		System.out.println("Enter b Number ::");
		int n1 = sc.nextInt();
//		System.out.println(ri.rev_num(n, n1));
		ri.rev_num(n, n1);
	}

}
