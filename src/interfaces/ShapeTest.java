package interfaces;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/* ACTIVITY #1	////////////////////////////////////////////////////////////////////////////////////////////////////
		// rectangle
		System.out.println("Eneter the length of a rectangle:");
		double length = input.nextDouble();
		System.out.println("Eneter the width of a rectangle:");
		double width = input.nextDouble();
		Shape geo = new Rectangle(length, width);
		System.out.println("\nPerimeter: " + geo.perimeter());
		System.out.println("Area: " + geo.area());
		
		// circle
		System.out.println("\nEneter the radius of a cricle:");
		double radius = input.nextDouble();
		Shape round = new Circle(radius);
		System.out.println("\nPerimeter: " + round.perimeter());
		System.out.println("Area: " + round.area());
		*/
		
		
		// ACTIVITY #2	////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Eneter the length of a rectangle:");
		double length = input.nextDouble();
		System.out.println("Eneter the width of a rectangle:");
		double width = input.nextDouble();
		Rectangle geo = new Rectangle(length, width);
		Shape box = geo;
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
