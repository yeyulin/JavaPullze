package twenty;
/**
 * 使用字符串连接操作符使用格外小心。+ 操作符当且仅当它的操作数中至
	少有一个是 String 类型时，才会执行字符串连接操作；否则，它执行的就是加
	法。
 **/
public class Eleven {
	public static void main(String[] args) {
		System.out.print("H"+"a");
		System.out.print("" + 2+2);
	}
}
