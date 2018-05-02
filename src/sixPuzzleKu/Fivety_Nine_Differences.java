package sixPuzzleKu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/***
 * 千万不要在一个整型字面常量的前面加上一个 0；这会使它变成一个八进制字面常量。
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
