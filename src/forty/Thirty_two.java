package forty;

public class Thirty_two {
	public static void main(String[] args) {
		//判等操作符在其两个操作数中只有一个是被包装的数字类型，而另一个是原始类型时，执行的确实是数值比较。
		System.out.println(new Integer(0) == 0);
		//Java 的判等操作符（==和!=）在作用于对象引用时，执行的是引用标识的比较，而不是值的比较
		System.out.println(new Integer(0) == new Integer(0));
		Integer i = new Integer(0);
		Integer j = new Integer(0);
		while (i <= j && j <= i && i != j) {
		}
	}
}
