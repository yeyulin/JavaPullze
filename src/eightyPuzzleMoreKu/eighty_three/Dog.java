package eightyPuzzleMoreKu.eighty_three;
/***
 * һ��ʵ���� Serializable �ĵ����࣬������һ��
readResolve ���������Է�������Ψһ��ʵ����
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
