package packing;

/**
 * 
 * @author pavithra Class that prints numbers from 1-100
 *
 */
public class PrimeNumberList {
	/**
	 * 
	 * @param args The Main method
	 */
	public static void main(String[] args) {
		int i;
		int n = 1;
		System.out.println("System.out.println(\"Prime numbers between 1-100");
		for (i = 1; i <= 100; i++) {
			prime(i);
		}
	}

	private static void prime(int n) {
		int flag = 0, i;
		for (i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.print(n + " ");
		}

	}
}
