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
	}

}
