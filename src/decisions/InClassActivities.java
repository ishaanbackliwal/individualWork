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
		
		/* WINNING A PRIZE /////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("How much money did you receive for your 5th birthday?");
		double money = input.nextDouble();
		if (Math.abs(money-Math.sqrt(84.3)) <= 0.1) {
			System.out.println("You will receive the 'good' prize!");
		}
		else {
			System.out.println("You will receive the 'bad' prize.");
		}
		*/
		
		/* SALARY DETERMINING JOB	////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("What is your yearly salary?");
		double salary = input.nextDouble();
		if (salary <= 20000) {
			System.out.println("You are a worker.");
		}
		else {
			if (salary <= 40000) {
				System.out.println("You are a manager.");
			}
			else {
				if (salary <= 100000) {
					System.out.println("You are a CEO.");
				}
				else {
					System.out.println("You are an owner.");
				}
			}
		}
		*/
		
		/* GRADE CALCULATION	////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("What is your test average?");
		double testAvg = input.nextDouble();
		System.out.println("What is your homework average?");
		double hwAvg = input.nextDouble();
		System.out.println("Is your teacher nice? Enter 1 for yes and 2 for no.");
		double teacher = input.nextDouble();
		double grade = 0;
		if (teacher == 1 && hwAvg > testAvg) {
			grade = hwAvg;
		}
		else {
			if (teacher == 1 && hwAvg < testAvg) {
				grade = testAvg;
			}
			else {
				if (hwAvg < testAvg) {
					grade = hwAvg;
				}
				else {
					grade = testAvg;
				}
			}
		}
		System.out.println("Your grade will be " + grade + "%");
		*/
		
		/* LOOPS -- DISPLAY 0-100	////////////////////////////////////////////////////////////////////////////////////////
		int count = 0;						// 1- Get
		while (count <= 100) {				// 2- Test
			System.out.println(count);		// 3- Use
			count++;						// 1- Get
		}
		*/
		
		/* LOOPS -- DISPLAY MULTIPLES OF 2 FROM 0-100,000	/////////////////////////////////////////////////////////////////
		int count = 0;
		while (count <= 100000) {
			System.out.println(count);
			count += 2;
		}
		*/
		
		/* LOOPS -- DISPLAY MULTIPLES OF 2 FROM 0 TO INPUTTED NUMBER	////////////////////////////////////////////////////
		System.out.println("Enter the integer you want multiples of 2 until: ");
		double max = input.nextInt();	//If negative # entered, program will skip while loop and go on to next code
		int count = 0;
		while (count <= max) {
			System.out.println(count);
			count += 2;
		}
		*/
		
		/* LOOPS - SUM OF ALL MULTIPLES OF 2 FROM 0 TO INPUTTED NUMBER	/////////////////////////////////////////////////////
		System.out.println("Enter the integer you want multiples of 2 until: ");
		double max = input.nextInt();
		int count = 0;
		int sum = 0;
		while (count <= max) {
			sum += count;
			count += 2;
		}
		System.out.println(sum);
		*/
		
		/* ENTER 9999 TO QUIT	////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Enter a number (9999 to quit).");
		int num = input.nextInt();
		while (num != 9999) {
			num = num * 2;
			System.out.println("Your number doubles is " + num);
			System.out.println("Enter a number (9999 to quit).");
			num = input.nextInt();
		}
			System.out.println("You quit the program.");
		*/
		
		/* LAST ONE BUT DONT DISPLAY SUM UNTIL THEY QUIT AND DONT DOUBLE VALUES	/////////////////////////////////////////////
		System.out.println("Enter a number (9999 to quit).");
		double num = input.nextDouble();
		double sum = 0;
		while (num != 9999) {
			sum += num;
			System.out.println("Enter a number (9999 to quit).");
			num = input.nextDouble();
		}
		System.out.println("Your sum is " + sum);
		*/
		
		/* SAME AS ABOVE BUT WITH AVERAGE	////////////////////////////////////////////////////////////////////////////////
		System.out.println("Enter a number (9999 to quit).");
		double num = input.nextDouble();
		double sum = 0;
		double counter = 0;
		double avg = 0;
		while (num != 9999) {
			sum += num;
			System.out.println("Enter a number (9999 to quit).");
			num = input.nextDouble();
			counter++;
		}
		avg = sum / counter;
		System.out.println("Your average is " + avg);
		*/
		
		/* SAME AS EARLIER BUT DISPLAY LARGEST VALUE	////////////////////////////////////////////////////////////////////////
		System.out.println("Enter a number (9999 to quit).");
		double num = input.nextDouble();
		double big = 0;
		while (num != 9999) {
			System.out.println("Enter a number (9999 to quit).");
			num = input.nextDouble();
			if (num > big && num != 9999) {
				big = num;
			}
		}
		System.out.println("The largest number you entered is " + big);
		*/
		
		/* DO WHILE LOOP ENTER 9999 TO EXIT	///////////////////////////////////////////////////////////////////////////////////
		System.out.println("Enter a number.");
		double num = input.nextDouble();
		do {
			System.out.println("Enter a number (9999 to quit).");
			num = input.nextDouble();
		}
		while (num != 9999);
		*/
		
		/* DISPLAY RANGE WHEN QUIT
		System.out.println("Enter a number.");
		double small = input.nextDouble();
		double num = 0;
		double big = 0;
		do {
			System.out.println("Enter a number (9999 to quit).");
			num = input.nextDouble();
			if (num > big && num != 9999) {
				big = num;
			}
			else {
				if (num < small && num != 9999) {
					small = num;
				}
			}
		}
		while (num != 9999);
			double range = big - small;
			System.out.println("Range: " + range);
		*/
		
		/* NESTED LOOPS	////////////////////////////////////////////////////////////////////////////////////////////////////////
		int counter = 0;
		int row = 0;
		for (row = 1; row <= 4; row++) {
			for (counter = 1; counter <=5; counter++) {
				System.out.println((counter * row) + " ");
			}
		}
		*/
		
		/* MORE NESTED LOOPS	////////////////////////////////////////////////////////////////////////////////////////////////
		int i = 0;
		int row = 0;
		for (row = 1; row <= 4; row++) {
			for (i = 1; i <= 5; i++) {
				if (i != 3) {
					System.out.println(i);
				}
				else {
					System.out.println(row);
				}
			}
		}
		*/
		
		/* MORE MORE NESTED LOOPS	////////////////////////////////////////////////////////////////////////////////////////////
		int in = 0;
		int num = 0;
		int counter = 0;
		int divisors = 0;
		int mostDiv = 0;
		int big = 0;
		System.out.println("Enter the upper limit of the range in which to find the number with the biggest amount of divisors: ");
		in = input.nextInt();
		
		for (num = 1; num <= in; num++) {
			divisors = 0;
			for (counter = 1; counter <= num; counter++) {
				if (num % counter == 0) {
					divisors++;
					if (divisors > mostDiv) {
						mostDiv = divisors;
						big = num;
					}
				}
			}
		}
		System.out.println("Number with the most divisors between 1 and " + in + ": " + big);
		*/
	}
}
