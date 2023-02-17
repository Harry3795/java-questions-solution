package String_test;

public class Vowel_count {
	
	public static void main(String[] args) {
		int count=0;
		String p1="Pradeep kumar";
		String p=p1.toLowerCase();
		int reex = p.replaceAll("[^aeiouAEIOU]","").length();
		System.out.println(reex);
//		boolean g=p.matches(reex);
		for(Integer i=0;i<=p.length()-1;i++) {
			
//			if(p.charAt(i) =='a'|| p.charAt(i) =='e'|| p.charAt(i) =='i'||p.charAt(i) =='o'||p.charAt(i) =='u') {
//				count++;
//				
//			}
			
//			if((p.charAt(i)).equals(reex)) {
//								
//					count++;
//			}
//			else {
//				count--;
//			}
			
		}
		System.out.println("The total vowel is ::"+count);
		
	}
	
}
