package bf;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineByLine {

	public static void main(String[] args) {
		BufferedReader reader;

		try {
			reader = new BufferedReader(new FileReader("./sample.txt"));
			String line = reader.readLine();

			while (line != null) {
				System.out.println(line);
				System.out.println("----");
				line = reader.readLine();
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}