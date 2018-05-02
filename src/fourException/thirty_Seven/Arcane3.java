package fourException.thirty_Seven;
/***
 * 个方法可以抛出的被检查异常集合是它所适
用的所有类型声明要抛出的被检查异常集合的交集，而不是合集

多个继承而来的 throws 子句的交
集，将减少而不是增加方法允许抛出的异常数量
 * **/
public class Arcane3 implements Type3 {

	@Override
	public void f()  {
		System.out.println("Hello world");
	}
	public static void main(String[] args) {
		Type3 t3 = new Arcane3();
		t3.f();
	}
}
