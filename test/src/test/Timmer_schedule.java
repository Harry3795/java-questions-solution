package test;
import java.util.Timer;
import java.util.TimerTask;

class Helper extends TimerTask
{
    public static int i = 10;
    public void run()
    {
    	
    	if(i>=0) {
        System.out.println("COUNTDOWN " + i--);
		    if(i== -1) {
		    	
		    	System.out.println("lets run the program");
		    }
    	}
    }
}
public class Timmer_schedule {
	 
	
	
	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		  Timer timer = new Timer();
	        TimerTask task = new Helper();
	          
	        timer.schedule(task, 1, 1000);
	          
	}

}
