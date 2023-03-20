package packing;

/**
 * 
 * @author pavithra The class PassByValueReference
 *
 */
public class PassByValueReference {
	/**
	 * 
	 * @param args The Main method
	 */
	public static void main(String[] args) {
		Area obj = new Area();
		System.out.println("display Area:" + obj.size);
		NewArea new_area = new NewArea();
		new_area.passByValue(obj.size);
		System.out.println("display Area:" + obj.size);
		new_area.passByReference(obj);
		System.out.println("display Area:" + obj.size);
		Integer s=null;
		new_area.passByValue(s);
		System.out.println(s);
		

	}
}

/**
 * 
 * @author pavithra The Class Area
 *
 */
class Area {
	int size = 10;
}

/**
 * 
 * @author pavithra The Class New Area
 *
 */
class NewArea {
	public void passByValue(Integer size) { // pass by value
		size = new Integer(89);
	}

	public void passByReference(Area a) { // pass by reference
		a.size = 90;
	}
}
