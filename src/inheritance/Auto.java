package inheritance;

public class Auto {

	private int odometer;
	private int mpg;
	
	public Auto() {
		odometer = 0;
		mpg = 30;
	}
	public Auto(int xOdo, int xMPG) {
		odometer = xOdo;
		mpg = xMPG;
	}
	public int getOdo() {
		return odometer;
	}
	public int getMPG() {
		return mpg;
	}
	public void drive(int miles) {
		if (miles > 0) {
			odometer += miles;
		}
	}
	public String toString() {
		return ("Auto object...\nOdometer: " + odometer + " miles\nMPG: " + mpg);
	}
}
