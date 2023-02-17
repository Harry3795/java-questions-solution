package test;
import java.util.*;
public class Hashset_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter hashset Element ::");
		
		HashSet hs=new HashSet();
	
		for(int i=0;i<10;i++) {
			hs.add(sc.nextInt());
		}
		System.out.println("your Entered Element are ::");
		System.out.println(hs);
	
		System.out.println("Using Iterator loop ::");
		Iterator<Integer> itr=hs.iterator();
		int sum=0;
//		while(itr.hasNext()) {
//			sum+=(int) (itr.next());
//		}
//		System.out.println(sum);
		for(Object itr1:hs) {
			sum+=(int) (itr.next());
			
//			if(itr.next()%2==0) {
//				System.out.println(hs);
//			}
		}
		System.out.println(sum);
	}

}
