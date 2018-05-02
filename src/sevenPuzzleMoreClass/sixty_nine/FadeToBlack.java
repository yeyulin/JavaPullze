package sevenPuzzleMoreClass.sixty_nine;
/***
 * 解决由类型被变量遮掩而引发的问题，需要按照标准的命名习惯来重命
名类型和变量，
 * 
 * ***/
public class FadeToBlack {
	static class Xy extends X.Y{ }
	public static void main(String[] args) {
		System.out.println(Xy.Z);
	}
	
	/*public static <T extends X.Y> void main(String[] args){
		System.out.println(T.Z);
	}*/
}
