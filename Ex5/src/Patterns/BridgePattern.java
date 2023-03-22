package Patterns;
/**
 * 
 * @author pavithra
 * class that implements BridgePattern that creates objects of value need in main class
 *
 */
public class BridgePattern {
	public static void main(String[] args) {
     IceCream ice=new Strawberry(new Candy(), new Nuts());
     IceCream ice1=new Chocolate(new Candy(),new Nuts());
     ice.addFlavour();
     ice1.addFlavour();
	}
}

abstract class IceCream {
	public abstract void addFlavour();
	Candy candy;
	Nuts nuts;
	public IceCream(Candy candy,Nuts nuts) {
		this.candy=candy;
		this.nuts=nuts;
	}
}
class Strawberry extends IceCream{

	public Strawberry(Candy candy,Nuts nuts) {
		super(candy, nuts);
	}

	@Override
	public void addFlavour() {
		System.out.print("Added Strawberry flavour");
		candy.addToppings();
		nuts.addToppings();
		
	}
	
}
class Chocolate extends IceCream{

	public Chocolate(Candy candy, Nuts nuts) {
		super(candy,nuts);
	}

	@Override
	public void addFlavour() {
		System.out.print("Added Choclate flavour");
		candy.addToppings();
		nuts.addToppings();
		
		
	}
	
}
interface Toppings{
	public void addToppings();
}

class Candy implements Toppings{

	@Override
	public void addToppings() {
		System.out.print(" and added candy");
		
	}
	
}
class Nuts implements Toppings{

	@Override
	public void addToppings() {
		System.out.println(" and nuts");
		
	}
	
}
