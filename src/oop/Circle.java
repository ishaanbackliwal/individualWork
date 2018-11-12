package oop;

public class Circle {
	
	private double radius;

	public Circle() {
		radius = -99.0;
	}
	public Circle (double newRadius) {
		radius = newRadius;
	}
	public double getRadius() {
		return radius;
	}
	public double circumference() {
		return Math.PI * 2 * radius;
	}
	public double area() {
		return Math.PI * radius * radius;
	}
	public void changeRadius(double newRadius) {
		radius = newRadius;
	}
}
