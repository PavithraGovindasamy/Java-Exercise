package patterns;
/**
 * 
 * @author pavithra
 *  Singleton Class where only one object can be created
 *
 */
public class Singleton {
	public static void main(String[] args) {
		ObjectCreation obj1 = ObjectCreation.instance();
		ObjectCreation obj3 = ObjectCreation.instance();
		NewClass.method();
	}
}

/**
 * 
 * @author pavithra\
 *  class which implements the logic by checking the object as
 *  null or not
 *
 */
class ObjectCreation {
	private ObjectCreation() { // so that no objects can be created outside
		System.out.println("object created");
	}

	private static ObjectCreation obj;
	public static ObjectCreation instance() {
		if (obj == null) {
			obj = new ObjectCreation();

		}
		return obj;
	}
}

/**
 * 
 * @author pavithra 
 * class that tries to acess the singleton class to get object
 *
 */
class NewClass {
	public static void method() {
		ObjectCreation obj4 = ObjectCreation.instance();
	}
}