package test;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a Character");
		Scanner sc=new Scanner(System.in);
		char s=sc.next().charAt(0);

		if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u' ) {
			System.out.println("character is vowel");
		}
		else {
			System.out.println("Character is not vowel");
		}
	}

}
