package patterns;

/**
 * 
 * @author pavithra interface that excecutes commandPattern
 *
 */
public class CommandPattern {
	public static void main(String[] args) {
		Flavour flavour = new Flavour();
		Toppings toppings = new Toppings();
		Color color = new Color();
		Favour favour = new Favour();
		System.out.println("Hey your ice-cream with");
		PrepareFlavour object = new VenillaCommand(flavour, toppings, color, favour);
		object.execute();
	}
}

/**
 * 
 * @author pavithra class that has the execute command
 *
 */
abstract class PrepareFlavour {
	Flavour Flavour;
	Toppings toppings;
	Color color;
	Favour favour;

	abstract void execute();
}

class StrawberryCommand extends PrepareFlavour {

	public StrawberryCommand(Flavour Flavour, Toppings toppings, Color color, Favour favour) {
		this.Flavour = Flavour;
		this.toppings = toppings;
		this.color = color;
		this.favour = favour;
	}

	@Override
	public void execute() {

		Flavour.addFlavour("strawberry");
		toppings.addToppings("candy");
		color.addColor("pink");
		favour.addFavour("Kitkat");

	}

}

class VenillaCommand extends PrepareFlavour {

	public VenillaCommand(Flavour Flavour, Toppings toppings, Color color, Favour favour) {
		this.Flavour = Flavour;
		this.toppings = toppings;
		this.color = color;
		this.favour = favour;
	}

	@Override
	public void execute() {

		Flavour.addFlavour("Venilla");
		toppings.addToppings("nuts");
		color.addColor("white");

	}

}

class ChocolateCommand extends PrepareFlavour {

	public ChocolateCommand(Flavour Flavour, Toppings toppings, Color color, Favour favour) {
		this.Flavour = Flavour;
		this.toppings = toppings;
		this.color = color;
		this.favour = favour;
	}

	@Override
	public void execute() {

		Flavour.addFlavour("Chocolate");
		toppings.addToppings("cherry");
		color.addColor("brown");

	}

}

/**
 * 
 * @author pavithra class that implements the methods inside execute method
 *
 */
class Flavour {

	public void addFlavour(String string) {

		System.out.println("Flavour:" + string + " and");
	}

}

class Toppings {
	public void addToppings(String string) {
		System.out.println("Toppings:" + string);
	}
}

class Color {
	public void addColor(String string) {
		System.out.println("Color:" + string);
	}
}

class Favour {
	public void addFavour(String string) {
		System.out.println("Favour:" + string);
	}
}
