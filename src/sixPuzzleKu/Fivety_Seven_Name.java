package sixPuzzleKu;

import java.util.HashSet;
import java.util.Set;
/***
 * 当你在覆写一个方法时，如果它具有一个通用的约定，那么你一定要遵守它
 * 覆写 equals 方法时，一定要记着覆写 hashCode 方法
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
