package sixPuzzleKu;

import java.util.HashMap;
import java.util.Map;
/***
 * ���Թ淶��֤���ַ������ڴ��޶��ģ����仰˵����ȵ��ַ�������ͬʱҲ����ͬ��
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
