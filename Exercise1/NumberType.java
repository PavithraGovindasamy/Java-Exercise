package packing;

import java.util.Scanner;

/**
 * 
 * @author pavithra
 *  class that checks if a number is amstrong or palindrome or
 *  perfect number
 *
 */
public class NumberType {
	/**
	 * 
	 * @param args The Main method
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		scanner.close();
		int sum = 0;
		int temp = num;
		int tempVar = num;
		int rev = 0;
		int isAmstrong = 0, isPalindrome = 0, isPerfect = 0;
		int count = 0;
		while (tempVar > 0) {
			int digit = tempVar % 10;
			count++;
			tempVar = tempVar / 10;
		}
		while (temp > 0) {
			int digit = temp % 10;
			sum += Math.pow(digit, count);
			rev = rev * 10 + digit;
			temp /= 10;
		}

		if (num == sum || num < 10) {
			System.out.println(num + " is an Armstrong number");
			isAmstrong = 1;
		}
		if (num == rev) {
			System.out.println(num + " is a Palindrome number");
			isPalindrome = 1;
		}
		sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		if (sum == num) {
			System.out.println(num + " is a Perfect number");
			isPerfect = 1;
		}

		if (isAmstrong == 0 && isPalindrome == 0 && isPerfect == 0) {
			System.out.println("Neither Amstrong nor palibdrome nor a perfect number");
		}
	}
}
