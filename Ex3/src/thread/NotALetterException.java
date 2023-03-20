package thread;

import java.io.IOException;
import java.lang.reflect.Method;
/**
 * 
 * @author pavithra
 * class that checks whether a given string has alphabets or not
 *
 */
public class NotALetterException {
	/**
	 * 
	 * @param args
	 * Main method
	 */
public static void main(String[] args) {
	new Thread(new Runnable() {

		@Override
		public void run() {
			String msg="abcAefgDijklmno9pq-dstuvwx4y234z";
			for(int i=0;i<msg.length();i++) {
				AlphabetCheck.method(msg.charAt(i));
			}
			
		}
		
	}).start();
	
}
}
/**
 * 
 * @author pavithra
 * class that checks if the given character is character or not
 *
 */
class AlphabetCheck{
public static void method(char c) {
	  try {
	  if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
		  System.out.println("Alphabet:" + c);
	  }
	  else {
		  throw new IOException();
	  }
	  }
	  catch(IOException e){
          System.out.println("It is not an alphabet "+ c);
      }
}
}