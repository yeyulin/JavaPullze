package sevenPuzzleMoreClass.seventy_two;
/***
 * final 修饰符对方法和域而言，意味着某些完全不同的事情。对于方
法，final 意味着该方法不能被覆写（对实例方法而言）或者隐藏（对静态方法
而言）[JLS 8.4.3.3]。对于域，final 意味着该域不能被赋值超过一次[JLS
8.3.1.2]。关键字相同，但是其行为却完全不相关


要避免在无关的变量或无关的概念之间重用名字。对无关的概念使用有区
别的名字有助于让读者和程序员区分这些概念
 * 
 * **/
public class DoubleJeopardy extends Jeopardy {
	public static final String PRIZE = "2 cents";
	public static void main(String[ ] args) {
		System.out.println(DoubleJeopardy.prize());
	}
}
