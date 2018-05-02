package thirty;

import java.io.File;
/**
 * File.separator 是替代字符  java.util.regex 规范中所定义的那样[Java-API]。在替代字符串中出现的反斜杠会把紧随其后的字符进行转义，
 *	String.replace(char,char)将模式和替代物都当作字面含义的字符串处理
 *	
 *	在使用不熟悉的类库方法时一定要格外小心。当你心存疑虑时，就要求助于 Javadoc
 * */
public class Twenty_one {
	public static void main(String[] args){
		System.out.println(Twenty_one.class.getName().replace(".", File.separator) + ".class");
		}
}
