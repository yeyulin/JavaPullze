package sixPuzzleKu;

import java.util.HashMap;
import java.util.Map;
/***
 * ��һ��ؽ���Ҫ���ر�׼������ϰ�ߣ���ǿ��Ҫ�󷽷���
������Сд��ĸ��ͷ��������Ӧ���Դ�д��ĸ��ͷ
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
