package sixPuzzleKu;

import java.math.BigInteger;
/***
 * String��
 *	BigDecimal �Լ���װ�����ͣ�Integer��Long��Short��Byte��Character��Boolean��
 *	Float �� Double Ҳ�����. ʵ���ǲ��ɱ��
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
