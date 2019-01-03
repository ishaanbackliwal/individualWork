package designingClasses;

import oop.Greeter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import arrays.Friend;

public class InClass {

	public static void main(String[] args) {
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		
		/* USE GREETER CLASS	///////////////////////////////////////////////////////////////////////////////////////////////////
		Greeter jimbo = new Greeter();
		Greeter jimbob = new Greeter(24);
		jimbo.sayHello();
		System.out.println(jimbo.getAge());
		jimbo.setAge(23);
		System.out.println(jimbo.getAge());
		*/
		
		
		/* USE FRIEND CLASS AND DISPLAY W/ FOR EACH LOOP	///////////////////////////////////////////////////////////////////////
		ArrayList<Friend> yo = new ArrayList<Friend>();
		
		System.out.println("How many friend objects would you like?");
		int num = input.nextInt();
		input.nextLine();
		for(int counter = 0; counter < num; counter++) {
			System.out.println("Enter name of friend");
			String name = input.nextLine();
			System.out.println("Enter the friend's age");
			int age = input.nextInt();
			yo.add(new Friend(name, age));
			input.nextLine();
		}
		
		for (Friend x : yo) {
			System.out.println("\nName: " + x.getName());
			System.out.println("Age: " + x.getAge());
		}
		*/
		
		
		/* USE "PILE-OF-JUNK" CLASS	///////////////////////////////////////////////////////////////////////////////////////////////
		PileOfJunk malcolm = new PileOfJunk();
		int min = 10;
		int max = 100;
		System.out.println(malcolm.getSum(12, 12));
		malcolm.setRand(min + generator.nextInt(max - min + 1));
		*/
	}

}
