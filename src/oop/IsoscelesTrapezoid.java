package oop;

public class IsoscelesTrapezoid {

	private double base1;
	private double base2;
	private double height;
	private double leg;
	
	public IsoscelesTrapezoid() {
		base1 = -999.0;
		base2 = -999.0;
		height = -999.0;
		leg = -999.0;
	}
	public IsoscelesTrapezoid(double newBase1, double newBase2, double newHeight, double newLeg) {
		base1 = newBase1;
		base2 = newBase2;
		height = newHeight;
		leg = newLeg;
	}
	public double getP() {
		return base1 + base2 + leg + leg;
	}
	public double getA() {
		return (base1 + base2) * height / 2;
	}

}
