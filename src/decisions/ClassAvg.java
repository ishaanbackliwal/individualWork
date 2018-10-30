package decisions;

import java.util.Scanner;

public class ClassAvg {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many students took the test?");
		int students = input.nextInt();
		int counter = 0;
		double sum = 0;
		for (counter = 1; counter <= students; counter++) {
			System.out.println("Enter the test score for a student.");
			sum += input.nextInt();
		}
		double avg = sum / (double)students;
		System.out.println("The average test score is " + avg);
	}

}
