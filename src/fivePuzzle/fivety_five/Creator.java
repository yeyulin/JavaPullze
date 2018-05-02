package fivePuzzle.fivety_five;
/***
 * Java 语言规范不允许一个本地变量声明语句作为一条语句在 for、while 或 do
循环中重复执行[JLS 14.12-14]
 * */
public class Creator {
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			new Creature();
		}
		System.out.println(Creature.numCreated());
	}
}
