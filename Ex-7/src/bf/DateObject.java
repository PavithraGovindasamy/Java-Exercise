package bf;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class DateObject {
	public static void main(String[] args) {
		try {
			Date date = new Date();
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("./date.txt"));
			outputStream.writeObject(date);
			outputStream.close();

			ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("./date.txt"));
			Date dateFromFile = (Date) inputStream.readObject();
			inputStream.close();

			System.out.println("Original date: " + date);
			System.out.println("Date read from file: " + dateFromFile);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
