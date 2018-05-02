package eightyPuzzleMoreKu;
/***
 * �����̻߳���ȴ� ����
 * �߳��������� ���Ƿ��Ѿ�����ʼ��
 * 
 * ��ĿǰΪֹ����õķ������ǲ�Ҫ������г�ʼ����
ʱ�������κκ�̨�̣߳�
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
