package oop;

import java.util.Scanner;

public class Room {
	public Room() {

	}

	public void area() {
		Scanner input = new Scanner(System.in);
		double length = -999.0;
		double height = -999.0;
		double area = -999.0;
		System.out.println("What is the length of the wall in feet?");
		length = input.nextDouble();
		System.out.println("What is the height of the wallin feet?");
		height = input.nextDouble();
		area = length * height;
		System.out.println("The area of the wall is " + area + " square feet.");
	}

	public void areaWithDoor() {
		Scanner input = new Scanner(System.in);
		double length2 = -999.0;
		double height2 = -999.0;
		double doorHeight = -999.0;
		double doorLength = -999.0;
		double doorArea = -999.0;
		double area2 = -999.0;
		System.out.println("What is the length of the wall in feet?");
		length2 = input.nextDouble();
		System.out.println("What is the height of the wall in feet?");
		height2 = input.nextDouble();
		System.out.println("What is the length of the door in feet?");
		doorLength = input.nextDouble();
		System.out.println("What is the height of the door in feet?");
		doorHeight = input.nextDouble();
		doorArea = doorLength * doorHeight;
		area2 = (length2 * height2) - doorArea;
		System.out.println("The area of the wall is " + area2 + " square feet.");
	}
}
