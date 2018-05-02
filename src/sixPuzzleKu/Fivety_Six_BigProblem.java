package sixPuzzleKu;

import java.math.BigInteger;
/***
 * String、
 *	BigDecimal 以及包装器类型：Integer、Long、Short、Byte、Character、Boolean、
 *	Float 和 Double 也是如此. 实例是不可变的
 * */
public class Fivety_Six_BigProblem {
	public static void main(String[] args) {
		BigInteger fiveThousand = new BigInteger("5000");
		BigInteger fiftyThousand = new BigInteger("50000");
		BigInteger fiveHundredThousand = new BigInteger("500000");
		BigInteger total = BigInteger.ZERO;
		total.add(fiveThousand);
		total.add(fiftyThousand);
		total.add(fiveHundredThousand);
		System.out.println(total);
	}
}
