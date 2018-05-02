package ten;
/**
 * 总之，无论你何时使用到了取余操作符，都要考虑到操作数和结果的符号。
 * */
public class One {
	public static boolean isOdd(int i) {
		return i%2!=0;
	//	return (i & 1)!=0;
	}
	public static void main(String[] args) {
		boolean flag=isOdd(-2);
		System.out.println(flag);
	}
}
