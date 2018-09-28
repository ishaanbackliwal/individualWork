package mathOperators;

import java.util.Scanner;

public class PostIts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int height = -999;
		int width = -999;
		int area = -999;
		int result = -999;
		int decimal = -999;
		System.out.println("What is the height of the rectangular surface? Enter to the closest integer.");
		height = input.nextInt();
		System.out.println("What is the width of the rectangular surface? Enter to the closest integer.");
		width = input.nextInt();
		area = width * height;
		result = area / 9;
		decimal = area % 9;
		System.out.println("It would take around " + result + "." + decimal + " post-its to cover your surface.");		
	}

}
