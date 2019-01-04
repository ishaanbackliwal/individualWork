package interfaces;

public class Rectangle implements Shape {

	private double length;
	private double width;

	public Rectangle() {
		length = 10;
		width = 10;
	}

	public Rectangle(double xLength, double xWidth) {
		length = xLength;
		width = xWidth;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public void setLength(double xLength) {
		length = xLength;
	}

	public void setWidth(double xWidth) {
		width = xWidth;
	}

	public double perimeter() {
		return length * 2 + width * 2;
	}

	public double area() {
		return length * width;
	}
}
