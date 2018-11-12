package decisions;

import java.util.Scanner;

public class CutGrass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the front yard in feet?");
		double length = input.nextDouble();
		System.out.println("What is the width of the front yard in feet?");
		double width = input.nextDouble();
		System.out.println("Are you going to cut the back yard? If yes, answer 1, if no, answer 2.");
		double back = input.nextDouble();
		double money = length * width / 100;
		if (back == 1) {
			System.out.println("What is the radius of the back yard in feet?");
			double radius = input.nextDouble();
			money += (radius * radius * Math.PI) / 75 * 1.75;
		}
		System.out.println("You will be payed $" + money);
	}

}
