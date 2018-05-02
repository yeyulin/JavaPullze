package ten;
/**
 * 如果最初的数值类型是有符号的，那么就执行符号扩展；如果它是 char，那么不管它将要被转换成什么类型，都执行
 *	零扩展。 short 支持符号扩展
 * */
public class Six {
	public static void main(String[] args) {
		System.out.println((int)(short)(char)(byte) -1);
	}
}
