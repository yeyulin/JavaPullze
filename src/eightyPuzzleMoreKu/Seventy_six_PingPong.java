package eightyPuzzleMoreKu;
/****
 * ���������һ���̵߳� start ����ʱҪ���С�ģ���Ū��ɵ�
������̵߳� run ������
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
