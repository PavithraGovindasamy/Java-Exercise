package patterns;
/**
 * 
 * @author pavithra
 * class that builds a phone by setting its attribute
 *
 */
public class BuilderPattern {
	public static void main(String[] args) {
		Car obj = new CarBuilder().setmodel("suzuki").setyear(2008).build();
		System.out.println(obj);
	}

}
/**
 * 
 * @author pavithra
 * class that returns the string of objects
 *
 */
class Car {
	private String model;
	private int year;
	private String color;
	private int door;

	public Car(String model, int year, String color, int door) {
		super();
		this.model = model;
		this.year = year;
		this.color = color;
		this.door = door;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", color=" + color + ", door=" + door + "]";
	}
}
/**
 * 
 * @author pavithra
 * class that sets the attributes of car
 * 
 *
 */
class CarBuilder {

	private String model;
	private int year;
	private String color;
	private int door;

	public CarBuilder setmodel(String model) {
		this.model = model;
		return this;
	}

	public CarBuilder setyear(int year) {
		this.year = year;
		return this;

	}

	public CarBuilder setcolor(String color) {
		this.color = color;
		return this;

	}

	public CarBuilder setdoor(int year) {
		this.year = year;
		return this;

	}

	public Car build() {
		return new Car(model, year, color, year);
	}

}
