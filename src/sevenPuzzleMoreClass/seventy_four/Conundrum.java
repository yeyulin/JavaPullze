package sevenPuzzleMoreClass.seventy_four;
/***
 * 如果你重载了一个方法，那
么一定要确保所有的重载版本行为一致
 * 
 * **/
public class Conundrum {
	public static void main(String[] args) {
		Enigma e = new Enigma();
		System.out.println(e.equals(e));
	}
}
