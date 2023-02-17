package test;

import java.util.Timer;
import java.util.TimerTask;

public class Clock_timer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
		    int i = 60;
		    public void run(){
		        if (i >= 0) {
//		            lab3.setText("Timer " + i--);
		        }
		    }
		};
		timer.scheduleAtFixedRate(task, 0, 1000);
	}

}
