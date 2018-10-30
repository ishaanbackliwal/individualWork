package decisions;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer.");
		int num = input.nextInt();
		int counter = 0;
		int sum = 0;
		for (counter = 1; counter < num; counter += 2) {
			sum += counter;
		}
		System.out.println("The sum of all odd integers less than your number and more than 0: " + sum);
	}

}
