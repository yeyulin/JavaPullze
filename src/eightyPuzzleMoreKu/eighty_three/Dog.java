package eightyPuzzleMoreKu.eighty_three;
/***
 * 一个实现了 Serializable 的单件类，必须有一个
readResolve 方法，用以返回它的唯一的实例。
 * */
public class Dog  extends Exception{
	public static final Dog INSTANCE = new Dog();
	private Dog() {}
	public String toString(){
		return "Woof";
	}
	private Object readResolve(){
		// Accept no substitues!
		return new Dog();
	}
}
