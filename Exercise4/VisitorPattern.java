package patterns;

/**
 * 
 * @author pavithra Class that implements VisitorPattern
 *
 */
public class VisitorPattern {
	public static void main(String[] args) {
		Van obj = new Van("Pavi");
		Bike obj2 = new Bike("Sandhya");
		HomeVisitor visitor = new Visitor();
		obj.accept(visitor);
		obj2.accept(visitor);
	}
}
/**
 * 
 * @author pavithra
 * interface that has a method of accepting the object of HomeVisitor object 
 *
 */
interface Home {
	public void accept(HomeVisitor visitor);
}

class Van implements Home {
	private String visitor1;

	public Van(String visitor1) {
		this.visitor1 = visitor1;
	}

	public String getVisitor() {
		return visitor1;
	}

	@Override
	public void accept(HomeVisitor visitor) {
		visitor.visitVan(this);
	}

}

class Bike implements Home {
	private String visitor2;

	public Bike(String visitor2) {
		this.visitor2 = visitor2;
	}

	public String getVisitor() {
		return visitor2;
	}

	@Override
	public void accept(HomeVisitor visitor) {
		visitor.visitBike(this);

	}
}
/**
 * 
 * @author pavithra
 * interface that has a method of accepting the object of Van and Bike
 *
 */
interface HomeVisitor {
	void visitVan(Van Van);
	void visitBike(Bike bike);
}

class Visitor implements HomeVisitor {

	@Override
	public void visitVan(Van Van) {
		String name = Van.getVisitor();
		String visitor1 = name + " should go by Van";
		System.out.println(visitor1);
	}

	@Override
	public void visitBike(Bike bike) {
		String name = bike.getVisitor();
		String visitor2 = name + " should go by bike";
		System.out.println(visitor2);
	}

}
