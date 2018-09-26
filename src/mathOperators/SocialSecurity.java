package mathOperators;

import java.util.Scanner;

public class SocialSecurity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = -999;
		int legal = -999;
		int i = -999;
		int ii = -999;
		int iii = -999;
		int iv = -999;
		int v = -999;
		int vi = -999;
		int vii = -999;
		int viii = -999;
		int ix = -999;
		System.out.println("What is your age? Enter and integer.");
		age = input.nextInt();
		System.out.println("What is your social security number? After inputting each number, press enter.");
		i = input.nextInt();
		ii = input.nextInt();
		iii = input.nextInt();
		iv = input.nextInt();
		v = input.nextInt();
		vi = input.nextInt();
		vii = input.nextInt();
		viii = input.nextInt();
		ix = input.nextInt();
		legal = 18 - age;
		System.out.println("\nYou are " + age + " years old");
		System.out.println("You will be 18 in " + legal + " year(s)");
		System.out.println("Your social security number is " + i + ii + iii + iv + v + vi + vii + viii + ix);
		System.out.println(("The last four digits of your social security number are " + vi + vii + viii + ix));
	}

}
