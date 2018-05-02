package fivePuzzle;

import java.util.Calendar;

public class Forty_nine_Elvis {
	public static final Forty_nine_Elvis INSTANCE = new Forty_nine_Elvis();
	private final int beltSize;
	private static final int CURRENT_YEAR =Calendar.getInstance().get(Calendar.YEAR);
	private Forty_nine_Elvis() {
		beltSize = CURRENT_YEAR - 1930;
	}
	public int beltSize() {
		return beltSize;
	}
	public static void main(String[] args) {
		System.out.println("Elvis wears a size"+INSTANCE.beltSize()+"belt.");
	}
}
