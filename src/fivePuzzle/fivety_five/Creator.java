package fivePuzzle.fivety_five;
/***
 * Java ���Թ淶������һ�����ر������������Ϊһ������� for��while �� do
ѭ�����ظ�ִ��[JLS 14.12-14]
 * */
public class Creator {
	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			new Creature();
		}
		System.out.println(Creature.numCreated());
	}
}
