package packing;

import java.util.Scanner;

/**
 * 
 * @author pavithra CalculateShapes that display shapes
 *
 */
public class CalculateShapes {
	/**
	 * The Main method
	 * 
	 * @param args unuse
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		int radius = sc.nextInt();
		System.out.println("CIRCLE");
		Circle circle = new Circle(radius);
		System.out.println("Area:" + circle.calArea());
		System.out.println("Perimeter:" + circle.calPerimeter());

		System.out.println();
		Square sq = new Square(4);
		System.out.println("SQUARE");
		System.out.println("Area:" + sq.calArea());
		System.out.println("Perimeter:" + sq.calPerimeter());
		System.out.println();

		Triangle triangle = new Triangle();
		System.out.println("TRIANGLE");
		System.out.println("Area:" + triangle.calArea());
		System.out.println("Perimeter:" + triangle.calPerimeter());
		System.out.println();

		Sphere sphere = new Sphere(radius);
		System.out.println("SPHERE:");
		System.out.println("Area:" + sphere.calArea());
		System.out.println("Perimeter:" + sphere.calPerimeter());
		System.out.println("Surface-area:" + sphere.calSurfaceArea());
		System.out.println("Volume" + sphere.calVolume());
		System.out.println();

		Cuboid cuboid = new Cuboid(2);
		System.out.println("CUBOID:");
		System.out.println("Area:" + cuboid.calArea());
		System.out.println("Perimeter:" + cuboid.calPerimeter());
		System.out.println("Surface-area:" + cuboid.calSurfaceArea());
		System.out.println("Volume" + cuboid.calVolume());
        sc.close();
	}
}

/**
 * 
 * @author pavithra interface that calculates area and
 * 
 *
 */
interface Calculation2D {
	double calArea();

	double calPerimeter();

	final double pi = 3.14;
}

interface Calculation3D {
	double calSurfaceArea();

	double calVolume();

}

/**
 * 
 * @author pavithra The Class circle
 *
 */

class Circle implements Calculation2D {

	int radius;

	Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public double calArea() {
		return pi * radius * radius;

	}

	@Override
	public double calPerimeter() {
		return 2 * pi * radius;

	}

}

/**
 * 
 * @author pavithra The Class sphere
 *
 */

class Sphere implements Calculation3D, Calculation2D {

	int radius;

	Sphere(int radius) {
		this.radius = radius;
	}

	@Override
	public double calSurfaceArea() {
		return 4 * pi * radius * radius;

	}

	@Override
	public double calVolume() {
		return (4 / 3) * pi * radius * radius;

	}

	@Override
	public double calArea() {
		return pi * radius * radius;
	}

	@Override
	public double calPerimeter() {
		return 2 * pi * radius;
	}

}

/**
 * 
 * @author pavithra The Class Cuboid
 *
 */

class Cuboid implements Calculation3D, Calculation2D {

	int side;

	Cuboid(int side) {
		this.side = side;
	}

	@Override
	public double calSurfaceArea() {
		return 6 * side * side;

	}

	@Override
	public double calVolume() {
		return side * side * side;

	}

	@Override
	public double calArea() {
		return side * side;
	}

	@Override
	public double calPerimeter() {
		return 4 * side;
	}

}

/**
 * 
 * @author pavithra class triangle that calculates area and volume
 *
 */

class Triangle implements Calculation2D {
	int a = 10;
	int b = 20;
	int c = 30;
	int side = a + b + c / 3;

	@Override
	public double calArea() {
		// TODO Auto-generated method stub
		return side;
	}

	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return a + b + c;
	}

}

/**
 * 
 * @author pavithra class sphere that calculates area and volume
 *
 */
class Square implements Calculation2D {
	int side;

	Square(int side) {
		this.side = side;
	}

	@Override
	public double calArea() {
		return side * side;
	}

	@Override
	public double calPerimeter() {
		// TODO Auto-generated method stub
		return 4 * side;
	}

}
