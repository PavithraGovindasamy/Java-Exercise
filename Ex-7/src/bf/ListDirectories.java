package bf;

import java.io.File;

public class ListDirectories {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java ListFiles <directory>");
			System.exit(1);
		}

		File directory = new File(args[0]);
		String[] files = directory.list();
		System.out.println(files);
		for (String file : files) {

			System.out.println("[DIR] " + file);

		}
	}
}
