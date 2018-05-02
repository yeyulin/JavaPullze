package twenty;
/***
 * 字符串连接的优先级不应该和加法一样 因为+ 操作符，不论是用作加法还是字符串连接操作，它都比 == 操作符的优先级高
 * */
public class Thirteen {
	public static void main(String[] args){
		final String pig = "length: 10";
		final String dog = "length: 10";
		System.out. println("Animals are equal: "+ (pig==dog));
		}
}
