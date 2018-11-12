package decisions;

import java.util.Scanner;

public class SpaceWeight {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How much do you weigh in pounds?");
		double user = input.nextDouble();
		System.out.println("What planet do you want to know your weight on? Select a number.");
		System.out.println("1: Mercury \n2: Venus \n3: Mars \n4: Jupiter \n5: Saturn");
		int selection = input.nextInt();
		double weight = -999.0;
		switch (selection) {
		case 1:
			weight = user * 0.37;
			break;
		case 2:
			weight = user * 0.88;
			break;
		case 3:
			weight = user * 0.38;
			break;
		case 4:
			weight = user * 2.64;
			break;
		case 5:
			weight = user * 1.15;
			break;
		default:
			System.out.println("You didn't enter any of the values corresponding to the planets");
		}
		System.out.println("Your weight on the planet you selected would be " + weight + " lbs.");
	}

}
