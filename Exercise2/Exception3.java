package pack;
/**
 * 
 * @author pavithra
 * Class Exception that uses exit function
 *
 */
public class Exception3 {
	public void mth1() {
		mth2();
		System.out.println("caller");
	}

	public void mth2() {
		try {
			System.out.println("ok");
			int n = 12 ;
			System.exit(-89);
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			System.out.println("finally-mth2");
		}
	}
	/**
	 * 
	 * @param p
	 * The Main method
	 */

	public static void main(String p[]) {
		Exception3 obj = new Exception3();
		obj.mth1();
	}

}
