package ten;
/**
 * 请不要将复合赋值操作符作用于 byte、short 或 char 类型的变量上
 * */
public class Nine {
	public static void main(String[] args) {
		int x = 0;
		int i = 123456;
		x=x+i;
		System.out.println(x); 
		
	}
}
