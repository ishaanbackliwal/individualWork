package oop;

public class IsoscelesTrapezoidTest {

	public static void main(String[] args) {
		IsoscelesTrapezoid trap = new IsoscelesTrapezoid(2.4, 3.4, 32.6, 23.5);
		System.out.println("Perimeter of the isosceles trapezoid is " + trap.getP());
		System.out.println("Area of the isosceles trapezoid is " + trap.getA());
	}

}
