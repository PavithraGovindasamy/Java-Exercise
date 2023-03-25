package patterns;

import java.util.Scanner;
/**
 * 
 * @author pavithra
 * class that implements StratergyPattern
 * 
 *
 */
public class StratergyPattern {
	public static void main(String[] args) throws  Exception {
		PaintBrush brush=new PaintBrush();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter name of color");
			String paintcolor=sc.next();
			brush.paint=(Paint) Class.forName(paintcolor).newInstance();
		}
		brush.getPaint().color();
		
	}
}
/**
 * 
 * @author pavithra
 * class that returns the object of paint class
 *
 */
class PaintBrush{
	Paint paint;
	public Paint getPaint() {
		return paint;
	}
}
/**
 * 
 * @author pavithra
 * class that has a method of paint to be implemented
 *
 */
abstract class Paint{
	abstract void color();
}
class RedPaint extends Paint{
	public void color() {
		System.out.println("red colour...");
	}
}
class BluePaintt extends Paint{
	public void color() {
		System.out.println("blue colour...");
	}
}