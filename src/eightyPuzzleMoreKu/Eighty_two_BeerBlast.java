package eightyPuzzleMoreKu;

import java.io.IOException;
import java.io.InputStream;
/***
 * Ϊ��ȷ���ӽ����ܹ�������������ſ���������������ڴ�����
��error stream��Ҳ��һ�������������ܻ���鷳��
 * 
 * **/
public class Eighty_two_BeerBlast {
	static final String COMMAND = "java BeerBlast slave";
	public static void main(String[] args) throws IOException, InterruptedException {
		if(args.length == 1 && args[0].equals("slave")) {
			for(int i = 99; i > 0; i--){
				System.out.println( i +
				" bottles of beer on the wall" );
				System.out.println(i + " bottles of beer");
				System.out.println(
				"You take on down, pass it around,");
				System.out.println( (i-1) +
				" bottles of beer on the wall");
				System.out.println();
				}
		}else {
			Process process = Runtime.getRuntime().exec(COMMAND);
			drainInBackground(process.getInputStream());
			int exitValue = process.waitFor();
			System.out.println("exit value = " + exitValue);
		}
	}
	static void drainInBackground(final InputStream is) {
		new Thread(new Runnable(){
			public void run(){
				try{
					while( is.read() >= 0 );
				} catch(IOException e){
					e.printStackTrace();
				}
			}
		}).start();
	}
}
