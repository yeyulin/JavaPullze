package thirty;
/**
 * 操作符重载是很容易引起混乱的，也许 + 操作符就不应该被重载用来进行字符串连接操作
 * */
public class Thirty {
	public static void main(String[] args) {
		String i="a";
		while (i != i + 0) {
		}
	}
}
