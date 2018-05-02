package eightyPuzzleMoreKu.eighty;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
/****
 * ���ǵ��� Java ���� class �ļ���ӳ��ĸ��Ӷȣ������ʹ�÷�����ʵ������
���ࡣ
 * 
 * */
public class Outer {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		new Outer().greetWorld();
	}

	private void greetWorld() throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Constructor<Inner> constructor = Inner.class.getConstructor(Outer.class);
		//System.out.println(Inner.class.newInstance());
		System.out.println(constructor.newInstance(Outer.this));
	}
	
	public static class Inner {
		public String toString(){
			return "Hello world";
		}
	}
}
