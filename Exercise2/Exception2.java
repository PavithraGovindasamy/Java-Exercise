package pack;
/**
 * 
 * @author pavithra
 * Class Exception that throws a exception
 *
 */
public class Exception2 {
	public void mth1() {
		mth2();
		System.out.println("caller");
	}

	public void mth2() {
		try {
			int n = 12 / 0;
			return;
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			System.out.println("finally-mth2");
		}
	}
    /**
     * The Main method
     * @param p
     */
	public static void main(String p[]) {
		Exception2 s = new Exception2();
		s.mth1();
	}

}
