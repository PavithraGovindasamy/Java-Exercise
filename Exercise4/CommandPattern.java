package patterns;

/**
 * 
 * @author pavithra interface that excecutes commandPattern
 *
 */
public class CommandPattern {
	public static void main(String[] args) {
		IceCream ice = new IceCream();
		System.out.println("Hey your ice-cream with");
		PrepareIceCream object = new Command(ice);
		object.execute();
	}
}
/**
 * 
 * @author pavithra
 * class that has the execute command
 *
 */
abstract class PrepareIceCream {
	IceCream icecream;
	abstract void execute();
}

class Command extends PrepareIceCream {

	public Command(IceCream icecream) {
		this.icecream = icecream;
	}

	@Override
	public void execute() {

		icecream.addFlavour("strawberry");
		icecream.addToppings("cherries");

	}

}
/**
 * 
 * @author pavithra
 * class that implements the methods inside execute method
 *
 */
class IceCream {

	public void addToppings(String string) {
		System.out.println("Addded toppings " + string + " is ready");

	}

	public void addFlavour(String string) {

		System.out.println("Flavour:" + string + " and");
	}

}