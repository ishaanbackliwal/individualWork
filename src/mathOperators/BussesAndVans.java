package mathOperators;

import java.util.Scanner;

public class BussesAndVans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int people = -999;
		int busses = -999;
		int leftOver = -999;
		System.out.println("Bus/Van Service \nHow many people are there in the group?");
		people = input.nextInt();
		busses = people / 35;
		leftOver = people % 35;
		System.out.println("\nNumber of people in the group: " + people);
		System.out.println("Number of busses needed to be chartered: " + busses);
		System.out.println("Number of people left over: " + leftOver);
	}

}
