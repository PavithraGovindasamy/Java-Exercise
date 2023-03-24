package bf;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
	public static void main(String[] args) {

		String sourcePath = "img/masangudi.png";
		String destPath = "img/picture.jpg";

		try (FileInputStream inputStream = new FileInputStream(sourcePath);
				FileOutputStream outputStream = new FileOutputStream(destPath)) {

			int bytesRead;
			byte[] buffer = new byte[4096];
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead);
			}

			System.out.println("Image copied successfully.");

		} catch (IOException ex) {
			System.err.println("Error copying image: " + ex.getMessage());
		}
	}
}
