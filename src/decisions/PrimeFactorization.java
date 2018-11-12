package decisions;

import java.util.Scanner;

public class PrimeFactorization {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a positive integer.");
		int num = input.nextInt();
		int counter = 0;
		for (counter = 2; counter <= num; counter++) {
			while (num % counter == 0) {
				System.out.print(counter + " ");
				num = num / counter;
			}
		}
	}

}
