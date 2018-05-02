package twenty;
/**
 * 要确保字符 \ u 不出现在一个合法的 Unicode 转义字符上下文之外，即使
是在注释中也是如此。在机器生成的代码中要特别注意此问题
 * */
public class Fifteen {
	public static void main(String[] args) {
		System.out.print("Hell");
		System.out.println("o world");
	}
}
