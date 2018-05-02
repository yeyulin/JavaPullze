package fivePuzzle.fivety;
/**
 * 转型 下缩是不安全 但编译可以成功 运行失败
 * */
public class Type3 {
	public static void main(String[] args) {
		Type3 t3 = (Type3) new Object();
	}
}
