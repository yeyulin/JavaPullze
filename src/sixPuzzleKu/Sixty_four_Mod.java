package sixPuzzleKu;
/***
 * Math.abs 不能保证一定会返回非负的结果。如果它的参数是
Integer.MIN_VALUE，或者对于 long 版本的实现传递的是 Long.MIN_VALUE，那
么它将返回它的参数。
 * 
 * **/
public class Sixty_four_Mod {
	public static void main(String[] args) {
		//System.out.println(Math.abs(Integer.MIN_VALUE));
		final int MODULUS = 3;
		int[] histogram = new int[MODULUS];
		int i = Integer.MIN_VALUE;
		do {
			histogram[mod(i, MODULUS)]++;
		} while (i++ != Integer.MAX_VALUE);
		for (int j = 0; j < MODULUS; j++)
			System.out.println(histogram[j] + " ");
	}
	private static int mod(int i, int modulus) {
		int result = i % modulus;
		return result < 0 ? result + modulus : result;
		}
}
