package inheritance;

public class Rectangle extends Quad {
	
	Quad shape = new Quad();
	
	public Rectangle() {
	
	}
	
	public Rectangle(double xS1, double xS2) {
		shape.setS1(xS1);
		shape.setS2(xS2);
		shape.setS3(xS1);
		shape.setS4(xS2);
	}
	
	public double area() {
		return shape.getS1() * shape.getS2();
	}
}
