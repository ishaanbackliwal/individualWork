package mathOperators;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int area = -999;
		int i, ii, iii, iv, v, vi, vii, viii, ix, x = -999;
		System.out.println("What is your area code?");
		area = input.nextInt();
		System.out.println("What is your phone number? After inputting each number, press enter.");
		i = input.nextInt();
		ii = input.nextInt();
		iii = input.nextInt();
		iv = input.nextInt();
		v = input.nextInt();
		vi = input.nextInt();
		vii = input.nextInt();
		viii = input.nextInt();
		ix = input.nextInt();
		x = input.nextInt();
		System.out.println("\nPhone number: +" + area + " (" 
		+ i + ii + iii + ") " + iv + v + vi + " - " + vii + viii + ix + x);
		System.out.println("Area code: +" + area);
		System.out.println("Middle three digits: " + iv + v + vi);
		System.out.println("Last four digits: " + vii + viii + ix + x);
	}

}
