package fivePuzzle.fivety_five;
import java.util.concurrent.atomic.AtomicLong;
class  Creature2 {
	private static  AtomicLong numCreated=new AtomicLong();
	public Creature2() {
		numCreated.incrementAndGet();
	}
	public static long numCreated() {
		return numCreated.get();
	}
}
