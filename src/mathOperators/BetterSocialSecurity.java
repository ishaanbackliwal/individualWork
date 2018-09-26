package mathOperators;

import java.util.Scanner;

public class BetterSocialSecurity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int ssn = -999;
		int age = -999;
		int four = -999;
		int legal = -999;
		System.out.println("What is your age? Enter an integer.");
		age = input.nextInt();
		System.out.println("What is your social security number? After inputting each number, press enter.");
		ssn = input.nextInt();
		legal = 18 - age;
		four = ssn % 10000;
		System.out.println("\nYou are " + age + " years old");
		System.out.println("You will be 18 in " + legal + " year(s)");
		System.out.println("Your social security number is " + ssn);
		System.out.println("The last four digits of your social security number are " + four);
		
	}

}
