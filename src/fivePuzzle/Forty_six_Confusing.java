package fivePuzzle;
/**
 * 理解本谜题的关键在于在测试哪一个方法或构造器最精确时，
 * 
 * 要想强制要求编译器选择一个精确的重载版本，需要将实际的参数转型为形式参数所声明的类型
 * **/
public class Forty_six_Confusing {
	
	private Forty_six_Confusing(double[] dArray) {
		System.out.println("double array");
	}
	private Forty_six_Confusing(Object o) {
		System.out.println("Object");
	}
	public static void main(String[] args) {
		new Forty_six_Confusing((Object)null);
	}
	
}
