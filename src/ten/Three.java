package ten;
/**
 * �����ڲ����ܴ������ʱ��ǧ��Ҫ������
 * Java ������Ŀ��ȷ�����͵����ԣ�����һ���������ԣ��京����ָ�洢����ı��������ͻ�Ӱ�쵽������ʹ�õ����͡�
 * ���г���һ���Ԫ�� ��int �ǽ����int ��int ��ֵ���� �ڴ�����
 * */
public class Three {
	public static void main(String args[]){
		final long MICROS_PER_DAY = 24L * 60 * 60 * 1000 * 1000;
		final long MILLIS_PER_DAY = 24L * 60 * 60 * 1000;
		System.out.println(MICROS_PER_DAY/MILLIS_PER_DAY);
		}
}
