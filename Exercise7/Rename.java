package bf;

import java.io.File;

public class Rename {
	public static void main(String[] args) {

		File file = new File("file6.txt");
		File rename = new File("file2.txt");

		boolean flag = file.renameTo(rename);

		if (flag == true) {
			System.out.println("File Successfully Rename");
		} else {
			System.out.println("Operation Failed");
		}
	}

}