package oop;

import java.util.Scanner;

public class HouseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		House jeb = new House();
		
		jeb.paintWall();
	
		System.out.println("How many rows would you like in the garden?");
		double rows = input.nextDouble();
		jeb.plantGarden(rows);
		
		System.out.println("What is the radius of the pool?");
		double radius = input.nextDouble();
		System.out.println("What is the height of the pool?");
		double height = input.nextDouble();
		jeb.fillPool(radius,  height);
	
		jeb.fillSandbox();
		
		System.out.println("What is the length of the sandbox?");
		double length = input.nextDouble();
		System.out.println("What is the width of the sandbox?");
		double width = input.nextDouble();
		System.out.println("What is the depth of the sandbox?");
		double depth = input.nextDouble();
		System.out.println("How much sand can you transport per hour in cubic feet?");
		double sand = input.nextDouble();
		jeb.fillSandbox2(length, width, depth, sand);
		
		System.out.println("What is the length of the sandbox?");
		double length3 = input.nextDouble();
		System.out.println("What is the width of the sandbox?");
		double width3 = input.nextDouble();
		System.out.println("What is the depth of the sandbox?");
		double depth3 = input.nextDouble();
		System.out.println("How much sand can you transport per hour in cubic feet?");
		double sand3 = input.nextDouble();
		double time = jeb.fillSandbox3(length3, width3, depth3, sand3);
		System.out.println("It will take " + time + " hours to fill the sandbox.");
	}

}
