package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 
 * @author pavithra
 * class that implements 2 threads to call consume
 *
 */
public class ConsumerProducer {
	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(2);
		InventorySystem object = new InventorySystem();
		es.execute(() -> {

			object.producer();

		});
		es.execute(() -> {

			object.consumer();

		});
		es.shutdown();
	}
}
/**
 * 
 * @author pavithra
 * class that implements two methods that notify each other to implement the consumer and producer methods
 *
 */
class InventorySystem {
	boolean produced;
 
	synchronized public void producer() {   
		if (produced) {               
			try {
				wait();
			} catch (Exception e) {
			}
		}
		System.out.println("producer added the product");
		produced = true;
		notify();
	}

	synchronized public void consumer() {      
		
		
		if (!produced) {
			try {
				wait();
			} catch (Exception e) {
			}
		}
		System.out.println("consumer buy the product");
		produced = false;
		notify();
	}
}