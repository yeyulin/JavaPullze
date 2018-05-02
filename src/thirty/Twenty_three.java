package thirty;

import java.util.Random;
/**
 * 1 每当你在处理长度、范围或模数的时候，都要仔细确定其端点是否应该被包括在内，并且要确保你的代码的行为要与其相对应。
 * 2 在switch的各种情况中缺少break语句是非常常见的错误
 * 3 StringBuffer 有一个无参数的构造器，一个接受一个 String 作为字符串缓冲区初始内容的构造器，以及一个接受一个 int 作为
	   缓冲区初始容量的构造器。
 * **/
public class Twenty_three {
	private static Random rnd=new Random();
	public static void main(String[] args) {
		StringBuffer word=null;
		switch (rnd.nextInt(2)) {
		case 1: word = new StringBuffer('P');
		case 2: word = new StringBuffer('G');
		default: word = new StringBuffer('M');
		}
		word.append('a');
		word.append('i');
		word.append('n');
		System.out.println(word);
		
		String a[] = {"Main","Pain","Gain"};
		System.out.println(randomElement(a));
	}
	private static String randomElement(String[] a){
	return a[rnd.nextInt(a.length)];
	}
}
