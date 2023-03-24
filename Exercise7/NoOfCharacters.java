package bf;

import java.util.Scanner;

public class NoOfCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Please enter the charcters one by one");
		while (true) {
			char p = sc.next().charAt(0);
			if (p == '1')
				break;
			count++;
		}
		System.out.println(count);
	}
}
