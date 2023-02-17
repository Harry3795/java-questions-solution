package test;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Collection_prgm {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* al=new ArrayList();
		al.add("Harry");
		al.add(37);
		al.add('p');
		System.out.println(al);
		
		//al.forEach((n) -> System.out.println(n));
	for(Object a: al) {
		System.out.println(a);
	}

		HashMap hm = new HashMap();
		
		hm.put(101, "hello");
		hm.put(102, "harry");
		hm.put(131, "bhai");
		System.out.println(hm);
	*/
		
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(101);
		al.add(100);
		al.add("harry");
		al.add('a');
		System.out.println(al);
		ArrayList al2 = new ArrayList();
		al2.add("pradeep");
		al2.add("sharma");
		al.addAll(al2);
		System.out.println(al.contains("harry"));
		
		System.out.println(al);
	
	}
	}


