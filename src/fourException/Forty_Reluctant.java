package fourException;
/***
 * 
 * 实例初始化操作是先于构造器的程序体而运行的。实例初始化操作抛出的任何异常都会传播给构造器
 * 
 * 声明将抛出异常的构造器，你需要注意，构造器必须声明其实例初始化操作会抛出的所有被检查异常
 * 
 * 对于我们所设计的类，如果其实例包含同样属于这个类的其他实例，那么对这种
无限递归要格外当心
 * */
public class Forty_Reluctant {
	private Forty_Reluctant internalInstance = new Forty_Reluctant();
	public Forty_Reluctant() throws Exception {
		throw new Exception("I'm not coming out");
	}
	public static void main(String[] args) {
	try {
		Forty_Reluctant b = new Forty_Reluctant();
	System.out.println("Surprise!");
	} catch (Exception ex) {
	System.out.println("I told you so");
	}
	}
}
