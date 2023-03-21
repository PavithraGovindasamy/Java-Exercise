package pack;

/**
 * 
 * @author pavithra The Class WithoutCatchException
 *
 */
public class WithoutCatchException {
	/**
	 * 
	 * @param args The Main method
	 * @throws NegativeNumberException
	 */
	public static void main(String[] args) throws NegativeNumberException {
		try {
			int number = -10;
			if (number < 0) {
				throw new NegativeNumberException("Negative numbers are not allowed");
			}
			System.out.println("Number is " + number);
		} finally {
			System.out.println("Finally block executed");
			
		}
	}
	
	
}
/**
 * 
 * @author pavithra 
 * class that passes the message to exception
 *
 */

class NegativeNumberException extends Exception {
	public NegativeNumberException(String message) {
		super(message);
	}
}
