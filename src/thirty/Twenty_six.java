package thirty;
/***
 * 
 * 这里的教训就是 int 不能表示所有的整数。无论你在何时使用了一个整数类型，都要意识到其边界条件。如果其数值下溢或是上溢了，会怎么样呢？
 *	所以通常最好是使用一个取之范围更大的类型。
 * */
public class Twenty_six {
	public static final int END = Integer.MAX_VALUE;
	public static final int START = END - 100;
	public static void main(String[] args) {
		int count = 0;
		for (int i = START; i <= END; i++)
		count++;
		System.out.println(count);
		//解决  i < END 或 long i=START
		
	}
}
