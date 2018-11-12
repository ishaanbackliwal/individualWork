package decisions;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the temperature outside in farenheight?");
		double temp = input.nextDouble();
		if (temp > 83) {
			System.out.println("You should go swimming.");
		}
		else {
			if (temp > 74) {
				System.out.println("You should pay tennis.");
			}
			else {
				if (temp > 35) {
					System.out.println("You should play golf.");
				}
				else {
					if (temp > -10) {
						System.out.println("You should go snow shoeing.");
					}
					else {
						System.out.println("Stay inside and do nothing.");
					}
				}
			}
		}
	}

}
