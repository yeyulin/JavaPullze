package forty;

public class Thirty_two {
	public static void main(String[] args) {
		//�еȲ���������������������ֻ��һ���Ǳ���װ���������ͣ�����һ����ԭʼ����ʱ��ִ�е�ȷʵ����ֵ�Ƚϡ�
		System.out.println(new Integer(0) == 0);
		//Java ���еȲ�������==��!=���������ڶ�������ʱ��ִ�е������ñ�ʶ�ıȽϣ�������ֵ�ıȽ�
		System.out.println(new Integer(0) == new Integer(0));
		Integer i = new Integer(0);
		Integer j = new Integer(0);
		while (i <= j && j <= i && i != j) {
		}
	}
}
