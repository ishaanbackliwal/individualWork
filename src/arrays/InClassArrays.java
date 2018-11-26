package arrays;

import java.util.Random;
import java.util.Scanner;

public class InClassArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		/* STORE 5 TEST SCORES	//////////////////////////////////////////////////////////////////////////////////////////
		double[] scores = new double[5];
		for (int counter = 0; counter <= 4; counter++) {
			System.out.println("Enter a test score: ");
			scores[counter] = input.nextDouble();
		}
		System.out.println("Scores entered: " + scores[0] + ", " + scores[1] + ", " + scores[2] + ", " + scores[3] + ", " + scores[4]);
		*/
		
		
		/* SUM OF TEST SCORES STORED	/////////////////////////////////////////////////////////////////////////////////
		double[] scores = new double[5];
		int sum = 0;
		for (int counter = 0; counter <= 4; counter++) {
			System.out.println("Enter a test score: ");
			scores[counter] = input.nextDouble();
			sum += scores[counter];
		}
		System.out.println("Scores entered: " + scores[0] + ", " + scores[1] + ", " + scores[2] + ", " + scores[3] + ", " + scores[4]);
		System.out.println("Sum of all scores: " + sum);
		*/
		
		
		/* PROMPT FOR 25,000 TEST SCORES DISPLAY IN REVERSE ORDER	////////////////////////////////////////////////////
		double[] scores = new double[5];
		int sum = 0;
		int num = 0;
		for (int counter = 0; counter <= 4; counter++) {
			System.out.println("Enter a test score: ");
			scores[counter] = input.nextDouble();
			sum += scores[counter];
		}
		for (int counter2 = 4; counter2 >=0; counter2--) {
			num = counter2 + 1;
			System.out.println("Test score #" + num + ": " + scores[counter2]);
		}
		*/
		
		
		/* RANDOM NUMS STORED AND DISPLAY BIGGEST	///////////////////////////////////////////////////////////////////
		double[] scores = new double[250];
		int max = 1000;
		int min = 0;
		int big = 0;
		for (int counter = 0; counter < 250; counter++) {
			int randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum > big) {
				big = randomNum;
			}
		}
		System.out.println("The largest number was " + big);
		*/
	}

}
