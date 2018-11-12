package decisions;

import java.util.Scanner;

public class GradePercentage {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a test score");
		double test1 = input.nextDouble();
		System.out.println("Enter another test score");
		double test2 = input.nextDouble();
		System.out.println("Enter another test score");
		double test3 = input.nextDouble();
		double avg = (test1 + test2 + test3) / 3;
		System.out.println("Did you do extra credit? Enter 1 for yes and 2 for no.");
		int extraCred = input.nextInt();
		if (extraCred == 1)
		{
			System.out.println("How many points did you get for extra credit?");
			double points = input.nextDouble();
			avg += points;
		}
		System.out.println("Average test score: " + avg);
	}

}
