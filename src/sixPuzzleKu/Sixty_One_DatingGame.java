package sixPuzzleKu;

import java.util.Calendar;
import java.util.Date;

public class Sixty_One_DatingGame {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(1999, Calendar.DECEMBER, 31);
		System.out.print(cal.get(Calendar.YEAR) + " ");
		Date d = cal.getTime();
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	}
}
