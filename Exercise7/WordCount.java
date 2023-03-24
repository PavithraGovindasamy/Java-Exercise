package bf;

public class WordCount {
	public static int wordcount(String string) {
		int count = 0;

		char ch[] = new char[100];
		for (int i = 0; i < string.length(); i++) {
			ch[i] = string.charAt(i);
			if (ch[i] == ' ' || i == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String string = "If you want a huge competitor go and see the mirror";
		System.out.println(wordcount(string) + " words.");
	}
}
