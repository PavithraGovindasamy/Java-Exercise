package thread;


import java.text.DateFormat;
import java.util.Date;
/**
 * 
 * @author pavithra
 * class that executes thread to print date in loop
 *
 */
class method{
	
		public void newclock() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				while(true) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println(e);
					}

				DateFormat DFormat = DateFormat.getTimeInstance();
		        String str = DFormat.format(new Date());
		        System.out.println(str);
				}

			}

		}).start();}
	}
/**
 * 
 * @author pavithra
 * class that creates object for method class
 *
 */
public class DigitalClock{
	/**
	 * 
	 * @param args
	 * main method
	 */
	public static void main(String[] args) {
		method obj=new method();
		obj.newclock();
	}
}



