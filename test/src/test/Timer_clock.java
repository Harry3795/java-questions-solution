package test;
import java.util.*;
import java.util.Timer;

public class Timer_clock {

	public static void main(String[] args) {
		
	Timer_clock tc=new Timer_clock();
	tc.runTimer();
	}
	
		// TODO Auto-generated method stub
		Timer tm=new Timer();
		int i=0;
		TimerTask tt=new TimerTask() {
		public void run() {
			System.out.println(i);
			i++;
			getTime(i);
		} 
		
		};
	public void runTimer() {
		tm.schedule(tt,0,1000);

	}
	protected void getTime(int i2) {
		// TODO Auto-generated method stub
		
	}
		
}

