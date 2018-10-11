package oop;

import java.util.Scanner;

public class ShapeTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//rectangle
		System.out.println("What is the length of the rectangle?");
		double newLength = input.nextDouble();
		System.out.println("What is the width of the rectangle?");
		double newWidth = input.nextDouble();
		Rectangle boxyJoe = new Rectangle(newLength, newWidth);
		System.out.println("The perimeter of the rectangle is " + boxyJoe.perimeter());
		System.out.println("The area of the rectangle is " + boxyJoe.area());
		
		//circle
		System.out.println("The radius of the circle?");
		double newRadius = input.nextDouble();
		Circle roundedBilly = new Circle(newRadius);
		System.out.println("The circumference of the circle is " + roundedBilly.circumference());
		System.out.println("The area of the circle is " + roundedBilly.area());
		
		//right triangle
		System.out.println("What is the base of the right triangle?");
		double newBase = input.nextDouble();
		System.out.println("What is the height of the right triangle");
		double newHeight = input.nextDouble();
		RightTriangle pointyJeb = new RightTriangle(newBase, newHeight);
		System.out.println("The perimeter of the triangle is " + pointyJeb.perimeter());
		System.out.println("The area of the triangle is " + pointyJeb.area());
		
		//isosceles trapezoid
		System.out.println("What is the length of the first base?");
		double newBase1 = input.nextDouble();
		System.out.println("What is the length of the second base?");
		double newBase2 = input.nextDouble();
		System.out.println("What is the height of the trapezoid?");
		double newHeightTrap = input.nextDouble();
		System.out.println("What is the lenght of the legs of the trapezoid?");
		double newLeg = input.nextDouble();
		IsoscelesTrapezoid dumb = new IsoscelesTrapezoid(newBase1, newBase2, newHeightTrap, newLeg);
		System.out.println("The perimeter of the isosceles trapezoid is " + dumb.getP());
		System.out.println("The area of the isoszeles trapezoid is " + dumb.getA());
		
		input.close();
	}

}
