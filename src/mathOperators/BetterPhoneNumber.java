package mathOperators;

import java.util.Scanner;

public class BetterPhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = -999;
		int area = -999;
		int first = -999;
		int middle = -999;
		int last = -999;
		System.out.println("What is your area code?");
		area = input.nextInt();
		System.out.println("What is the rest of your phone number?");
		number = input.nextInt();
		middle = number / 10000;
		last = number % 10000;
		System.out.println("\nPhone number:  (" + area +  ") " + middle + " - " + last);
		System.out.println("Area code: " + area);
		System.out.println("Middle three digits: " + middle);
		System.out.println("Last four digits: " + last);
		input.close();
	}

}
