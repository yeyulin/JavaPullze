package ten;
/**
 * Java 语言规范描述到：操作符的操作数是从左向右求值的
 * 在单个的表达式中不要对相同的变量赋值两次。
 * **/
public class Seven {
	public static void main(String[] args) {
		int x = 1984; // (0x7c0)
		int y = 2001; // (0x7d1)
		x^= y^= x^= y;
		System.out.println("x= " + x + "; y= " + y);
	}
}
