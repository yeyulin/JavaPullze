package sevenPuzzleMoreClass.seventy;

import sevenPuzzleMoreClass.seventy.click.CodeTalk;
/***
 * ����˽�еķ�������ֱ�ӱ�����ķ�����������д
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
