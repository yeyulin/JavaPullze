package sixPuzzleKu;

import java.util.HashSet;
import java.util.Set;
//当你想要进行覆写时，千万不要进行重载。
public class Fivety_Eight_Name {
	private String first,last;

	public Fivety_Eight_Name(String first, String last) {
		super();
		this.first = first;
		this.last = last;
	}
/*	public boolean equals(Object o) {
		if(!(o instanceof Fivety_Seven_Name))
			return false;
		Fivety_Eight_Name n=(Fivety_Eight_Name) o;
		return n.first.equals(first) && n.last.equals(last);
	}
	public int hashCode() {
		return 31 * first.hashCode() + last.hashCode();
	}*/
	
	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(new Fivety_Eight_Name("Mickey", "Mouse"));
		System.out.println(s.contains(new Fivety_Eight_Name("Mickey", "Mouse")));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((last == null) ? 0 : last.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fivety_Eight_Name other = (Fivety_Eight_Name) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (last == null) {
			if (other.last != null)
				return false;
		} else if (!last.equals(other.last))
			return false;
		return true;
	}
}
