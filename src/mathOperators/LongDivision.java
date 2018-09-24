package mathOperators;

import java.util.Scanner;

public class LongDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int dividend = -999;
		int divisor = -999;
		int integer = -999;
		int remainder = -999;
		System.out.println("What is the dividend? Enter and integer.");
		dividend = input.nextInt();
		System.out.println("What is the divisor? Enter and integer.");
		divisor = input.nextInt();
		integer = dividend / divisor;
		remainder = dividend % divisor;
		System.out.println("The answer is " + integer + "r" + remainder + ".");
	}

}
