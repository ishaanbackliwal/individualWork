package mathOperators;

import java.util.Scanner;

public class TripCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int distance = -999;
		int mpg = -999;
		int gasMoney = -999;
		int gallons = -999;
		int perGallon = -999;
		System.out.println("What is the distance of your trip in miles?");
		distance = input.nextInt();
		System.out.println("What is the feul efficiency of your car (MPG)?");
		mpg = input.nextInt();
		System.out.println("How much did you pay for gas on the trip (to the nearest whole number)?");
		gasMoney = input.nextInt();
		System.out.println("\nDistance traveled: around " + distance + " miles");
		gallons = distance / mpg;
		perGallon = gasMoney / gallons;
		System.out.println("Petrol used: around " + gallons + " gallons");
		System.out.println("Money sent on gas: around $" + gasMoney + ".00");
		System.out.println("Average cost per gallon: around $" + perGallon + ".00");
	}

}
