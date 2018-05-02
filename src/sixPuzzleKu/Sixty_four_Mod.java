package sixPuzzleKu;
/***
 * Math.abs ���ܱ�֤һ���᷵�طǸ��Ľ����������Ĳ�����
Integer.MIN_VALUE�����߶��� long �汾��ʵ�ִ��ݵ��� Long.MIN_VALUE����
ô�����������Ĳ�����
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
