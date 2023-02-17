package test;

import java.util.HashMap;
import java.util.*;

public class Roman_integer {

	
	public int  rom_int(String p) {
		
		HashMap<Character,Integer> hs=new HashMap<>();
		hs.put('I', 1);
		hs.put('V', 5);
		hs.put('X', 10);
		hs.put('L', 50);
		hs.put('C', 100);
		hs.put('D', 500);
		hs.put('M', 1000);
	
		int  res=hs.get(p.charAt(p.length()-1));
		for(int i=p.length()-2;i>=0;i--) {
			if(hs.get(p.charAt(i))<hs.get(p.charAt(i+1))) {
				res-=hs.get(p.charAt(i));
			}
			else {
				res+=hs.get(p.charAt(i));
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roman number to change into Integer ::");
		String s=sc.nextLine();
		Roman_integer ri=new Roman_integer();
		
		System.out.println(ri.rom_int(s));
	}
}
