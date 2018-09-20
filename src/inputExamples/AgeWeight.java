package inputExamples;

import java.util.Scanner;

public class AgeWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = -999;
		int weight = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age? Enter and integer.");
		age = input.nextInt();
		System.out.println("You are " + age + " years old? Thats great! \n ");
		System.out.println("How much do you weigh in pounds? Enter and integer.");
		weight = input.nextInt();
		System.out.println("You weigh " + weight + " pounds? Good for you.");
	}

}
