package bf;

import java.io.File;

public class ListDirectories {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java ListFiles <directory>");
			System.exit(1);
		}

		File dir = new File(args[0]);

//		if (!dir.isDirectory()) {
//			System.out.println("Error: " + args[0] + " is not a directory");
//			System.exit(1);
//		}

		String[] files = dir.list();
 System.out.println(files);
		for (String file : files) {
			  
				System.out.println("[DIR] " + file);
		
		}
	}
}
