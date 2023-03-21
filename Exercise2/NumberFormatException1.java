package pack;

import java.util.Scanner;
/**
 * 
 * @author pavithra
 * class   NegativeValueException  that throws exception
 *
 */
class NegativeValueException extends Exception {

	public NegativeValueException(String message) {
		super(message);
	}
}
/**
 * 
 * @author pavithra
 * class  OutOfRangeException that throws exception
 *
 */
class OutOfRangeException extends Exception {

	public OutOfRangeException(String message) {
		super(message);
	}
}

/**
 * 
 * @author pavithra
 * Class NumberFormatException1 that gets marks from 10 student
 *
 */
public class NumberFormatException1 {
    /**
     * 
     * @param args
     * The Main method
     */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 marks for students");

		String[] arr = new String[10];
		int sum = 0;
		int count = 0; // initialize counter variable
		while (count < 10) { // use counter variable as loop termination condition
		    arr[count] = sc.nextLine();
		    try {
		        int found = Integer.parseInt(arr[count]);
		        if (found < 0) {
		            throw new NegativeValueException("value less than 0 ");
		        } else if (found > 100) {
		            throw new OutOfRangeException("Value greater than 100");
		        }
		        sum = sum + found;
		        count++; // increment counter variable
		    } catch (NumberFormatException e) {
		        System.out.println("NumberFormat Exception: invalid input string");
		    } catch (NegativeValueException e) {
		        System.out.println("Negative value entered: " + e.getMessage());
		    } catch (OutOfRangeException e) {
		        System.out.println("Value entered greater than 100 " + e.getMessage());
		    }
		}
		sc.close();
		System.out.println("Average: " + (sum / 10));
	}

}