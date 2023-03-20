package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 
 * @author pavithra
 * class that counts value from 1-100 using thread
 *
 */
public class CountingThread {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);

		es.execute(() -> {
			for (int i = 1; i <= 100; i++) {
				count.thread1();
			}

		});

	}
}
/**
 * 
 * @author pavithra
 * class that implements the thread method
 * 
 *
 */
class count extends Thread {
	static int count;

	static void thread1() {
		count++;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

		System.out.println("count" + count);
		if (count % 10 == 0 && count != 1) {
			System.out.println("Ten numbers Completed!");
		}
	}

}
