package oop;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle() {
		length = -999.0;
		width = -999.0;
	}
	public Rectangle(double newLength, double newWidth) {
		length = newLength;
		width = newWidth;
	}
	public double returnLength() {
		return length;
	}
	public double returnWidth() {
		return width;
	}
	public double perimeter() {
		return (length + width) * 2;
	}
	public double area() {
		return length * width;
	}
	public void changeLength(double newLength) {
		length = newLength;
	}
	public void changeWidth(double newWidth) {
		width = newWidth;
	}
}
