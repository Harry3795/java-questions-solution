package String_test;

import java.util.Scanner;

public class Java_apptad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello apptad");
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter size of the Array ::");
		int size=sc.nextInt();
		int temp=0;
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Shorting of the Array is ::");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		} 
		
		
	}

}
