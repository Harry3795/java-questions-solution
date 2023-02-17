package test;
import java.util.*;


public class ArrayList_loop_use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList al=new ArrayList();
		System.out.println("Add arrayList Element::");
		for(int i=1;i<=10;i++) {
			al.add(i);
		}
		System.out.println("Your Enter Element are ::");
		System.out.println(al);
		System.out.println("Your Enter even  Element are ::");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Integer I=(Integer) itr.next();
			if(I%2==0) {
				
				System.out.println(I);
			}
			else {
				 itr.remove();
			}
		}
		System.out.println("After looping Element Are ::");
		System.out.println(al);
	}

}
