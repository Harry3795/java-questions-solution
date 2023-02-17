package test;

public class This_try {
	
//	int i;
//	public void intial1(int i) {
//		this.i=i;// this keyword refer current class intance variable that is int i;
//	}
//	public void disp() {
//		System.out.println("The number is intialize by "+i);
//	}
	
	void p() {
		System.out.println(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_try sc=new This_try();
//		sc.intial1(10);
//		sc.disp();
//		
		System.out.println(sc);
		sc.p();
		
	}

}
