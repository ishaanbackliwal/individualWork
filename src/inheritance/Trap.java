package inheritance;

public class Trap extends Quad implements Geo {
	
	public Trap() {
		
	}
	
	public Trap(double top, double bottom, double right, double left) {
		super(top, bottom, right, left);
	}
	
	public double area() {
		double top = super.getS1();
		double bottom = super.getS1();
		double right = super.getS1();
		double left = super.getS1();
		double height = Math.sqrt(((bottom - top)*(bottom - top)) - (left * left));
		double area = ((top + bottom) / 2) * height;
		return area;
	}
}
