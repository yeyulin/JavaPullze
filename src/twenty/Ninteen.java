package twenty;
/**
 * 块注释不能可靠地注释掉代码段，应该用单行的注释序列来代替
 * **/
public class Ninteen {
	public static void main(String[] args) {
		System.err.println(classify('n')+classify('+')+classify('2'));
	}

	private static String classify(char c) {
		if("0123456789".indexOf(c)>=0) {
			return "NUMERAL ";
		}
		if("abcdefghijklmnopqrstuvwxyz".indexOf(c) >= 0) {
			return  "LETTER ";
		}
		// (Operators not supported yet)
			if ("+-*/&|!=".indexOf(c) >= 0)
					return "OPERATOR ";
		return "UNKNOWN";
	}
}
