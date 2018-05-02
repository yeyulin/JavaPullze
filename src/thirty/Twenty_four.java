package thirty;
/***
 *  byte 数值的符号扩展是产生 bug 和混乱的一种常见根源。而用来抵销符号扩展效果所需的屏蔽机制会使得程序显得混乱无序，从而降低了
 *	程序的可读性
 * */
public class Twenty_four {
	private static final byte TARGET = (byte)0x90;
	public static void main(String[] args) {
		for (byte b = Byte.MIN_VALUE; b <Byte.MAX_VALUE; b++) {
				if (b == TARGET)
				System.out.print("Joy!");
		}
	}
}
