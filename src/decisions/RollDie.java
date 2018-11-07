package decisions;

import java.util.Scanner;
import java.util.Random;

public class RollDie {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int counter = 0;
		int min = 1;
		System.out.println("How many sides are there on the die?");
		int max = input.nextInt();
		System.out.println("How many times do you want to roll the die?");
		int rolls = input.nextInt();
		for (counter = 1; counter <= rolls; counter++) {
			int randomNum = min + generator.nextInt(max - min + 1);
			System.out.println("Outcome #" + counter + ": " + randomNum);
		}
	}

}
