package arrays;

import java.util.Random;
import java.util.Scanner;

public class InClassArrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		/* STORE 5 TEST SCORES	/////////////////////////////////////////////////////////////////////////////////////////
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
		double[] scores = new double[25000];
		int sum = 0;
		int num = 0;
		for (int counter = 0; counter < 25000; counter++) {
			System.out.println("Enter a test score: ");
			scores[counter] = input.nextDouble();
			sum += scores[counter];
		}
		for (int counter2 = 4; counter2 >=0; counter2--) {
			num = counter2 + 1;
			System.out.println("Test score #" + num + ": " + scores[counter2]);
		}
		*/
		
		
		/* RANDOM NUMS STORED AND DISPLAY BIGGEST	////////////////////////////////////////////////////////////////////
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
		
		
		/* TEST SCORES BACKWARDS W/ LENGTH	////////////////////////////////////////////////////////////////////////////
		double[] scores = new double[5];
		int sum = 0;
		int num = 0;
		for (int counter = 0; counter < scores.length; counter++) {
			System.out.println("Enter a test score: ");
			scores[counter] = input.nextDouble();
			sum += scores[counter];
		}
		for (int counter2 = 4; counter2 >=0; counter2--) {
			num = counter2 + 1;
			System.out.println("Test score #" + num + ": " + scores[counter2]);
		}
		*/
		
		
		/* PROMPT FOR 5 NAMES DISPLAY IN REVERSE ORDER	////////////////////////////////////////////////////////////////
		String[] names = new String[5];
		for (int counter = 0; counter < names.length; counter++) {
			System.out.println("Enter a name: ");
			names[counter] = input.nextLine();
		}
		System.out.println("\nNames you entered in backwards order: ");
		for (int counter2 = names.length - 1; counter2 >= 0; counter2--) {
			System.out.println(names[counter2]);
		}
		*/
		
		
		/* DSIPLAY NAMES ENDING WITH LETTER USER INPUTS	////////////////////////////////////////////////////////////////
		String[] names = new String[5];
		for (int counter = 0; counter < names.length; counter++) {
			System.out.println("Enter a name: ");
			names[counter] = input.nextLine();
		}
		System.out.println("\nEnter a letter: ");
		String letter = input.nextLine();
		System.out.println("\nNames entered ending with '" + letter + "': ");
		int num = 0;
		for (int counter = 0; counter < names.length; counter++) {
			String name = names[counter];
			char last = name.charAt(name.length() - 1);
			if (last == letter.charAt(0)) {
				System.out.println(name);
				num++;
			}
		}
		if (num == 0) {
			System.out.println("There are none.");
		}
		*/
		
		
		// HOW MANY NAMES ARE X LETTERS LONG	//////////////////////////////////////////////////////////////////////
		String[] names = new String[5];
		for (int counter = 0; counter < names.length; counter++) {
			System.out.println("Enter a name: ");
			names[counter] = input.nextLine();
		}
		System.out.println("\nEnter the desired name length: ");
		int leng = input.nextInt();
		int num = 0;
		for (int counter = 0; counter < names.length; counter++) {
			int space = names[counter].indexOf(" ");
			String newName = names[counter].substring(0, space);
			if (newName.length() == leng) {
				num++;
			}
		}
		System.out.println("Number of names entered that are " + leng + " letter long: \n" + num);
		//
	}

}
