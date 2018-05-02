package sixPuzzle.sixty;
/****
 * A．编写一个方法，它接受一个包含元素的 List，并返回一个新的 List，
 *	它以相同的顺序包含相同的元素，只不过它把第二次以及后续出现的重复
 *	元素都剔除了。例如，如果你传递了一个包
 *	含”spam”,”sausage”,”spam”,”spam”,”bacon”,”spam”,”t
 *	omato”和”spam”的列表，那么你将得到一个包
 *	含”spam”,”sausage”,”bacon”,”tomato”的新列表。
 *
 *  这些方法的方法体都只包含一行代码。
 * */

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;


public class A {
	
	public static <E>List<E>withoutDuplicates(List<E>es){
		return new ArrayList<E>(new LinkedHashSet<E>(es));
	}
	public static void main(String[] args) {
		List<String>list=new ArrayList<String>();
		list.add("spam");
		list.add("sausage");
		list.add("spam");
		List<String> withoutDuplicates = withoutDuplicates(list);
		withoutDuplicates.stream().forEach(System.out::println);
	}
}
