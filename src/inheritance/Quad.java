package inheritance;

public class Quad {

	private double s1;
	private double s2;
	private double s3;
	private double s4;

	public Quad() {
		s1 = 4.0;
		s2 = 4.0;
		s3 = 4.0;
		s4 = 4.0;
	}

	public Quad(double xs1, double xs2, double xs3, double xs4) {
		s1 = xs1;
		s2 = xs2;
		s3 = xs3;
		s4 = xs4;
	}

	public void setS1(double newS1) {
		s1 = newS1;
	}

	public void setS2(double newS2) {
		s2 = newS2;
	}

	public void setS3(double newS3) {
		s2 = newS3;
	}

	public void setS4(double newS4) {
		s2 = newS4;
	}

	public double getS1() {
		return s1;
	}

	public double getS2() {
		return s2;
	}

	public double getS3() {
		return s3;
	}

	public double getS4() {
		return s4;
	}

	public double perimeter() {
		return s1 + s2 + s3 + s4;
	}
	
	public String toString() {
		return ("\nQuad object...\nSide 1: " + s1 + "\nSide 2: " + s2 + "\nSide 3: " + s3 + "\nside 4: " + s4);
	}

}
