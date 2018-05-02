package ten;
/**
 * 混合类型的计算可能会产生混淆，尤其是十六进制和八进制字面常量无需显式的减号符号就可以表示负的数值。
 * */
public class Five {
	public static void main(String[] args) {
		System.out.println(Long.toHexString(0x100000000L + 0xcafebabe));
	}
}
