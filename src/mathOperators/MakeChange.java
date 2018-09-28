package mathOperators;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double amount = -999.0;
		int dollars = -999;
		double change = -999;
		double quarters = -999;
		double dimes = -999;
		double nickles = -999;
		double pennies = -999;
		System.out.println("What is the amount you would like to make change for? Enter a dollar amount.");
		amount = input.nextDouble();
		dollars = (int)amount;
		change = amount - (double)dollars;
		quarters = change / 0.25;
		dimes = (change - ((int)quarters * 0.25)) / 0.1;
		nickles = (change - ((int)quarters * 0.25) - ((int)dimes * 0.1)) / 0.05;
		pennies = (change - ((int)quarters * 0.25) - ((int)dimes * 0.1) - ((int)nickles * 0.05)) / 0.01;
		System.out.println("\nDollars: " + dollars);
		System.out.println("Quarters: " + (int)quarters);
		System.out.println("Dimes: " + (int)dimes);
		System.out.println("Nickles: " + (int)nickles);
		System.out.println("Pennies: " + (int)pennies);
		input.close();
	}

}
