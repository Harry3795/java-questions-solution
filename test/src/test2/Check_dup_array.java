package test2;
import java.util.*;
public class Check_dup_array {
	public static void main(String[] args) {
		String arr[]={ "P", "Q", "R" };
		String arr2[]={ "P", "Q", "p","m" };
		
		Set<String> set=new HashSet<>(Arrays.asList(arr));
		Set<String> set1=new HashSet<>(Arrays.asList(arr2));
		
		if(set.equals(set1)) {
			System.out.println("Array Element is Same.");
		}else {
			System.out.println("Array is not Same. ");
		}
		
		
//		String[] chars = { "A", "B", "C", "A", "C", "A" };
//        Map<String, Integer> freq = new HashMap<>();
//        for (String s: chars) {
//            freq.merge(s,3, Integer::sum);
//        }
//
//         System.out.println(freq);
//		
	}
}
