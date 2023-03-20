package pack;

import java.util.Scanner;
/**
 * 
 * @author pavithra
 * The Class Division
 *
 */
public class Division {
	/**
	 * 
	 * @param args
	 * The Main method
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int found = 0;
		while (found != 1) {
//			System.out.println("Pavi");

			try {
				String numerator = sc.next();
				String denominator = sc.next();
				if (numerator.charAt(0) == 'q' || numerator.charAt(0) == 'Q') {
					System.exit(0);
				}

				System.out.println(Integer.parseInt(numerator) / Integer.parseInt(denominator));

			} catch (Exception e) {
				System.out.println(e);
			}
			finally {
				sc.close();
			}

		}
	}
}
