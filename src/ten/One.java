package ten;
/**
 * ��֮���������ʱʹ�õ���ȡ�����������Ҫ���ǵ��������ͽ���ķ��š�
 * */
public class One {
	public static boolean isOdd(int i) {
		return i%2!=0;
	//	return (i & 1)!=0;
	}
	public static void main(String[] args) {
		boolean flag=isOdd(-2);
		System.out.println(flag);
	}
}
