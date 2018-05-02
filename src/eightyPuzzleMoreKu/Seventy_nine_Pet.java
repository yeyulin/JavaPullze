package eightyPuzzleMoreKu;
/**
 * 要小心无意间产生的遮蔽，
 * 
 * **/
public class Seventy_nine_Pet {
	public final String name;
	public final String food;
	public final String sound;
	public Seventy_nine_Pet(String name, String food, String sound) {
		super();
		this.name = name;
		this.food = food;
		this.sound = sound;
	}
	
	public void eat() {
		System.out.println(name + ": Mmmmm, " + food );
	}
	public void play() {
		System.out.println(name + ": " + sound + " " + sound);
	}
	public void sleep() {
		System.out.println(name + ": Zzzzzzz...");
	}
	public void live() {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while(true) {
					eat();
					play();
					sleep();
				}
				
			}
		}).start();
	}
	public static void main(String[] args) {
		new Seventy_nine_Pet("Fido", "beef", "Woof").live();
	}
	
}
