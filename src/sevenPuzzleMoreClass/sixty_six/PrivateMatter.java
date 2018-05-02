package sevenPuzzleMoreClass.sixty_six;
/****
 * 当你在声明一个域、一个静态方法或一个嵌套类型时，如果其名字与基类
 *	中相对应的某个可访问的域、方法或类型相同，就会发生隐藏。隐藏是容易产生
 *	混乱的：违反包容性的隐藏域在某种意义上是特别有害的。更一般地讲，除了覆
 *	写之外，要避免名字重用。
 * 
 * **/
public class PrivateMatter {
	public static void main(String[] args) {
		System.out.println(((Base)new Derived()).className);
	}
}
