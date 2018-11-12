package oop;

public class NumberTest {

	public static void main(String[] args) {
		Numbers digit = new Numbers();
		digit.sayNumber(7.5);
		digit.sayNumberPlus2(7.5);
		digit.saySum(7.5, 2.5);
		double result = digit.returnSquare(7.5);
		System.out.println("The square of the value is " + result);
		double area = digit.returnArea(7.5, 2.5);
		System.out.println("The area of the rectangle is " + area);
		double roundUp = digit.returnRoundUp(7.5);
		System.out.println("The next largest integer to your value is " + roundUp);
	}

}
