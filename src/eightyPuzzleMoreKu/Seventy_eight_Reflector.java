package eightyPuzzleMoreKu;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/***
 * 在使用反射访问某个类型时，请使用表示某种可访问类型的 Class 对象
 * 
 * 总之，访问其他包中的非公共类型的成员是不合法的，即使这个成员同时也被声
明为某个公共类型的公共成员也是如此。不论这个成员是否是通过反射被访问
的，上述规则都是成立的。
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
