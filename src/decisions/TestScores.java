package decisions;

import java.util.Scanner; 

public class TestScores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a test score...");
		double test1 = input.nextDouble();
		System.out.println("Enter a second test score...");
		double test2 = input.nextDouble();
		System.out.println("Enter a third test score...");
		double test3 = input.nextDouble();
		double avg = (test1 + test2 + test3) / 3;
		char grade = 'A';
		System.out.println("The average of your three test scores is " + avg + "%");
		if (avg >= 92.5) {
			grade = 'A';
		}
		else { 
			if (avg >= 84.5) {
				grade = 'B';
			}
			else {
				if (avg >= 77.5) {
					grade = 'C';
				}
				else {
					if (avg >= 69.5) {
						grade = 'D';
					}
					else {
						grade = 'F';
					}
				}
			}
		}
		System.out.println("Your grade in the class: " + grade);
	}
}
