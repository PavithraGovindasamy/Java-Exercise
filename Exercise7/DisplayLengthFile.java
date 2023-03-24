package bf;

import java.io.File;

public class DisplayLengthFile {
	public static void main(String[] args) {
		File file = new File("file2.txt");
		System.out.println(file.length() + " bytes");
	}
}
