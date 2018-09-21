package mathOperators;

import java.util.Scanner;

public class WallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int width = -999;
		int area = -999;
		System.out.println("How wide is the 8ft tall wall in feet? Enter to the closest integer.");
		width = input.nextInt();
		area = width * 8;
		System.out.println("The wall has an area of " + area + " square feet.");
	}

}
