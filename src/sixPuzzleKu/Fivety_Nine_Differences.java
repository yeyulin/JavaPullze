package sixPuzzleKu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/***
 * ǧ��Ҫ��һ���������泣����ǰ�����һ�� 0�����ʹ�����һ���˽������泣����
 * **/
public class Fivety_Nine_Differences {
	public static void main(String[] args) {
		int vals[ ] = { 789, 678, 567, 456, 345, 234, 123, 012 };
		System.out.println(Arrays.toString(vals));
		Set diffs = new HashSet();
		for (int i = 0; i < vals.length; i++)
			for (int j = i; j < vals.length; j++)
				diffs.add(vals[i] - vals[j]);
		System.out.println(diffs);
		
	}
}
