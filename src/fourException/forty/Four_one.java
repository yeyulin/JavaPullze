package fourException.forty;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/***
 * 对于任何在 finally语句块中可能会抛出的被检查异常都要进行处理
 * */
public class Four_one {
	static void copy(String src, String dest) throws IOException {
		InputStream in=null;
		OutputStream out = null;
		try {
			in=new FileInputStream(src);
			out = new FileOutputStream(dest);
			byte[] buf = new byte[1024];
			int n;
			while ((n = in.read(buf)) > 0)
			out.write(buf, 0, n);
		}finally {
			/*if (in != null) {
				try {
				in.close();
				} catch (IOException ex) {
				}
				if (out != null)
					try {
					out.close();
					} catch (IOException ex) {
					// There is nothing we can do if close fails
					}
			}*/
			closeIgnoringException(in);
			closeIgnoringException(out);
		}
	}
	private static void closeIgnoringException(Closeable c) {
		if (c != null) {
		try {
		c.close();
		} catch (IOException ex) {
			}
		}
	}
	private static void customBufferStreamCopy(File source, File target) {
		try(InputStream fis = new FileInputStream(source);
			OutputStream fos = new FileOutputStream(target)) {
			 byte[] buf = new byte[8192];
			  
		        int i;
		        while ((i = fis.read(buf)) != -1) {
		            fos.write(buf, 0, i);
		        }
		} catch (Exception e) {
			  e.printStackTrace();
		}
	}
}	
