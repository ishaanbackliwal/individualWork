package oop;

public class RectangleTest {
	
	public static void main(String[] args) {
		//default constructor
		Rectangle joan = new Rectangle();
		System.out.println("Length of rectangle: " + joan.returnLength());
		System.out.println("Width of rectangle: " + joan.returnWidth());
		System.out.println("Perimeter of rectangle: " + joan.perimeter());
		System.out.println("Area of rectangle: " + joan.area());
		joan.changeLength(123.4);
		System.out.println("Changed length: " + joan.returnLength());
		joan.changeWidth(134.5);
		System.out.println("Changed width: " + joan.returnWidth());
		
		//alternate constructor
		joan = new Rectangle(34.5, 23.4);
		System.out.println("Length of rectangle: " + joan.returnLength());
		System.out.println("Width of rectangle: " + joan.returnWidth());
		System.out.println("Perimeter of rectangle: " + joan.perimeter());
		System.out.println("Area of rectangle: " + joan.area());
		joan.changeLength(123.4);
		System.out.println("Changed length: " + joan.returnLength());
		joan.changeWidth(134.5);
		System.out.println("Changed width: " + joan.returnWidth());
	}

}
