package decisions;

import java.util.Random;
import java.util.Scanner;

public class RollDie2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int counter = 0;
		int min = 1;
		int max = 6;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		System.out.println("How many times do you want to roll the die?");
		int rolls = input.nextInt();
		for (counter = 1; counter <= rolls; counter++) {
			int randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum == 1) {
				one++;
			}
			if (randomNum == 2) {
				two++;
			}
			if (randomNum == 3) {
				three++;
			}
			if (randomNum == 4) {
				four++;
			}
			if (randomNum == 5) {
				five++;
			}
			if (randomNum == 6) {
				six++;
			}
		}
		
		double percent1 = (double)one / (double)rolls * 100;
		double percent2 = (double)two / (double)rolls * 100;
		double percent3 = (double)three / (double)rolls * 100;
		double percent4 = (double)four / (double)rolls * 100;
		double percent5 = (double)five / (double)rolls * 100;
		double percent6 = (double)six / (double)rolls * 100;
		
		System.out.println("Number of times 1 was rolled: " + one + " (" + percent1 + "%)");
		System.out.println("Number of times 2 was rolled: " + two + " (" + percent2 + "%)");
		System.out.println("Number of times 3 was rolled: " + three + " (" + percent3 + "%)");
		System.out.println("Number of times 4 was rolled: " + four + " (" + percent4 + "%)");
		System.out.println("Number of times 5 was rolled: " + five + " (" + percent5 + "%)");
		System.out.println("Number of times 6 was rolled: " + six + " (" + percent6 + "%)");
	}

}
