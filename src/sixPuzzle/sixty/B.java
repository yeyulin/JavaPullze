package sixPuzzle.sixty;

import java.util.Arrays;

/***
 * B����дһ��������������һ���� 0 �������ɶ��ŷָ��ı�־����ɵ�
�ַ�����������һ����ʾ��Щ��־���ַ������飬�����е�Ԫ�ص�˳����
��Щ��־�������ַ����г��ֵ�˳����ͬ��ÿһ�����ź��涼���ܻ����
0 �������ո��ַ�����������������ǡ����磬����㴫�ݵ��ַ���
�ǡ�fear, surprise, ruthless efficiency, an almost fanatical
devotion to the Pope, nice red uniforms������ô��õ��Ľ���һ��
���� 5 ��Ԫ�ص��ַ������飬��ЩԪ��
�ǡ�fear������surprise������ruthless efficiency������an almost
fanatical devotion to the Pope�� �� ��nice red uniform��
 *  
 * 
 * **/
public class B {
	public static String[] parse(String string) {
		return string.split(",");
	}
	public static void main(String[] args) {
		String string="fear, surprise, ruthless efficiency, an almost fanatical devotion to the Pope, nice red uniforms";
		String[] parse = parse(string);
		System.out.println(Arrays.toString(parse));
	}
}
