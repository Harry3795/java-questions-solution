package test;




public class Inheritance_test {

	void a() {
		System.out.println("monalisa is spy in facebook ");
	}
	
}
class test extends  Inheritance_test{
	void b(){
		System.out.println("But On the other hand she is good girls and so hardworking and intelligent");
	}
}
class test2 extends Inheritance_test{
	void c(){
		System.out.println("she has lot of family  pressure to achieve banking sector job  ");
	}
}


class sagar{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2 sc=new test2();
		test t1=new test();
		sc.a();
		t1.b();
		sc.c();
	
	}
}
