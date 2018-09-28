package mathOperators;

import java.util.Scanner;

public class SumOfAges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int friendOne = -999;
		int friendTwo = -999;
		int friendThree = -999;
		int sum = -999;
		System.out.println("How tall is your one of your friends in feet? Enter an integer.");
		friendOne = input.nextInt();
		System.out.println("How tall is your another one of your friends in feet? Enter an integer.");
		friendTwo = input.nextInt();
		System.out.println("How tall is your another one of your friends in feet? Enter an integer.");
		friendThree = input.nextInt();
		sum = friendOne + friendTwo + friendThree;
		System.out.println("the sum of all your friends is " + sum);
		
	}

}
