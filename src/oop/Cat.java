package oop;

public class Cat {
	
	private double age;
	private double sleep;
	
	public Cat() {
		age = -999.0;
		sleep = -999.0;
	}
	public Cat (double newAge, double newSleep) {
		age = newAge;
		sleep = newSleep;
	}
	public double birthday(double newAge) {
		age = newAge + 1;
		return age;
	}
	public double sleepMore(double add) {
		sleep = sleep + add;
		return sleep;
	}
	public double sleepLess(double sub) {
		sleep = sleep - sub;
		return sleep;
	}
}
