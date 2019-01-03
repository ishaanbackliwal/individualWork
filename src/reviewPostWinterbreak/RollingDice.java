package reviewPostWinterbreak;

import java.util.Random;
import java.util.Scanner;

public class RollingDice {

	public static void main(String[] args) {
		Random generator = new Random();
		int[] rolls = new int[487];
		int min = 1;
		int max = 6;
		int num = 0;
		for (int counter = 0; counter < rolls.length; counter++) {
			rolls[counter] = (min + generator.nextInt(max - min + 1));
			if (rolls[counter] % 2 != 0) {
				num++;
			}
		}
		for (int counter = rolls.length - 1; counter >= 0; counter--) {
			System.out.println(rolls[counter]);
		}
		double percent = (double)num / rolls.length * 100;
		System.out.println("Percent of odd rolls: " + percent + "%");
	}

}
