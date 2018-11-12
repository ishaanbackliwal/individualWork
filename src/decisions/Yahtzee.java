package decisions;

import java.util.Random;
import java.util.Scanner;

public class Yahtzee {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int one = 0; 
		int two = 0; 
		int three = 0;
		int four = 0;
		int five = 0;
		int counter = 0;
		int max = 6;
		int min = 0;
		int rolls = 0;
		int randomNum = 0;
		do {
			for (counter = 1; counter <= 5; counter++) {
				randomNum = min + generator.nextInt(max - min + 1);
				if (counter == 1) {
					one = randomNum;
				}
				if (counter == 2) {
					two = randomNum;
				}
				if (counter == 3) {
					three = randomNum;
				}
				if (counter == 4) {
					four = randomNum;
				}
				if (counter == 5) {
					five = randomNum;
				}
			}
			rolls += 5;
		}
		while (one != two);
		System.out.println("Yahtzee!");
		System.out.println("It took " + rolls + " rolls to get Yahtzee!");
	}

}
