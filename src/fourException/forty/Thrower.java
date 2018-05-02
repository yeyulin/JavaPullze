package fourException.forty;
/**
 * ��Ҫ��ʶ�� Class.newInstance �����׳���û�����������ܼ���쳣��
 * */
public class Thrower {
	private static Throwable t;
	private Thrower() throws Throwable {
		throw t;
	}
	public static void main(String[] args) {
		sneakyThrow(new Throwable());
	}
	public static synchronized void sneakyThrow(Throwable t) {
		Thrower.t = t;
		try {
			Thrower.class.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}finally {
			Thrower.t = null;
		}
	}
}
