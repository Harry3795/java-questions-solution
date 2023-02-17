package test;

import java.util.*;

public class Rev_array {
	public void rev_arr(String arr[]) {
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of the Array ::");
		int s=sc.nextInt();
		System.out.println("Enter Array element ::");
		String[] a=new String[s];
		for(int i=0;i<s;i++) {
			a[i]=sc.nextLine();
		}
		Rev_array ra=new Rev_array();
		ra.rev_arr(a);
		
	}
}
