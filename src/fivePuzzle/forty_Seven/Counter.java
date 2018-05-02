package fivePuzzle.forty_Seven;

 class Counter {
	 private static int count = 0;
	 public static final synchronized void increment() {
		 count++;
	}
	 public static final synchronized int getCount() {
		 return count;
	 }
}
