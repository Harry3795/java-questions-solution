package test;
import java.util.*;
public class Vector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		
		v.addElement(12345);
		v.add("pradeep");
		v.add("harry");
		System.out.println(v);
		
		System.out.println(v.lastElement());
		Enumeration e=v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	
	}

}
