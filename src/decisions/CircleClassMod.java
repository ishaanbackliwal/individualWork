package decisions;

public class CircleClassMod {
	
	private double radius;
	
	public CircleClassMod() {
		radius = 10.0;
	}
	public CircleClassMod(double newRadius) {
		if (newRadius <= 0) {
			radius = 10.0;
		}
		radius = newRadius;
	}
	public double getRadius() {
		return radius;
	}
	public double perimeter() {
		double circ = 2.0 * radius * Math.PI;
		return circ;
	}
	public double area() {
		double ar = radius * radius * Math.PI;
		return ar;
	}

}
