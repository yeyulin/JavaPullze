package twenty;

import java.io.UnsupportedEncodingException;
/**
 * ÿ����Ҫ��һ�� byte ����ת����һ�� String ʱ���㶼��ʹ��ĳһ���ַ��� �����ʾָ���ַ�����ISO-8859-1
 * */
public class Eightent {
	public static void main(String[] args) {
		byte bytes[]=new byte[256];
		for(int i=0;i<256;i++) 
			bytes[i]=(byte) i;
		
		String str;
		try {
			str = new String(bytes, "ISO-8859-1");
			for(int i=0,length=str.length();i<length;i++){
				System.out.println((int)str.charAt(i)+" ");
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
