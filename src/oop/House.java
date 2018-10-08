package oop;

import java.util.Scanner;

public class House {

	public House(){

	}
	public void paintWall() {
		Scanner input = new Scanner(System.in);
		double height = -999.0;
		double width = -999.0;
		double area = 999.0;
		double time = -999.0;
		System.out.println("What is the height of the wall?");
		height = input.nextDouble();
		System.out.println("What is the length of the wall?");
		width = input.nextDouble();
		area = height * width;
		time = area / 200 * 60;
		System.out.println("It will take " + time + " minutes to paint the wall.");
	}
	public void plantGarden(double rows) {
		Scanner input = new Scanner(System.in);
		double length = -999.0;
		double row = 10 / rows;
		System.out.println("What is the legnth of the garden?");
		length = input.nextDouble();
		double time = row * length / 15.0 * 2.0;
		System.out.println("It will take " + time + " hours to plant the garden.");
	}
	public void fillPool(double radius, double height) {
		Scanner input = new Scanner(System.in);
		double volume = radius * radius * Math.PI * height;
		double time = volume / 300.0;
		System.out.println("It will take " + time + " hours to fill the pool.");
	}
	public void fillSandbox() {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the sandbox?");
		double length = input.nextDouble();
		System.out.println("What is the width of the sandbox?");
		double width = input.nextDouble();
		System.out.println("What is the depth of the sandbox?");
		double depth = input.nextDouble();
		System.out.println("How much sand can you transport per hour in cubic feet?");
		double sand = input.nextDouble();
		double time = length * width * depth / sand;
		System.out.println("It will take " + time + " hours to fill the sandbox.");
	}
	public void fillSandbox2(double length, double width, double depth, double sand) {
		double time = length * width * depth / sand;
		System.out.println("It will take " + time + " hours to fill the sandbox.");
	}
	public double fillSandbox3(double length3, double width3, double depth3, double sand3) {
		double time = length3 * width3 * depth3 / sand3;
		return time;
	}
	
}
