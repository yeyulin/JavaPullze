package fivePuzzle.fivetyOne;
/**
 * ��һ�� final ���͵�ʵ���򱻸�ֵ֮ǰ��������ȡ����ֵ�Ŀ���
 * 
 * ֻҪһ��������������һ���Ѿ��������าд�˵ķ�������ô������ͻ����
 * 
 * ��Ҫ�ڹ������е��ÿɸ� д�ķ�������ʵ����ʼ���в�����ѭ�����������ġ�������Ľ���������Ƕ��Գ�ʼ��[EJ
 * 
 * */
public class ColorPoint2 extends Point2{
	private final String color;
	ColorPoint2(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	protected String makeName() {
		return super.makeName() + ":" + color;
	}
	public static void main(String[] args) {
		System.out.println(new ColorPoint2(4, 2, "purple"));
	}

}
