package pack;
/** 
 * 
 * @author pavithra
 * BaseClass to throw an exceptiomn
 *
 */
class BaseClass {
	BaseClass() throws Exception {
		System.out.println("base");

		throw new Exception("Base constructor exception");

	}
}
/**
 * 
 * @author pavithra
 * DerivedClass to throw an exception from its parent
 *
 */

class DerivedClass extends BaseClass {
    DerivedClass() throws Exception {
    	
        try {
        	//super();
        } catch (Exception e) {
            System.out.println("Derived constructor caught exception: " + e.getMessage());
        }
    }
}

/**
 * 
 * @author pavithra
 * class that creates object for Dervied class
 *
 */
public class BaseDerivedClass {
	/**
	 * 
	 * @param args
	 * The main method
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		BaseClass b = new DerivedClass();
	}
}