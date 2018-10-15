package oop;

public class ComplexCar {

	private double mpg;
	private double tankCap;
	private double fuel;
	private double odometer;
	
	public ComplexCar() {
		mpg = 20.0;
		tankCap = 20.0;
		fuel = 20.0;
		odometer = 0.0;
	}
	public ComplexCar(double newMPG, double newTankCap, double newFuel, double newOdometer) {
		mpg = newMPG;
		tankCap = newTankCap;
		fuel = newFuel;
		odometer = newOdometer;
	}
	public double fillTank(double gas) {
		fuel = fuel + gas;
		return fuel;
	}
	public double drive(double miles) {
		odometer = odometer + miles;
		return odometer;
	}
}
