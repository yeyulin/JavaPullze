package forty;
/***
 * ��Ҫʹ�ø�������Ϊѭ����������Ϊ���ᵼ���޷�Ԥ�����Ϊ���������ѭ��������Ҫһ������������ô��ʹ�� int �� long ѭ��������
 * ����ʹ�ø�����ʱ��Ҫʹ�� double ������ float��������϶� float �ṩ���㹻�ľ��ȣ����Ҵ���
 *	ǿ���Ե�����������ʹ��ʹ�� float
 * */
public class Thirty_four {
	public static void main(String[] args) {
		final int START = 2000000000;
		int count = 0;
		double f = START;
		for (; f < START + 50; f++)
				count++;
		System.out.println(count);
	}
	
}
