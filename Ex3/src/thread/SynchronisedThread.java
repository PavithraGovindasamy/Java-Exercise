package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 
 * @author pavithra
 * Thread that use threads to access a method 
 *
 */
public class SynchronisedThread {
	/**
	 * 
	 * @param args
	 * Main method where the threads are created
	 */
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		ThreadExecution thread = new ThreadExecution();
		es.execute(() -> {
			thread.thread1("[---Hiii---]");
		});
		es.execute(() -> {

			thread.thread1("[---Hello---]");

		});
		es.execute(() -> {

			thread.thread1("[---World---]");

		});

		es.shutdown();
	}
}
/**
 * 
 * @author pavithra
 * class that is declared as synchronized to make multiple threads to access it
 *
 */
class ThreadExecution extends Thread {

	synchronized public void thread1(String message) {
		System.out.println(message);
	}

}