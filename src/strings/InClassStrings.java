package strings;

import java.util.Scanner;

public class InClassStrings {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		/* STRING THEN PRIMITIVE	////////////////////////////////////////////////////////////////////////////
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		System.out.println("What is your age?");
		int age = input.nextInt();
		
		System.out.println("\nAge: " + age);
		System.out.println("Name: " + name);
		*/
		
		
		/* PRIMITIVE THEN STRING	////////////////////////////////////////////////////////////////////////////
		System.out.println("What is your age?");
		int age = input.nextInt();
		
		input.nextLine();									//clearing the buffer
		
		System.out.println("What is your name?");
		String name = input.nextLine();
		
		System.out.println("\nAge: " + age);
		System.out.println("Name: " + name);
		*/
		
		
		/* charAt PROGRAM	////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		
		System.out.println("First letter: " + sentence.charAt(0));
		
		System.out.println("Third letter: " + sentence.charAt(2));
		
		System.out.println("Entire sentence: " + sentence);
		*/
		
		
		/* contains PROGRAM	///////////////////////////////////////////////////////////////////////////////////
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		
		System.out.println(sentence.contains("Bob"));
		*/
		
		
		/* compareTo PROGRAM	///////////////////////////////////////////////////////////////////////////////
		System.out.println("Enter a name: ");
		String name1 = input.nextLine();
		
		System.out.println("Enter another name: ");
		String name2 = input.nextLine();
		
		if (name1.compareTo(name2) == 0) {
			System.out.println("Both names are the same.");
		}
		else {
			if (name1.compareTo(name2) < 0) {
				System.out.println(name1 + " comes before " + name2 + " alphabetically.");
			}
			else {
				System.out.println(name2 + " comes before " + name1 + " alphabetically.");
			}
		}
		*/
		
		
		/* indexOf PROGRAM	///////////////////////////////////////////////////////////////////////////////////
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		
		System.out.println("First index where the letter X is used: " + sentence.indexOf('X'));
		*/
		
		
		/* length PROGRAM	///////////////////////////////////////////////////////////////////////////////////
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		
		System.out.println("Number of characters in input sentence: " + sentence.length());
		*/
		
		
		/* length PROGRAM #2	///////////////////////////////////////////////////////////////////////////////
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		
		int length = sentence.length();
		
		for (int counter = 0; counter < length; counter++) {
			System.out.println(sentence.charAt(counter));
		}
		*/
		
		
		/* toLowerCase PROGRAM	/////////////////////////////////////////////////////////////////////////////
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		
		System.out.println(sentence.toLowerCase());
		System.out.println(sentence);
		*/
		
		
		/* toUpperCase PRGOGRAM	/////////////////////////////////////////////////////////////////////////////
		System.out.println("Enter a name: ");
		String name1 = input.nextLine();
		System.out.println("Enter a another name: ");
		String name2 = input.nextLine();
		if (name1.compareTo(name2) < 0) {
			System.out.println(name1.toUpperCase());
		}
		else {
			System.out.println(name2.toUpperCase());
		}
		*/
		
		
		/* PASSWORD w/ DO-WHILE LOOP	//////////////////////////////////////////////////////////////////////
		System.out.println("Enter password: ");
		String pass1 = input.nextLine();
		int decision = 1;
		do {
			System.out.println("Confirm password: ");
			String pass2 = input.nextLine();
			decision = pass1.compareTo(pass2);
		}
		while (decision != 0);
		System.out.println("Password confirmed");
		*/
	}

}
