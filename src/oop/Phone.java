package oop;

public class Phone {
	
	private int number;
	private int speedDial;
	private int lastCall;
	private int popo;
	private int numberCalls;
	private double minutes;
	
	public Phone() {
		number = -999;
		speedDial = -999;
		lastCall = -999;
		popo = -999;
		numberCalls = -999;
		minutes = -999.0;
	}
	public Phone(int newNum, int newSpeedDial, int newLastCall, int newPopo, int newNumberCalls, double newMinutes) {
		number = newNum;
		speedDial = newSpeedDial;
		lastCall = newLastCall;
		popo = newPopo;
		numberCalls = newNumberCalls;
		minutes = newMinutes;
	}
	public void makeCall(int number2, double minutes2) {
		lastCall = number2;
		minutes = minutes + minutes2;
	}

}
