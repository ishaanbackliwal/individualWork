package designingClasses;

public class PhoneClass {

	private String myNum;
	private static int maxMins;
	private int minsUsed;
	
	public PhoneClass(String phoneNum, int xMinsUsed) {
		maxMins = 10000;
		myNum = phoneNum;
		minsUsed = xMinsUsed;
	}
	public void makeCall(int mins) {
		minsUsed += mins;
	}
	public int timeRemaining() {
		int left = maxMins - minsUsed;
		return left;
	}
	public void reset() {
		minsUsed = 0;
	}
	public String toString() {
		return ("Phone Class \nMax Minutes: " + maxMins + "\nMy Number: " + myNum + "\nMinutes Used: " + minsUsed);
	}
	public boolean equals(PhoneClass jed) {
		return(toString().equals(jed.toString()));
	}
	public PhoneClass clone() {
		return new PhoneClass(myNum, minsUsed);
	}
}
