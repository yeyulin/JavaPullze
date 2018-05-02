package fourException.thirty_Seven;

import java.io.IOException;
/**
 * IOException 是一个被检查异常
 * 
 * 语言规范中描述道：如果一个 catch 子句
要捕获一个类型为 E 的被检查异常，而其相对应的 try 子句不能抛出 E 的某种子
类型的异常，


即对于捕获被检查异常的 catch 子句，
只有在相应的 try 子句可以抛出这些异常时才被允许。


 * **/
public class Arcane1 {
	public static void main(String[] args) throws IOException {
		System.out.println("Hello world");
	}
}
