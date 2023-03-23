package Patterns;

import java.util.HashMap;
/**
 * 
 * @author pavithra
 * class that implements FlyweightPattern to use same object each time a connection is made
 *
 */
public class FlyweightPattern {
	public static void main(String[] args) {
		for(int noOfIce = 0; noOfIce <= 20; noOfIce++) {
			Ice ice= new IceFactory().getRandomPeople(noOfIce%2 == 0? "ButterScotch" : "BlackCurrent");
			ice.setPreferredToppings(noOfIce%2 == 0? "Candy" : "Nuts");
			ice.details();
			System.out.println("");
		}
	}
}
abstract class Ice {
	abstract public void setPreferredToppings(String toppings);
	abstract public void details();
}

class ButterScotch extends Ice {
	final String shape;
	String preferedToppings = "defaultToppings";

	ButterScotch() {
		shape = "cone";
	}

	@Override
	public void setPreferredToppings(String toppings) {
		preferedToppings= toppings;
		
	}

	@Override
	public void details() {
		System.out.println("I want "   + shape + " shaped icecream with " +preferedToppings);
	}
	
}

class BlackCurrent extends Ice {
	final String shape;
	String preferedToppings = "defaultToppings";
	
	BlackCurrent() {
		shape = "oval";
	}

	@Override
	public void setPreferredToppings(String toppings) {
		preferedToppings= toppings;
	}

	@Override
	public void details() {
		System.out.println("I want "   + shape + " shaped icecream with " + preferedToppings);
	}
}

class IceFactory {
	
	HashMap<String, Ice> IceCream = new HashMap<>();
	
	public Ice getRandomPeople(String type) {
		
		Ice ice = null;
		
		if(IceCream.containsKey(type)) {
			ice = IceCream.get(type);
			return ice;
		}
		switch(type) {
		case "ButterScotch":
			ice = new ButterScotch();
			break;
		case "BlackCurrent":
			ice = new BlackCurrent();
			break;
		default: System.out.println("Type not available");
		}
		
		IceCream.put(type,ice);
		
		return ice;
	}
}