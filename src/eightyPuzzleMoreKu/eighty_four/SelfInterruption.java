package eightyPuzzleMoreKu.eighty_four;
/***
 * ：不要使用 Thread.interrupted 方法，除非你想要清除当前
线程的中断状态。如果你只是想查询中断状态，请使用 isInterrupted 方法
 * 
 * **/
public class SelfInterruption {
	public static void main(String[] args) {
		Thread.currentThread().interrupt();
		if(Thread.currentThread().isInterrupted()) {
			System.out.println("Interrupted: " +Thread.currentThread().interrupted());
		} else{
			System.out.println("Not interrupted: " +Thread.currentThread().interrupted());
		}
	}
}
