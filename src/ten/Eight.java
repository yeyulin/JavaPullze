package ten;
/***
 * 条件表达式结果类型的规则过于冗长和复杂，很难完全记住它们，但是其核心就是一下三点
 * 
 *1 如果第二个和第三个操作数具有相同的类型，那么它就是条件表达式的类型
 * 
 * 2如果一个操作数的类型是 T，T 表示 byte、short 或 char，而另一个操作数是一个 int 类型的常量表达式，它的值是可以用类型 T 表示的，那么条件表达式的类型就是 T
 *
 * 3 否则，将对操作数类型运用二进制数字提升，而条件表达式的类型就是第二个和第三个操作数被提升之后的类型
 * 三目运算时 两个参数类型最好一样 要防止混乱
 * */
public class Eight {
	public static void main(String[] args) {
		char x = 'X';
		int i = 0;
		System.out.println(true ? x : 0);
		System.out.println(false ? i : x);
		System.out.println(true ? 'x' : i);
	}
}
