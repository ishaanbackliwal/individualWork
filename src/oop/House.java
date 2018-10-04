package oop;

import java.util.Scanner;

public class House {

	public House(){

	}
	public void wallPaint(){
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
	
}
