package decisions;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer.");
		int num = input.nextInt();
		int counter = 0;
		int ans = 0;
		int divisors = 0;
		for (counter = 1; counter <= num; counter++) {
			if (num % counter == 0) {
				divisors++;
			}
		}
		if (divisors == 2) {
			System.out.println("Your number IS a prime number.");
		}
		else {
			System.out.println("Your number is NOT a prime number.");
		}
	}

}
