package fivePuzzle;
/**
 * ��Ȿ����Ĺؼ������ڲ�����һ�������������ȷʱ��
 * 
 * Ҫ��ǿ��Ҫ�������ѡ��һ����ȷ�����ذ汾����Ҫ��ʵ�ʵĲ���ת��Ϊ��ʽ����������������
 * **/
public class Forty_six_Confusing {
	
	private Forty_six_Confusing(double[] dArray) {
		System.out.println("double array");
	}
	private Forty_six_Confusing(Object o) {
		System.out.println("Object");
	}
	public static void main(String[] args) {
		new Forty_six_Confusing((Object)null);
	}
	
}
