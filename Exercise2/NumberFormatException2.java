package pack;

import java.util.Scanner;
/**
 * 
 * @author pavithra
 * class that get marks of 10 students and throw an exception
 *
 */
public class NumberFormatException2 {
    /**
     * 
     * @param args
     * The  Main method
     * 
     */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 marks for students");
		
		String[] arr = new String[10];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextLine();
			try {
				int found = Integer.parseInt(arr[i]);			
				sum = sum + found;

			}

			catch (NumberFormatException e) {
				System.out.println("NumberFormat Exception: invalid input string");
				i--;
			}
			finally {
				sc.close();
			}
			

		}
		System.out.println("Average" + (sum / 10));
	}

}