package sixPuzzle.sixty;

import java.util.Arrays;

/***
 * B．编写一个方法，它接受一个由 0 个或多个由逗号分隔的标志所组成的
字符串，并返回一个表示这些标志的字符串数组，数组中的元素的顺序与
这些标志在输入字符串中出现的顺序相同。每一个逗号后面都可能会跟随
0 个或多个空格字符，这个方法忽略它们。例如，如果你传递的字符串
是”fear, surprise, ruthless efficiency, an almost fanatical
devotion to the Pope, nice red uniforms”，那么你得到的将是一个
包含 5 个元素的字符串数组，这些元素
是”fear”，”surprise”，”ruthless efficiency”，”an almost
fanatical devotion to the Pope” 和 “nice red uniform”
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
