package thirty;

import java.io.File;
/**
 * File.separator ������ַ�  java.util.regex �淶�������������[Java-API]��������ַ����г��ֵķ�б�ܻ�ѽ��������ַ�����ת�壬
 *	String.replace(char,char)��ģʽ������ﶼ�������溬����ַ�������
 *	
 *	��ʹ�ò���Ϥ����ⷽ��ʱһ��Ҫ����С�ġ������Ĵ�����ʱ����Ҫ������ Javadoc
 * */
public class Twenty_one {
	public static void main(String[] args){
		System.out.println(Twenty_one.class.getName().replace(".", File.separator) + ".class");
		}
}
