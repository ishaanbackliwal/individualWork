package inheritance;

public class Truck extends Auto{
	
	private boolean fourWD;
	
	public Truck(boolean xFourWD) {
		fourWD = xFourWD;
	}
	public boolean getFourWD() {
		return fourWD;
	}
	public String toString() {
		return ("True or False? The truck has 4WD: " + fourWD);
	}
	public boolean equals(Truck bigboy) {
		return toString().equals(bigboy.toString());
	}
}
