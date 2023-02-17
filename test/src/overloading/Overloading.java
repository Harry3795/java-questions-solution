package overloading;

	public class Overloading {
		  
	    public int Overloading1(int x, int y) {
	    	return (x + y); 
	    	}
	  
	    public int Overloading1(int x, int y, int z){
	        return (x + y + z);
	    }
	 
	    public double Overloading1(double x, double y){
	        return (x + y);
	    }
	
	    public static void main(String args[])
	    {
	    	Overloading s = new Overloading();
	        System.out.println(s.Overloading1(10, 20));
	        System.out.println(s.Overloading1(10, 20, 30));
	        System.out.println(s.Overloading1(10.5, 20.5));
	    }
	}