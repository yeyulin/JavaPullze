package eightyPuzzleMoreKu;

import java.util.Timer;
import java.util.TimerTask;

public class Seventy_seven_Worker extends Thread{
	private final Object lock = new Object();
	private volatile boolean quittingTime=false;
	@Override
	public void run() {
		while(!quittingTime) {
			 System.out.println("begin Thread");
			pretendToWork();
		}
		System.out.println("Beer is good");
	}
	private void pretendToWork() {
		try {
			 System.out.println("Thread 300");
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	 void quit()throws InterruptedException{
		 synchronized(lock) {
			 System.out.println("true quittingTime");
			 quittingTime=true;
				join();
		 }
	}
	 void keepWorking() {
		 synchronized(lock) {
			 System.out.println("false quittingTime");
				quittingTime = false;
		 }
	}
	public static void main(String[] args) throws InterruptedException {
		final Seventy_seven_Worker worker = new Seventy_seven_Worker();
		long strat1=System.currentTimeMillis();
		worker.start();
		Timer t=new Timer(true);
		t.schedule(new TimerTask() {
			@Override
			public void run() {
				worker.keepWorking();
			}
		}, 500);
		Thread.sleep(400);
		worker.quit();
		long end=System.currentTimeMillis();
		System.out.println(strat1-end);
	}
	
}
