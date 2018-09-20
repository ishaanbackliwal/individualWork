package inputExamples;

import java.util.Scanner;

public class LockerCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int one = -999;
		int two = -999;
		int three = -999;
		System.out.println("What is the first number in your locker combo?");
		one = input.nextInt();
		System.out.println("What is the second number in your locker combo?");
		two = input.nextInt();
		System.out.println("What is the third number in your locker combo?");
		three = input.nextInt();
		System.out.println("\nYou said your combonation is...");
		System.out.println(one + " - " + two + " - " + three);
		System.out.println("K bye.");
	}

}
