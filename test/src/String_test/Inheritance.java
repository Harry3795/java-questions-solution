package String_test;


public class Inheritance  {
	
	int a=100;
	public void input() {
		System.out.println(a);
	}
}
	
class A  extends Inheritance{
		int b=10;
		int c=this.b;
		public void input2() {
			System.out.println(b);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A in=new A();
		System.out.println("The  total Number After Adding ::"+(in.a+in.c));
	}

}
