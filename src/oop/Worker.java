package oop;

public class Worker {

	private int hours;
	private double pay;
	
	public Worker() {
		hours = -999;
		pay = -999.0;
	}
	public Worker(int newHours, double newPay) {
		hours = newHours;
		pay = newPay;
	}
	public int getHours() {
		return hours;
	}
	public double getPay() {
		return pay;
	}
	public void setHours(int newHours) {
		hours = newHours;
	}
	public void setPay(double newPay) {
		pay = newPay;
	}
	public double payCheck() {
		return (double)hours * pay;
	}
	public void setRaise(double raise) {
		pay = pay + raise;
	}
}
