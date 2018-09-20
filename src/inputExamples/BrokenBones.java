package inputExamples;

import java.util.Scanner;

public class BrokenBones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bones = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("How many bones have you broken so far? Enter an integer. ");
		bones = input.nextInt();
		System.out.println("You've broken " + bones + " bone(s)? Wow!");
	}

}
