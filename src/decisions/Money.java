package decisions;

import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		double age = input.nextDouble();
		System.out.println("What is your GPA?");
		double gpa = input.nextDouble();
		double amount = -999.0;
		if ((gpa + age) > 20) {
			amount = 250.00;
		}
		if ((gpa + age) < 20) {
			amount = 30.00;
		}
		System.out.println("You will recieve $" + amount);
	}

}