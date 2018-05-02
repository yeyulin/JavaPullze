package eightyPuzzleMoreKu.eighty_three;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CopyDog {
	public static void main(String[] args) {
		Dog newDog = (Dog) deepCopy(Dog.INSTANCE);
		System.out.println(newDog == Dog.INSTANCE);
		System.out.println(newDog);
	}
	static public Object deepCopy(Object obj){
		try {
			ByteArrayOutputStream bos=new ByteArrayOutputStream();
			new ObjectOutputStream(bos).writeObject(obj);
			ByteArrayInputStream bin=new ByteArrayInputStream(bos.toByteArray());
			return new ObjectInputStream(bin).readObject();
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
		}
		
	}
}
