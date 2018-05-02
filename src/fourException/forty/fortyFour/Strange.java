package fourException.forty.fortyFour;

public class Strange {
	public static void main(String[] args) throws Exception{
		try {
			Object m = Class.forName("Missing").newInstance();
			System.out.println(m.getClass().getSimpleName());
		} catch (ClassNotFoundException ex) {
			System.err.println("Got it!");
		}
	}
}
