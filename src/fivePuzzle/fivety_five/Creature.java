package fivePuzzle.fivety_five;

class  Creature {
	private static long numCreated = 0;
	public Creature() {
		numCreated++;
	}
	public static long numCreated() {
		return numCreated;
	}
}
