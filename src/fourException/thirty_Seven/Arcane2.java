package fourException.thirty_Seven;

import java.io.IOException;
/***
 * 但是捕获 Exception 或 Throwble 的 catch 子句是合法的，
 * 但是 catch 子句的内容永远的不会被执行
 * **/
public class Arcane2 {
	public static void main(String[] args) {
		try {
			} catch(Exception e) {
				System.out.println("This can'thappen");
			}
	}
}
