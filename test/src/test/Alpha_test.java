package test;
import java.util.*;
public class Alpha_test {
	public boolean checkIfPangram(String sentence) {
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        //StringBuilder output = new StringBuilder();
        for (int i= 0 ; i< alphabet.length(); i++){
            if(!sentence.contains(String.valueOf(alphabet.charAt(i)))){
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Alphabet ::");
		String s=sc.nextLine();
		Alpha_test al=new Alpha_test();
		al.checkIfPangram(s);
		if(al.checkIfPangram(s)==false) {
			System.out.println("not present ");
		}
		else {
			System.out.println("present");
		}
	}

}
