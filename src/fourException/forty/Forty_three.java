package fourException.forty;

public class Forty_three {
	public static void main(String[] args) {
		sneakyThrow(new Throwable());
	}
	public static void sneakyThrow(Throwable t) {
		Thread.currentThread().stop(t); // Deprecated!!
		}
}
