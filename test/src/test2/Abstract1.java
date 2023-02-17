package test2;

import java.util.*;

public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		using HashSet,count the element present in Array
	
		
		List<String> li=Arrays.asList("p","r","a","d","e","e","e","h");
		
		
		Set<String> hs=new HashSet<>(li);
	
//		for(String s:hs) {
//			
//			System.out.println(s+" : "+Collections.frequency(li,s));
//		
//		}
		
		
		
		int count=0;
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
		
			if(!itr.next().equals(null)) {
				count++;
			}
//			else {
//				count ++;
//				
//			}
//			System.out.println(itr.next());
		}
		System.out.println("count is "+count);
		
	
//		using HashMap,count the element present in Array
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Please Enter Array Element ::");
		
		
//		List<String> li=Arrays.asList("n","p","l","m","m","l");
//		Map<String, Integer> hm=new HashMap<>();
//		List<String> frequencyMap;
//		for(String s:li) {
//			
//			String count= frequencyMap.get(s);
//			if(count==null) {
//				count=0;
//			}
//			
//			 frequencyMap.put(s,count+1);
//		}
//		for(Map.Entry<String, Integer> entry: frequencyMap.entrySet()) {
//						
//			System.out.println(entry.getKey()+" :"+entry.getValue());
//			
//		}
		
	}
}

















