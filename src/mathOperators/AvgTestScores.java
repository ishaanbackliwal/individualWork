package mathOperators;

import java.util.Scanner;

public class AvgTestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double test1 = -999;
		double test2 = -999;
		double test3 = -999;
		double average = -999;
		System.out.println("Insert the percentage you got on your first test (integer value).");
		test1 = input.nextDouble();
		System.out.println("Insert the percentage you got on your second test (integer value).");
		test2 = input.nextDouble();
		System.out.println("Insert the percentage you got on your third test (integer value).");
		test3 = input.nextDouble();
		average = (test1 + test2 + test3) / 3;
		System.out.println("\nTest 1: " + test1 + "%");
		System.out.println("Test 2: " + test2 + "%");
		System.out.println("Test 3: " + test3 + "%");
		System.out.println("\nAverage: " + average + "%");
	}

}
