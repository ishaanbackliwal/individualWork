package reviewPostWinterbreak;

import java.util.Scanner;
import java.util.Random;

public class Heights {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int maxR = 10;
		int maxC = 12;
		int[][] heights = new int[maxR][maxC];
		int min = 3;
		int max = 7;
		int tall = 0;
		int sum = 0;
		int shortest = 7;
		for (int row = 0; row < heights.length; row++) {
			for (int column = 0; column < heights[0].length; column++) {
				heights[row][column] = min + generator.nextInt(max - min + 1);
				if (heights[row][column] > tall) {
					tall = heights[row][column];
				}
				if (heights[row][column] < shortest) {
					shortest = heights[row][column];
				}
				sum += heights[row][column];
			}
		}
		double avg = (double)sum / ((double)maxR * (double)maxC);
		System.out.println("Tallest student: " + tall + "ft \nShortest student: " + shortest + "ft \nAvg height: " + avg + "ft");
	}

}
