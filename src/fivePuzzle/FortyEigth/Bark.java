package fivePuzzle.FortyEigth;
/***
 * 千万不要用一个表达式来标识一个静态方法调用
 * */
public class Bark {
	public static void main(String[] args) {
		Dog woofer=new Dog();
		Basenji nipper=new Basenji();
		Dog.bark();
		nipper.bark();
	}
}
