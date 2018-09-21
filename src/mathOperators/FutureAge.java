package mathOperators;

import java.util.Scanner;

public class FutureAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = -999;
		System.out.println("How old are you? Enter and integer.");
		age = input.nextInt();
		age = age +7; 
		System.out.println("In seven years, you will be " + age + " years old.");
	}

}
