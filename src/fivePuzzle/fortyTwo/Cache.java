package fivePuzzle.fortyTwo;

public class Cache {
	static {
		initializeIfNecessary();
	}
	private static int sum;
	public static int getSum() {
		initializeIfNecessary();
		return sum;
	}
	private static boolean initialized = false;
	private static synchronized void initializeIfNecessary() {
			if (!initialized) {
			for (int i = 0; i < 100; i++)
				sum += i;
				initialized = true;
			}
	   }
}
