package fourException;
/**
 * �� try ����� finally ���鶼�������ʱ���� try �������������������
ԭ�򽫱�������
 * **/
public class Thirty_six {
	public static void main(String[] args) {
		System.out.println(decision());
		
		}
		static boolean decision() {
		try {
		return true;
		} finally {
		return false;
		}
	}
}
