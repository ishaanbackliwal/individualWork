package decisions;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int choice = 1;
		
		while (choice < 7 && choice > 0) {
			System.out.println("\n1: Identify a Right Triangle");
			System.out.println("2: Powers");
			System.out.println("3: Square Root");
			System.out.println("4: Round Up");
			System.out.println("5: Round Down");
			System.out.println("6: QUIT");
			choice = input.nextInt();
			switch (choice) {
				case 1: 
					System.out.println("Enter a leg of the triangle.");
					double legA = input.nextDouble();
					System.out.println("Enter the other leg of the triangle.");
					double legB = input.nextDouble();
					System.out.println("Enter the hypotenuse of the triangle.");
					double hyp = input.nextDouble();
					double leftE = (legA * legA) + (legB + legB);					// left side of theorem
					double rightE = hyp * hyp;										// right side of theorem
					int dec = 0;
					while (dec == 0) {
						if (legA <= 0 || legB <= 0 || hyp <= 0) {
							System.out.println("You entered an invalid number. Try again.");
							dec = 1;
						}
						else {
							if (leftE == rightE) {
								System.out.println("The triangle is a right triangle.");
							}
							else {
								System.out.println("The triangle is NOT a right triangle.");
							}
						}	
					}
					break;
				case 2: 
					System.out.println("Enter a number.");
					double num = input.nextDouble();
					System.out.println("To what power do you wish to raise this number?");
					double power = input.nextDouble();
					double ans = Math.pow(num, power);
					System.out.println(num + " rasied to the power of " + power + " is " + ans + ".");
					break;
				case 3:
					System.out.println("Enter a number.");
					double num2 = input.nextDouble();
					int dec2 = 0;
					while (num2 < 0) {
						if (dec2 >= 0) {
							double ans2 = Math.sqrt(num2);
							System.out.println("The square root of " + num2 + " is " + ans2);
							dec2 = 1;
						}
						else {
							System.out.println("You entered an invalid value. We don't do negative numbers around here. Try again.");
							dec2 = 2;
						}
					}
					break;
				case 4:
					
				case 5:
					
				case 6:
					
				default:
					System.out.println("You did not enter a valid number. Please try again.");
				}
			}
	}

}
