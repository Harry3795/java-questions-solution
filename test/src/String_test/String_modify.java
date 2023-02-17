package String_test;

final class String_modify {
	
	
	
         	//	CREATE OUR OWN  IMMUTABLE CLASS THAT CAN NOT MODIFY
	private int i;
	 String_modify(int i){
		this.i=i;
	}
	 public String_modify modify(int i) {
		 if(this.i==i) {
			 return this;
		 }
		 else {
			 return new String_modify(i);
		 }
	 }
	
	public static void main(String[] args) {
		
		String_modify sm=new String_modify(10);
		String_modify sm1=sm.modify(100);
		String_modify sm2=sm.modify(10); 
		System.out.println(sm==sm1);
		System.out.println(sm==sm2);
	}
}
