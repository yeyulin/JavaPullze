package fourException.thirty_Seven;
/***
 * �����������׳��ı�����쳣������������
�õ�������������Ҫ�׳��ı�����쳣���ϵĽ����������Ǻϼ�

����̳ж����� throws �Ӿ�Ľ�
���������ٶ��������ӷ��������׳����쳣����
 * **/
public class Arcane3 implements Type3 {

	@Override
	public void f()  {
		System.out.println("Hello world");
	}
	public static void main(String[] args) {
		Type3 t3 = new Arcane3();
		t3.f();
	}
}
