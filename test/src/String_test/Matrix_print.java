package String_test;

import java.util.Scanner;

public class Matrix_print {
	public static void main(String[] args) {
		System.out.println("Enter Matrix Row ::");
		
		Scanner sc=new Scanner(System.in);
		int row =sc.nextInt();
		System.out.println("Enter Matrix Col ::");
		int col =sc.nextInt();
		int[][] matrix=new int[row][col];
		System.out.println("Enter Matrix Element ::");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("You Entered Matrix is ::");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Checking Daingonal ::");
		int count=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix.length;j++) {
				if(i-j==0 && i!=0 &&j!=0
						) {
					count=1;
					
//					System.out.println("Unit Matrix");
					break;
				}
				else {
					count=0;
//					System.out.println("Not a Unit Matrix");
					break;
				}
			}
		}
		if(count==0) {
			System.out.println("not");
		}
		else if(count==1){
			System.out.println("mat");
		}
		
	}
}
