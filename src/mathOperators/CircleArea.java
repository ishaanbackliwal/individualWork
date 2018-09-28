package mathOperators;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double radius = -999.0;
		double area = -999.0;
		System.out.println("What is the radius of your circle in centimeters?");
		radius = input.nextDouble();
		area = radius * radius * 3.14;
		System.out.println("Your circle is " + area + " square centimeters");
	}

}
