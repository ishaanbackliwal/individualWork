package inheritance;

public class Rectangle extends Parallelogram implements Geo {
		
	public Rectangle() {
		super();
	}
	
	public Rectangle(double length, double width) {
		super(length, width, width);						//second width value is representative of height
	}
	
	public double area() {
		return super.getS1() * super.getS2();
	}
}
