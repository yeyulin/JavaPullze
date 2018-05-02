package twenty;

import java.util.regex.Pattern;
/**
 * 正则表达式"."可以匹配任何单个的字符
 * 要想只匹配句点符号，在正则表达式中的句点必须在其前面添加一个反斜杠（\）进行转义
 * */
public class Twenty {
	public static void main(String[] args){
		System.out.println(Twenty.class.getName().replaceAll("\\.","/") + ".class");
		System.out.println(Twenty.class.getName().replaceAll(Pattern.quote("."),"/") + ".class");
	}
}
