package test;
import java.util.*;
public class Roman {
	
	public static int hashmap1(String p) {
		
		HashMap<Character,Integer> hm=new HashMap<>();
		hm.put('I', 1);
		hm.put('V',5);
		hm.put('X', 10);
		hm.put('L', 50);
		hm.put('C', 100);
		hm.put('D', 500);
		hm.put('M', 1000);
		
		int res=hm.get(p.charAt(p.length()-1));
		for(int i=p.length()-2;i>=0;i--) {
			if(hm.get(p.charAt(i))<hm.get(p.charAt(i+1))) {
				res-=hm.get(p.charAt(i));
			}
			else {
				res+=hm.get(p.charAt(i));
			}
		}
		return res;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roman ::");
		String s=sc.nextLine();
		Roman hh=new Roman();
		System.out.println(hh.hashmap1(s));
	}

}
