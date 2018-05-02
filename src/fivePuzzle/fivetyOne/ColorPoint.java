package fivePuzzle.fivetyOne;
/**
 * 在一个 final 类型的实例域被赋值之前，存在着取用其值的可能
 * 
 * 只要一个构造器调用了一个已经被其子类覆写了的方法，那么该问题就会出现
 * 
 * */
public class ColorPoint extends Point{
	private final String color;
	ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	protected String makeName() {
		return super.makeName() + ":" + color;
	}
	public static void main(String[] args) {
		System.out.println(new ColorPoint(4, 2, "purple"));
	}

}
