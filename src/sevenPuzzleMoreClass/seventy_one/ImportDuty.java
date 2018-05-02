package sevenPuzzleMoreClass.seventy_one;
import static java.util.Arrays.toString;

import java.util.Arrays;
/***
 * 变量声明可以遮掩类型和包声明，而类型声明也可以遮掩包声明。
 * 
 * **/
public class ImportDuty {
	public static void main(String[ ] args) {
		printArgs(1, 2, 3, 4, 5);
		}
	static void printArgs(Object... args) {
		System.out.println(Arrays.toString(args));
		//System.out.println(Arrays.toString(args));
	}
	/**
	 * @param args
	 * @return
	 *//*
	private static char[] toString(Object[] args) {
		// TODO Auto-generated method stub
		return null;
	}*/
}
