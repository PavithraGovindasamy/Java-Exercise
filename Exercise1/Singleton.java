package packing;

/**
 * 
 * @author pavithra Class that creates only one object even if multiple
 *         instances is called
 *
 */
public class Singleton {
	private static Singleton single_instance = null;
	private static String string;

	private Singleton() {
		string = "hello";

	}

	public static Singleton getInstance() {

		if (single_instance == null) {
			single_instance = new Singleton();
		}
		return single_instance;
	}

	/**
	 * 
	 * @param args Main method
	 */
	public static void main(String args[]) {
		Singleton text = Singleton.getInstance();
		Singleton text1 = Singleton.getInstance();
		Singleton text2 = Singleton.getInstance();
		System.out.println(text + " " + text2 + " " + text1);

		System.out.println(Singleton.string);

	}
}