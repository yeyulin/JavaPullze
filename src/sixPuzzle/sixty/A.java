package sixPuzzle.sixty;
/****
 * A����дһ��������������һ������Ԫ�ص� List��������һ���µ� List��
 *	������ͬ��˳�������ͬ��Ԫ�أ�ֻ�������ѵڶ����Լ��������ֵ��ظ�
 *	Ԫ�ض��޳��ˡ����磬����㴫����һ����
 *	����spam��,��sausage��,��spam��,��spam��,��bacon��,��spam��,��t
 *	omato���͡�spam�����б���ô�㽫�õ�һ����
 *	����spam��,��sausage��,��bacon��,��tomato�������б�
 *
 *  ��Щ�����ķ����嶼ֻ����һ�д��롣
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
