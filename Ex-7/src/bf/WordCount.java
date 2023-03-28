package bf;

public class WordCount {
	public static int wordCount(String string) {
		int count = 0;

		char ch[] = new char[100];
		for (int i = 0; i < string.length(); i++) {
			ch[i] = string.charAt(i);
			if ((ch[i] == ' ' || i == 0) && (i!=string.length()-1)) {
				count++;
				System.out.println(i);
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String string = " If you want a huge competitor go and see the mirror ";
		System.out.println(wordCount(string) + " words.");
	}
}


