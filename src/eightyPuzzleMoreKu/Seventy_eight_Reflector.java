package eightyPuzzleMoreKu;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/***
 * ��ʹ�÷������ĳ������ʱ����ʹ�ñ�ʾĳ�ֿɷ������͵� Class ����
 * 
 * ��֮�������������еķǹ������͵ĳ�Ա�ǲ��Ϸ��ģ���ʹ�����ԱͬʱҲ����
��Ϊĳ���������͵Ĺ�����ԱҲ����ˡ����������Ա�Ƿ���ͨ�����䱻����
�ģ����������ǳ����ġ�
 * **/
public class Seventy_eight_Reflector {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Set<String>s=new HashSet<>();
		s.add("foo");
		Iterator it = s.iterator();
		Method method=Iterator.class.getMethod("hasNext");
		System.out.println(method.invoke(it));
	}
}
