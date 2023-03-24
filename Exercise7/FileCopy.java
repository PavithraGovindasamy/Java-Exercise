package bf;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
		try {
			FileReader sourceFile = new FileReader("source_file.txt");
			FileWriter destinationFile = new FileWriter("destination_file.txt");

			int character;
			while ((character = sourceFile.read()) != -1) {
				destinationFile.write(character);
			}

			sourceFile.close();
			destinationFile.close();
			System.out.println("File copied successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
