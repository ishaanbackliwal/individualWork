package oop;

import java.util.Scanner;

public class GreeterTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);			//creation of Scanner object to allow input
		Greeter samuel = new Greeter();					//declaring Greeter method
		System.out.println(samuel.getAge());			//display age already set in Greeter class
		System.out.println("What is your age?");		//pass age to method and display new age in GreeterTest class
		int newAge = input.nextInt();
		samuel.setAge(newAge);
		System.out.println("Your age is " + newAge);	
	}

}
