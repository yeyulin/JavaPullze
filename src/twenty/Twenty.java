package twenty;

import java.util.regex.Pattern;
/**
 * ������ʽ"."����ƥ���κε������ַ�
 * Ҫ��ֻƥ������ţ���������ʽ�еľ���������ǰ�����һ����б�ܣ�\������ת��
 * */
public class Twenty {
	public static void main(String[] args){
		System.out.println(Twenty.class.getName().replaceAll("\\.","/") + ".class");
		System.out.println(Twenty.class.getName().replaceAll(Pattern.quote("."),"/") + ".class");
	}
}
