package ninePuzzleHight;

import java.util.Arrays;
import java.util.List;

public class Eighty_eight_Pair<T> {
	private final T first;
	private final T second;
	public Eighty_eight_Pair(T first, T second) {
		super();
		this.first = first;
		this.second = second;
	}
	public T first() {
		return first;
	}
	public T second() {
		return second;
	}
	public List<String> stringList() {
		return Arrays.asList(String.valueOf(first),
		String.valueOf(second));
	}
	public static void main(String[] args) {
		Eighty_eight_Pair<Object> p = new Eighty_eight_Pair<Object> (23, "skidoo");
		System.out.println(p.first() + " " + p.second());
		for (String s : p.stringList())
			System.out.print(s + " ");
		
	}
}
