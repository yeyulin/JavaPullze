package eightyPuzzleMoreKu;
/***
 * 两个线程互相等待 死锁
 * 线程启动会检查 类是否已经被初始化
 * 
 * 到目前为止，最好的方法就是不要在类进行初始化的
时候启动任何后台线程：
 * */
public class Eighty_five_Lazy {
	private static boolean initialized = false;
	static {
		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				initialized = true;				
			}
			
		});
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println(initialized);
	}
}
