package fourException;
/**
 * 当 try 语句块和 finally 语句块都意外结束时，在 try 语句块中引发意外结束的
原因将被丢弃，
 * **/
public class Thirty_six {
	public static void main(String[] args) {
		System.out.println(decision());
		
		}
		static boolean decision() {
		try {
		return true;
		} finally {
		return false;
		}
	}
}
