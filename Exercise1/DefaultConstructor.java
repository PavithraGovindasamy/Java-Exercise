package packing;

/**
 * 
 * @author pavithra The Class Default Constructor
 *
 */
public class DefaultConstructor {
	/**
	 * 
	 * @param args The Main method
	 */
	public static void main(String[] args) {
		C var = new C();
		var.method();

	}
}

/**
 * 
 * @author pavithra Class A
 *
 */

class A {

}

/**
 * 
 * @author pavithra Class B
 *
 */

class B {
	int b = 10;
	String name = "pavi";
}

/**
 * 
 * @author pavithra Class C that implements method and try to access the B class
 *
 */

class C extends A {
	public void method() {
		B new_var = new B();
		new_var.b = 23;
		System.out.println(new_var.b);
		System.out.println(new_var.name);

	}
}