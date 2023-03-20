package pack;

import java.util.Scanner;

/**
 * 
 * @author pavithra 
 * class that throws a CustomException if a value is negative
 *
 */
public class CustomException {
	/**
	 * 
	 * @param args 
	 * The Main method
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			int number = sc.nextInt();
            
			if (number < 0) {
				throw new NegativeNumberException("Negative numbers are not allowed");
			}
			System.out.println("Number is " + number);

		} catch (NegativeNumberException e) {
			System.out.println(e.getMessage());
		} 
		finally {
			sc.close();
		}

	}
	

}
/**
 * 
 * @author pavithra 
 * class that pass the error message to exception
 *
 */
class NegativeNumberException extends Exception {
	public NegativeNumberException(String message) {
		super(message);
	}
}
