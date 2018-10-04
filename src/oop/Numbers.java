package oop;

public class Numbers {

	public Numbers() {

	}
	public void sayNumber(double num) {
		System.out.println("Your number is: " + num);
	}
	public void sayNumberPlus2(double num) {
		num = num + 2.0;
		System.out.println("Your number plus two is: " + num);
	}
	public void saySum(double first, double second) {
		double sum = -999.0;
		sum = first + second;
		System.out.println("You sent the method " + first + " and " + second + "\nThe sum of the numbers is: " + sum);
	}
}
	
