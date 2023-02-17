package overloading;

class Super {
    void show()
    {
        System.out.println("This is Parent Class");
    }
}
  
class Base extends Super {
  
    @Override
    void show()
    {
        System.out.println("This is child Class");
    }
}
 class A {
    public static void main(String[] args)
    {
     
    	Super obj1 = new Super();
        obj1.show();
        Base obj2 = new Base();
        obj2.show();
    }
}