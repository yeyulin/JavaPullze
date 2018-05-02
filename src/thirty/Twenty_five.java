package thirty;
/**
 * 这与谜题 7 中的教训相同:不要在单个的表达式中对相同的变量赋值超过一次。对相同的变量进行多次赋值的表达式会产生混淆，并且很少能够产生你希望的行
为
 * **/
public class Twenty_five {
	public static void main(String[] args) {
		int j = 0;
		for (int i = 0; i < 100; i++)
			j = j++;
		System.out.println(j);
	//修改 
		int c=0;
		for (int i = 0; i < 100; i++)
			c++;
		System.out.println(c);
		
	}
}
