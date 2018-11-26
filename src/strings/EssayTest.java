package strings;

import java.util.Scanner;

public class EssayTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		EssayClass bob = new EssayClass();
		System.out.println("Enter your first and last name: ");
		bob.setName(input.nextLine());
		System.out.println("Enter your essay: ");
		bob.setText(input.nextLine());
		System.out.println("\nLast name: " + bob.getLastName());
		System.out.println("Number of characters in your first name: " + bob.getFirstNameChar());
		System.out.println("Your name contains the letter x. This statement is " + bob.containsX() + ".");
		System.out.println("Essay word count: " + bob.wordCount());
	}

}
