package eightyPuzzleMoreKu;
/****
 * 当你想调用一个线程的 start 方法时要多加小心，别弄错成调
用这个线程的 run 方法了
 * 
 * **/
public class Seventy_six_PingPong {
	public static synchronized void main(String[] args) {
		Thread t=new Thread(new Runnable() {
			
			@Override
			public void run() {
				pong();
			}
		}); /*{
			@Override
			public void run() {
				pong();
			}
		};*/
		//t.run();
		t.start();
		System.out.print( "Ping" );
	}
	
	static synchronized void pong() {
		System.out.println("Pong");
	}
}
