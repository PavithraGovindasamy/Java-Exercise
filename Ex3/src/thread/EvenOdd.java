package thread;
/**
 * 
 * @author pavithra
 * class to print even and odd numbers using threads
 *
 */
public class EvenOdd {
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Even numbers");
				for (int i = 0; i <= 100; i = i + 2) {
					System.out.println(i);
				}

			}
		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Odd numbers");
				for (int i = 1; i <= 100; i = i + 2) {
					System.out.println(i);
				}

			}
		}).start();
	}
}
