package sixPuzzleKu;

import java.util.HashSet;
import java.util.Set;
/***
 * �����ڸ�дһ������ʱ�����������һ��ͨ�õ�Լ������ô��һ��Ҫ������
 * ��д equals ����ʱ��һ��Ҫ���Ÿ�д hashCode ����
 * **/
public class Fivety_Seven_Name {
	private String first,last;

	public Fivety_Seven_Name(String first, String last) {
		super();
		this.first = first;
		this.last = last;
	}
	public boolean equals(Object o) {
		if(!(o instanceof Fivety_Seven_Name))
			return false;
		Fivety_Seven_Name n=(Fivety_Seven_Name) o;
		return n.first.equals(first) && n.last.equals(last);
	}
	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(new Fivety_Seven_Name("Mickey", "Mouse"));
		System.out.println(s.contains(new Fivety_Seven_Name("Mickey", "Mouse")));
		System.out.println(new Fivety_Seven_Name("Mickey", "Mouse").equals(new Fivety_Seven_Name("Mickey", "Mouse")));
	}
}
