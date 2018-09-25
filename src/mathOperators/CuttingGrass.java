package mathOperators;

import java.util.Scanner;

public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double width = -999;
		double length = -999;
		double radius = -999;
		double areaFountain = -999.0;
		double area = -999.0;
		double cost = -999.0;
		System.out.println("What is the width of the lawn in yards?");
		width = input.nextInt();
		System.out.println("What is the length of the lawn in yards?");
		length = input.nextInt();
		System.out.println("What is the radius of the fountain in feet?");
		radius = input.nextInt();
		areaFountain = (Math.pow(radius * 3, 2) * Math.PI);
		area = (width * length) - areaFountain;
		cost = area / 100.0 * 1.25;
		System.out.println("\nThe cost to cut the lawn is $" + cost);
	}

}
