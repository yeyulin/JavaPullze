package forty;
/**
 * 
 * Java 使用 2 的补码的算术运算，它是非对称的
 * 对于每一种有符号的整数类型（int、long、byte 和 short），负的数值总是比正的数值多一个，这个
 *	多出来的值总是这种类型所能表示的最小数值
 * */
public class Thirty_three {
	public static void main(String[] args) {
		int i = Integer.MIN_VALUE;
		System.out.println(i);
		System.out.println(-i);
		while (i != 0 && i == -i) {
		}
	}
}
