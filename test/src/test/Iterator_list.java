package test;
import java.util.*;
public class Iterator_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Item in LinkedList ::");
		LinkedList ll=new LinkedList();
		for(int i=0;i<3;i++) {
			ll.add(sc.nextLine());
		}
		System.out.println("your Enter data is ::");
		System.out.println(ll);
		ListIterator itr=ll.listIterator();
		while(itr.hasNext()) {
			String s=(String) itr.next();
			
			if(s.equals("harry")) {
				
				itr.add("sagar2");
				//System.out.println(lt);
			}
			
			else if(s.equals("rakesh")) {
				itr.remove();
				System.out.println("hgjhg");
			}
			else if(s.equals("nainital")) {
				ll.set(2,"kullu and Manali");
			}
		}
		System.out.println("After Performing Task ::");
		System.out.println(ll);
		
	}

}
