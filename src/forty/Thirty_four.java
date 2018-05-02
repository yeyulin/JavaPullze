package forty;
/***
 * 不要使用浮点数作为循环索引，因为它会导致无法预测的行为。如果你在循环体内需要一个浮点数，那么请使用 int 或 long 循环索引，
 * 当你使用浮点数时，要使用 double 而不是 float，除非你肯定 float 提供了足够的精度，并且存在
 *	强制性的性能需求迫使你使用 float
 * */
public class Thirty_four {
	public static void main(String[] args) {
		final int START = 2000000000;
		int count = 0;
		double f = START;
		for (; f < START + 50; f++)
				count++;
		System.out.println(count);
	}
	
}
