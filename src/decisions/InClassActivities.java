package decisions;

import java.util.Scanner;

public class InClassActivities {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/* AGE	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("What is your age?");
		int age = input.nextInt(); 
		System.out.println(age==16);
		*/
		
		/* HEIGHT AND SHOE SIZE	////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("What is your height in inches?");
		double height = input.nextDouble();
		System.out.println("What is your shoe size?");
		double shoeSize = input.nextDouble();
		System.out.println(height+shoeSize>=26);
		*/
		
		/* HEIGHT AND SHOE SIZE 2	////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("What is your height in inches?");
		double height = input.nextDouble();
		System.out.println("What is your shoe size?");
		double shoeSize = input.nextDouble();
		System.out.println(height < 62 && shoeSize > 9);
		*/
		
		/* PETS AND GARAGE	///////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("How many pets do you have in your house?");
		double pets = input.nextDouble();
		System.out.println("How many cars will fit in your garage?");
		double cars = input.nextDouble();
		System.out.println(pets >= 5 || cars > 3);
		*/
		
		/* TEST SCORES	////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Enter your first test score...");
		double test1 = input.nextDouble();
		System.out.println("Enter your second test score...");
		double test2 = input.nextDouble();
		if (test1 > test2)
		{
			System.out.println("Great job!");
			double difference = test1 - test2;
			System.out.println("Difference of test score: " + difference);
		}
		System.out.println("Have a nice day!");
		*/
		
		/* GIVEN 3 INTEGERS, DETERMINE LARGEST ONE	/////////////////////////////////////////////////////////////////////////
		System.out.println("Enter an integer: ");
		int val1 = input.nextInt();
		System.out.println("Enter another integer: ");
		int val2 = input.nextInt();
		System.out.println("Enter another integer: ");
		int val3 = input.nextInt();
		if (val1 > val2 && val1 > val3)
		{
			System.out.println("Largest integer you entered: " + val1);
		}
		if (val2 > val1 && val2 > val3)
		{
			System.out.println("Largest integer you entered: " + val2);
		}
		if (val3 > val1 && val3 > val2)
		{
			System.out.println("Largest integer you entered: " + val3);
		}
		if (val1 == val2 && val2 == val3)
		{
			System.out.println("All the integers you entered are the same: " + val1);
		}
		*/
		
		/* GRADUATE WITH HONORS OR NOT?	/////////////////////////////////////////////////////////////////////////////////
		System.out.println("What grade are you in?");
		double grade = input.nextDouble();
		System.out.println("What is your GPA?");
		double gpa = input.nextDouble();
		if (grade == 12 && gpa >= 3.5) {
			System.out.println("You will gradate with honors!");
		}
		else {
			System.out.println("Sorry, but you won't be graduating with honors.");
		}
		*/
		
		/* LUCKY NUMBER	///////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("How old are you?");
		double age = input.nextDouble();
		double luckyNumber = 0;
		if (age >= 18 && age > 0) {
			System.out.println("What is your height in inches?");
			double height = input.nextDouble();
			luckyNumber = height * 5;
		}
		else {
			if (age > 0) {
				System.out.println("What is your weight in lbs?");
				double weight = input.nextDouble();
				luckyNumber = weight / 2;
			}
			else {
				System.out.println("You can't have a lucky number, you barely exist, if at all.");
				luckyNumber = 666;
			}
		}
		System.out.println("Your lucky number is: " + (int)luckyNumber);
		*/
		
		// WINNING A PRIZE /////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("How much money did you recieve for your 5th birthday?");
		double money = input.nextDouble();
		if (Math.abs(money-Math.sqrt(84.3)) <= 0.1) {
			System.out.println("You will recieve the 'good' prize!");
		}
		else {
			System.out.println("You will recieve the 'bad' prize.");
		}
		//
	}

}
