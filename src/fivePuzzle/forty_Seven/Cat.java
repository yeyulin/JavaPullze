package fivePuzzle.forty_Seven;

class Cat extends Counter {
	private static int meowCounter;
	public Cat() { }
	public static int meowCount() { return meowCounter; };
	public void meow() { meowCounter++; }
}
