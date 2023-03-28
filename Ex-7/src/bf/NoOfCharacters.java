package bf;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NoOfCharacters {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        System.out.println("enter character");
        try {
            int c;
            while ((c = reader.read()) != -1) {
                count++;
            }
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }

        System.out.println("Number of characters entered: " + count);
    }
}
