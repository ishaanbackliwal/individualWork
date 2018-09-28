package mathOperators;

import java.util.Scanner;

public class PracticeAssessment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double number = -999.0;
		double minTotal = -999.0;
		double secTotal = -999.0;
		int avgMin = -999;
		double avgSec = -999.0;
		double total = -999.0;
		double avgTotal = -999.0;
		System.out.println("How many songs are on the device?");
		number = input.nextDouble();
		System.out.println("What is the total length of the songs? \nMinutes: ");
		minTotal = input.nextDouble();
		System.out.println("Seconds: ");
		secTotal = input.nextDouble();
		total = minTotal + (secTotal / 60.0);
		avgTotal = total / number;
		avgMin = (int)avgTotal;
		avgSec = (avgTotal - avgMin) * 60.0;
		System.out.println("\nThe avergae length of each song on the device is...");
		System.out.println(avgMin + " minutes and " + (int)avgSec + " seconds.");
	}

}
