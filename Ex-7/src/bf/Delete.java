package bf;
import java.io.File;

public class Delete {
	public static void main(String[] args) {
		File file = new File("./newfile.txt");

		if (file.delete()) {
			System.out.println("File deleted successfully");
		} else {
			System.out.println("Failed to delete the file");
		}
	}
}
