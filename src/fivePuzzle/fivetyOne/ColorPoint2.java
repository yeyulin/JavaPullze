package fivePuzzle.fivetyOne;
/**
 * 在一个 final 类型的实例域被赋值之前，存在着取用其值的可能
 * 
 * 只要一个构造器调用了一个已经被其子类覆写了的方法，那么该问题就会出现
 * 
 * 不要在构造器中调用可覆 写的方法。在实例初始化中产生的循环将是致命的。该问题的解决方案就是惰性初始化[EJ
 * 
 * */
public class ColorPoint2 extends Point2{
	private final String color;
	ColorPoint2(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	protected String makeName() {
		return super.makeName() + ":" + color;
	}
	public static void main(String[] args) {
		System.out.println(new ColorPoint2(4, 2, "purple"));
	}

}
