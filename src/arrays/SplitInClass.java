package arrays;

import java.util.Random;
import java.util.Scanner;

public class SplitInClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		/* FIRST LETTER OF EACH WORD	/////////////////////////////////////////////////////////////////////////////////
		System.out.println("Enter a sentence");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		System.out.println("\nFirst letter of each word in the sentence: ");
		for (int counter = 0; counter < words.length; counter++) {
			System.out.println(words[counter].charAt(0));
		}
		*/
		
		
		/* KEY WORD IN SENTENCE	////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		System.out.println("Enter a key word: ");
		String key = input.nextLine();
		String[] words = sentence.split(" ");
		int num = 0;
		for (int counter = 0; counter < words.length; counter++) {
			if (words[counter].equalsIgnoreCase(key)) {
				num++;
			}
		}
		System.out.println("\nNumber of times the key word " + key + " is in the sentence: " + num);
		*/
		
		
		/* DISPLAY RANDOM WORD IN SENTENCE	///////////////////////////////////////////////////////////////////////////
		int min = 0;
		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine();
		String[] words = sentence.split(" ");
		int max = words.length - 1;
		int num = min + generator.nextInt(max - min + 1);
		System.out.println("Random word in the sentence: " + words[num]);
		*/
	}

}
