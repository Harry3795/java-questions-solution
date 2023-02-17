package test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dup_prnt_string {

	public void str_prnt(String s){
		
		int count=0;  
		char[] c=s.toCharArray();
		Set dup=new HashSet();
		for(int i=0;i<c.length;i++) {
			
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j] && c[i]!=' ') {
					 //count++;  
					 
					 dup.add(c[i]);
					 //c[i]= '0';
				}
				
			}
		
//			if(count>0&&c[i]!='0') {
//				System.out.println(c[i]);
//			}
		}	System.out.println(dup+" "+"Total Duplicates are::"+dup.size());
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a character ::");
		
		
			String a=sc.nextLine();
	
			Dup_prnt_string ra=new Dup_prnt_string();
		    ra.str_prnt(a);
		
	}
} 
