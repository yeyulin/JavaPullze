package forty;
/**
 * 是为了诱使你去认为乘法比取余有更高的优先级。然而，编译器是忽略空格的
 * */
public class Thirty_five {
	public static void main(String[] args) {
		int minutes=0;
		for(int ms=0;ms< 60*60*1000;ms++) {
			if(ms % (60*1000) == 0){
				minutes++;
			}
		}
		System.out.println(minutes);
  }
}
