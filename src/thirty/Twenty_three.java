package thirty;

import java.util.Random;
/**
 * 1 ÿ�����ڴ����ȡ���Χ��ģ����ʱ�򣬶�Ҫ��ϸȷ����˵��Ƿ�Ӧ�ñ��������ڣ�����Ҫȷ����Ĵ������ΪҪ�������Ӧ��
 * 2 ��switch�ĸ��������ȱ��break����Ƿǳ������Ĵ���
 * 3 StringBuffer ��һ���޲����Ĺ�������һ������һ�� String ��Ϊ�ַ�����������ʼ���ݵĹ��������Լ�һ������һ�� int ��Ϊ
	   ��������ʼ�����Ĺ�������
 * **/
public class Twenty_three {
	private static Random rnd=new Random();
	public static void main(String[] args) {
		StringBuffer word=null;
		switch (rnd.nextInt(2)) {
		case 1: word = new StringBuffer('P');
		case 2: word = new StringBuffer('G');
		default: word = new StringBuffer('M');
		}
		word.append('a');
		word.append('i');
		word.append('n');
		System.out.println(word);
		
		String a[] = {"Main","Pain","Gain"};
		System.out.println(randomElement(a));
	}
	private static String randomElement(String[] a){
	return a[rnd.nextInt(a.length)];
	}
}
