package sixPuzzleKu;

import java.util.HashMap;
import java.util.Map;
/***
 * 语言规范保证了字符串是内存限定的，换句话说，相等的字符串常量同时也是相同的
 * 
 * **/
public class SixTy_two_NameGame {
	public static void main(String[] args) {
		Map<String, String> m =new HashMap<String, String>();
		m.put("Mickey", "Mouse");
		m.put("Mickey", "Mantle");
		m.put("Mickey", "Mantl");
		System.out.println(m.size());
	}
}
