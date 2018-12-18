package arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Search {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		/* SEE IF SAT SCORE IS IN ARRAY LIST	/////////////////////////////////////////////////////////////////////////////////
		boolean in = false;
		int min = 0;
		int max = 1600;
		ArrayList<Integer> scores = new ArrayList<Integer>();
		for (int counter = 0; counter < 1000; counter++) {
			scores.add(min + generator.nextInt(max - min + 1));
		}
		System.out.println("Enter an SAT score: ");
		int user = input.nextInt();
		for(int x : scores) {
			if (x == user) {
				in = true;
				break;
			}
		}
		if (in == true) {
			System.out.println("The score " + user + " IS in the ArrayList.");
		}
		else {
			System.out.println("The score " + user + " is NOT in the ArrayList.");
		}
		*/
		
		
		/* SEE IF NUM IS IN ARRAY	////////////////////////////////////////////////////////////////////////////////////////////
		int min = 0;
		int max = 499;
		int times = 0;
		int[] nums = new int[100];
		for (int counter = 0; counter < nums.length; counter++) {
			nums[counter] = min + generator.nextInt(max - min + 1);
		}
		System.out.println("Enter an integer: ");
		int user = input.nextInt();
		for (int x : nums) {
			if (x == user) {
				times++;
			}
		}
		System.out.println("The number " + user + " appears " + times + " time(s) in the array.");
		*/
		
		
		/* USE RECTANGLE OBJECTS AND TEST FOR WIDTH	///////////////////////////////////////////////////////////////////////////
		int min = 0;
		int max = 499;
		int num = 0;
		ArrayList<Rectangle> square = new ArrayList<Rectangle>();
		for (int counter = 0; counter < 100; counter++) {
			square.add(new Rectangle((min + generator.nextInt(max - min + 1)), (min + generator.nextInt(max - min + 1))));
		}
		for (int counter = 0; counter < square.size(); counter++) {
			if (square.get(counter).getWidth() == 10){
				num++;
			}
		}
		System.out.println(num + " rectangles in the ArrayList have a width of 10.");
		*/
	}

}
