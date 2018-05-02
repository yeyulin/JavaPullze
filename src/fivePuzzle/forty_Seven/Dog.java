package fivePuzzle.forty_Seven;

 class Dog extends Counter {
	 private static int woofCounter;
	 public Dog() { }
	 public static int woofCount() { return woofCounter; };
	 public void woof() { woofCounter++; }
}
