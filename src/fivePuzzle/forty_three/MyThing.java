package fivePuzzle.forty_three;
/***
 * ����һ�����е�ĳ�����������ӵ���ͬһ�����е���һ��������
 * */
public class MyThing extends Thing {
	private final int arg;
	public MyThing() {
		//�����˽�й������У�20�Ѿ��������˱��� i ��  this(i)�ȼ���MyThing(int i)
		this(20);
	}
	public MyThing(int i) {
		super(i);
		arg = i;
	}
	public static void main(String[] args) {
		System.out.println(new MyThing().arg);
	}
}
