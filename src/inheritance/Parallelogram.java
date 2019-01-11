package inheritance;

public class Parallelogram extends Quad implements Geo {
	
	private double h;
	
	public Parallelogram() {
		super(10, 12, 10, 12);
	}
	public Parallelogram(double side, double base, double height) {
		super(side, base, side, base);
		h = height;
	}
	public void setH(double newH) {
		h = newH;
	}
	public double getH() {
		return h;
	}
	public double area() {
		return super.getS2() * h;
	}
}
