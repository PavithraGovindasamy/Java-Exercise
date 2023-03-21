package patterns;

import java.util.Scanner;
/**
 * 
 * @author pavithra
 * class that implements factory method
 *
 */
public class FactoryMethod {
	public static void main(String[] args) throws Exception {
		PrivateFactory obj = new PrivateFactory();
		QuotesForLife quotes=obj.method();
		quotes.makingQuotes();
		
	}
}
/**
 * 
 * @author pavithra
 * class that request users for the method to be implemented
 *
 */
class PrivateFactory {
	public QuotesForLife method() throws  Exception  {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the type of quotes you want:");
		String classname=sc.next();
		QuotesForLife quotes = (QuotesForLife) Class.forName(classname).newInstance();
		return quotes;

	}
}
/**
 * 
 * @author pavithra
 * class that implement method to take input from user
 *
 */
interface QuotesForLife {
	public void makingQuotes();
}

class LifeQuotes implements QuotesForLife {

	@Override
	public void makingQuotes() {
		System.out.println("Read for your future not for your teacher");

	}

}

class ModernQuotes implements QuotesForLife {

	@Override
	public void makingQuotes() {
		System.out.println("Superstion is out of Portion in this modern world!");

	}

}
