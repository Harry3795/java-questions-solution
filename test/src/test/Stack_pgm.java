package test;

import java.util.*;

public class Stack_pgm {
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s=new Stack<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element ::");
		if(s.isEmpty()) {
			for(int i=0;i<=5;i++) {
				
				s.push(sc.nextInt());
			}
		}
		System.out.println("You Inserted in Stack Element is :: ");
		
		while(!s.empty()) {
			
			System.out.println(s.pop());
			
		}
//		System.out.println(s.search(4));
		//System.out.println("Element is :: ");
		//Iterator itr=s.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
			
		}
		
	}


