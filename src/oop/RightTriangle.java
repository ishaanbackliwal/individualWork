package oop;

public class RightTriangle {

	private double base;
	private double height;
	
	public RightTriangle() {
		base = -999.0;
		height = -999.0;
	}
	public RightTriangle(double newBase, double newHeight) {
		base = newBase;
		height = newHeight;
	}
	public double hypotenuse() {
		return Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
	}
	public double perimeter() {
		return base + height + Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
	}
	public double area() {
		return base * height;
	}

}
