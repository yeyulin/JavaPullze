package fourException;
/***
 * 
 * ʵ����ʼ�����������ڹ������ĳ���������еġ�ʵ����ʼ�������׳����κ��쳣���ᴫ����������
 * 
 * �������׳��쳣�Ĺ�����������Ҫע�⣬����������������ʵ����ʼ���������׳������б�����쳣
 * 
 * ������������Ƶ��࣬�����ʵ������ͬ����������������ʵ������ô������
���޵ݹ�Ҫ���⵱��
 * */
public class Forty_Reluctant {
	private Forty_Reluctant internalInstance = new Forty_Reluctant();
	public Forty_Reluctant() throws Exception {
		throw new Exception("I'm not coming out");
	}
	public static void main(String[] args) {
	try {
		Forty_Reluctant b = new Forty_Reluctant();
	System.out.println("Surprise!");
	} catch (Exception ex) {
	System.out.println("I told you so");
	}
	}
}
