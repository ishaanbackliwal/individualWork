package oop;

public class Employee {
	
	private double wage;
	private double experience;
	
	public Employee() {
		wage = -999.0;
		experience = -999.0;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double userWage) {
		wage = userWage;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double userExperience) {
		experience = userExperience;
	}
	public void raiseWage() {
		wage = wage * 1.1;
	}
}
