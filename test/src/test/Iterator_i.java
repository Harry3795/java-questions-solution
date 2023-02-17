package test;
import java.util.*;
public class Iterator_i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add(null);
		al.add("pradeep");
		al.add("sagar");
		
		System.out.println(al);
		
		ListIterator li=al.listIterator();
//		Iterator itr=al.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//			System.out.println(itr.hashCode());
//					
//		}
//		while(itr.hasNext()) { 
//			System.out.println(itr.next());
//			System.out.println(itr.hashCode());
//			
//		}
		
		while(li.hasNext()) {
			System.out.println(li.next());
			System.out.println(li.hashCode());
			
		}
		
		System.out.println("--------------------------------");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
			System.out.println(li.hashCode());
			
		}
		
//		System.out.println("using for loop::::::::::::");
//		for(String s:al) {
//			
//			System.out.println(s);
//		}
	}

}
