package decisions;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		int counter = 0;
		double big = 0;
		double small = 100;
		int min = 1;
		int max = 2;
		double heads = 0;
		int trials = 0;
		double percent = 0;
		for (trials = 1; trials <= 1000; trials++) {
			for (counter = 1; counter <= 100000; counter++) {
				int randomNum = min + generator.nextInt(max - min + 1);
				if (randomNum == 1) {
					heads++;
				}
			}
			percent = (heads / 100000) * 100;
			if (percent > big) {
				big = percent;
			}
			if (percent < small) {
				small = percent;
			}
			heads = 0;
		}
		System.out.println("Maximum percentage of heads flipped: " + big);
		System.out.println("Minimum percentage of heads flipped: " + small);
	}

}
