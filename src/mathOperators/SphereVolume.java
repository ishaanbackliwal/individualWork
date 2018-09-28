package mathOperators;

import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius = -999.0;
		double volume = -999.0;
		double fourThirds = -999.0;
		System.out.println("What is the radius of your sphere in centimeters?");
		radius = input.nextDouble();
		fourThirds = 4.0 / 3.0;
		volume = fourThirds * radius * radius * radius * Math.PI;
		System.out.println("The volume of your sphere is " + volume + " cubic centimeters.");

	}

}
