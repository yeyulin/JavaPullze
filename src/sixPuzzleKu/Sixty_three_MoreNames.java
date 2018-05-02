package sixPuzzleKu;

import java.util.HashMap;
import java.util.Map;
/***
 * 更一般地讲，要遵守标准的命名习惯，它强制要求方法名
必须以小写字母开头，而类名应该以大写字母开头
 * 
 * */
public class Sixty_three_MoreNames {
	private Map<String,String> m = new HashMap<String,String>();
	public  Sixty_three_MoreNames() {
		m.put("Mickey", "Mouse");
		m.put("Mickey", "Mantle");
	}
	public int size() {
		return m.size();
	}
	public static void main(String[] args) {
		Sixty_three_MoreNames moreNames=new Sixty_three_MoreNames();
		System.out.println(moreNames.size());
	}
}
