package ninePuzzleHight;

public class Eighty_seven_Transitive {
	public static void main(String[] args) {
		long x = Long.MAX_VALUE;
		double y = (double) Long.MAX_VALUE;
		long z = Long.MAX_VALUE - 1;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println((x == y) + ""); // Imprecise!
		System.out.println((y == z) + ""); // Imprecise!
		System.out.println(x == z); // Precise!
	}
}
