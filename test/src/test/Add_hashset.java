package test;
import java.util.*;
public class Add_hashset {

	
	void hashset(int l) {
		Scanner sc=new Scanner(System.in);
		HashSet hs=new HashSet();
		System.out.println("Insert item ::");
		for(int i=0;i<l;i++) {
			hs.add(sc.nextInt());
		}
		
		System.out.println("your Enter element ::");
		System.out.println(hs);
		Iterator itr=hs.iterator();
		int sum=0;
		while(itr.hasNext()) {
			sum=sum+(int)itr.next();
	
//		for(Object itr1:hs) {
//			sum+=(int)itr.next();
//		}
		
	}
		System.out.println("sum"+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p;
		Add_hashset ah=new Add_hashset();
		ah.hashset(5);
	}

}
