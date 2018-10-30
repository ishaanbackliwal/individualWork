package decisions;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many items did you buy?");
		int items = input.nextInt();
		int counter = 0;
		double totalPrice = 0;
		for (counter = 1; counter <= items; counter++) {
			System.out.println("What is the price of the item? ");
			double price = input.nextInt();
			totalPrice +=price;
		}
		System.out.println("Total: $" + totalPrice);
		double tax = totalPrice * 0.05;
		System.out.println("5% Tax: $" + tax);
		double total = tax + totalPrice;
		System.out.println("Total plus tax: $" + total);
	}
}
