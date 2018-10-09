package oop;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Employee jared = new Employee();
		System.out.println(jared.getWage());
		System.out.println("What is your wage?");
		double userWage = input.nextDouble();
		jared.setWage(userWage);

		System.out.println("Your wage is $" + userWage);
		System.out.println("What is your wage?");
		jared.setExperience(input.nextDouble());
		
		jared.raiseWage();
		System.out.println("Your wage with a 10% raise is $" + jared.getWage());
	}

}
