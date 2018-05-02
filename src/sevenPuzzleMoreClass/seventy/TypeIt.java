package sevenPuzzleMoreClass.seventy;

import sevenPuzzleMoreClass.seventy.click.CodeTalk;
/***
 * 包内私有的方法不能直接被包外的方法声明所覆写
 * 
 * */
public class TypeIt {
	private static class ClickIt extends CodeTalk {
		void printMessage() {
			System.out.println("Hack");
		}
	}
	public static void main(String[] args) {
		ClickIt clickIt=new ClickIt();
		clickIt.doIt();
	}
	
}
