package oop;

public class Numbers {

	public Numbers() {

	}
	public void sayNumber(double num) {
		System.out.println("Your number is " + num);
	}
	public void sayNumberPlus2(double num) {
		num = num + 2.0;
		System.out.println("Your number plus two is " + num);
	}
	public void saySum(double first, double second) {
		double sum = -999.0;
		sum = first + second;
		System.out.println("You sent the method " + first + " and " + second + "\nThe sum of the numbers is: " + sum);
	}
	public double returnSquare(double value){
		double square = Math.pow(value, 2);
		return square;
	}
	public double returnArea(double length, double width){
		double area = length * width;
		return area;
	}
	public int returnRoundUp(double value){
		int temp = (int)Math.ceil(value);
		return temp;
	}
}
