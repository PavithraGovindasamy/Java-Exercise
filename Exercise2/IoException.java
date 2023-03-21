package pack;

import java.io.IOException;
/**
 * 
 * @author pavithra
 * IOException that throws a exception
 *
 */
public class IoException {
	/**
	 * 
	 * @throws IOException
	 * The method
	 */
	public void method() throws IOException {
		throw new IOException("error occured");
	}
}
