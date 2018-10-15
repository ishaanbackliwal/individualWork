package oop;

public class RightTriangleTest {

	public static void main(String[] args) {
		RightTriangle obtuse = new RightTriangle(3.0, 5.0);
		System.out.println("Hypotenuse of the right triangle is: " + obtuse.hypotenuse());
		System.out.println("Perimeter of the right triangle is: " + obtuse.perimeter());
		System.out.println("Area of the right triangle is: " + obtuse.area());
	}

}
