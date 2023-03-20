package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 
 * @author pavithra
 * class that calls a thread twice
 *
 */
public class ThreadCreationOnce {
	/**
	 * 
	 * @param args
	 * Main method
	 */
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			public void run() {
				System.out.println("Hello");
			}
		});

		thread.start();
		thread.start();

	}
}
