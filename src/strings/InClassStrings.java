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
		
		// compareTo PROGRAM	///////////////////////////////////////////////////////////////////////////////
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
		//
	}

}
