package mathOperators;

import java.util.Scanner;

public class ComplexGrassCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		final double RATE = 12.0;
		double width = -999.0;
		double length = -999.0;
		double mowerWidth = -999.0;
		double mowerSpeed = -999.0;
		double distance = -999.0;
		double hours = -999.0;
		double minutes = -999.0;
		double seconds = -999.0;
		double cost = -999.0;
		System.out.println("What is the width of the lawn in feet?");
		width = input.nextDouble();
		System.out.println("What is the length of the lawn in feet?");
		length = input.nextDouble();
		System.out.println("What is the width of the lawn mower deck in inches?");
		mowerWidth = input.nextDouble();
		System.out.println("What is the speed of the lawn mower in miles per hour?");
		mowerSpeed = input.nextDouble();
		distance = width * length / (mowerWidth / 12);
		hours = 1 / ((mowerSpeed * 5280.0) / distance);
		minutes = hours * 60;
		seconds = (minutes * 60) - 60 * (int)minutes;
		System.out.println("\nIt will take " + (int)hours + " hours, " + (int)minutes + " minutes, and " + seconds + " seconds to mow the lawn.");
		cost = hours * RATE;
		System.out.println("It will cost $" + cost + " to mow the lawn.");
	}

}
