package mathOperators;

import java.util.Scanner;

public class BoxVolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int width = -999;
		int height = -999;
		int length = -999;
		int volume = -999;
		System.out.println("Box Volume Calculator... \n\nHow wide is the box in inches? Enter an integer.");
		width = input.nextInt();
		System.out.println("How tall is your box in inches? Enter and integer.");
		height = input.nextInt();
		System.out.println("How long is your box in inches? Enter an integer.");
		length = input.nextInt();
		volume = width * height * length;
		System.out.println("The volume of your box is " + volume + " cubic inches.");
	}

}
