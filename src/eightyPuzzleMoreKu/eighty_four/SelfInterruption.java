package eightyPuzzleMoreKu.eighty_four;
/***
 * ����Ҫʹ�� Thread.interrupted ��������������Ҫ�����ǰ
�̵߳��ж�״̬�������ֻ�����ѯ�ж�״̬����ʹ�� isInterrupted ����
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
