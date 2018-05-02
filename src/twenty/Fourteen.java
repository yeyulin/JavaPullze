package twenty;
/**
 * 字符串和字符字面常量中要优先选择的是转义字符序列，
 * **/
public class Fourteen {
	public static void main(String[] args) {
		// \u0022 是双引号的 Unicode 转义字符
		System.out.println("a\u0022.length()+\u0022b".length());
		System.out.println("a\".leng\"\\\"\\th()+\"b".length());
		System.out.println("ab\"s\"cdf"+1);
	}
}
