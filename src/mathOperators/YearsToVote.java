package mathOperators;

import java.util.Scanner;

public class YearsToVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = -999;
		int years = -999;
		System.out.println("How old are you? Enter and integer.");
		age = input.nextInt();
		years = 18 - age;
		System.out.println("You can vote in " + years + " year(s)!");
	}

}
