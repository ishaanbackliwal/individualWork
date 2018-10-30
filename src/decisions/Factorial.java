package decisions;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int num = input.nextInt();
		int factorial = 1;
		int counter = 0;
		for (counter = 1; counter <= num; counter++) {
			factorial *= counter;
		}
		System.out.println(num + "! = " + factorial);
	}

}
