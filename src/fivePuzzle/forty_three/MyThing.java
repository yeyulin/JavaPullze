package fivePuzzle.forty_three;
/***
 * 允许一个类中的某个构造器链接调用同一个类中的另一个构造器
 * */
public class MyThing extends Thing {
	private final int arg;
	public MyThing() {
		//在这个私有构造器中，20已经被捕获到了变量 i 中  this(i)等价于MyThing(int i)
		this(20);
	}
	public MyThing(int i) {
		super(i);
		arg = i;
	}
	public static void main(String[] args) {
		System.out.println(new MyThing().arg);
	}
}
