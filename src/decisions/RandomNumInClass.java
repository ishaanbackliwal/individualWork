package decisions;

import java.util.Random;

public class RandomNumInClass {

	public static void main(String[] args) {
		Random generator = new Random();
		
		/* FLIP COIN 100000 TIMES	/////////////////////////////////////////////////////////////////////////////////
		int counter = 0;
		int heads = 0;
		int tails = 0;
		int min = 1;
		int max = 2;
		for (counter = 1; counter <= 100000; counter++) {
			int randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum == 1) {
				heads++;
			}
			else {
				tails++;
			}
		}
		System.out.println("Number of heads flipped: " + heads);
		System.out.println("Number of tails flipped: " + tails);
		*/
		
		/* ROLL 13 SIDDED DIE	/////////////////////////////////////////////////////////////////////////////////////
		int counter = 0;
		int threes = 0;
		int min = 1;
		int max = 13;
		for (counter = 1; counter <= 87; counter++) {
			int randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum % 3 == 0) {
				threes++;
			}
		}
		System.out.println("Number of times you rolled a multiple of three: " + threes);
		*/
		
		// HEIGHTS OF FIRST GRADERS IN RUSSIAN FISHING VILLIAGE	////////////////////////////////////////////////////
		int counter = 0;
		int kids = 0;
		int min = 26;
		int max = 43;
		for (counter = 1; counter <= 248; counter++) {
			int randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum > 36) {
				kids++;
			}
		}
		System.out.println("Number of kids taller than 3ft: " + kids);
		//
	}

}
