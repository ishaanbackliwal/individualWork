package arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class InClassArrayLists {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		/* ADD 3 NAMES TO ArrayList	//////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<String> names = new ArrayList<String>();
		names.add("Kyle Lowry");
		names.add("Kawhi Leonard");
		names.add("Jeremy Lin");
		*/
		
		
		/* ADD 3 NAMES IN DIFFERENT ORDER	//////////////////////////////////////////////////////////////////////////////////////
		ArrayList<String> names = new ArrayList<String>();
		names.add("Kyle Lowry");
		names.add("Kawhi Leonard");
		names.add(0, "Jeremy Lin");
		System.out.println(names);
		*/
		
		
		/* PROMPT FOR EXTRA NAME AT THE END	//////////////////////////////////////////////////////////////////////////////////////
		ArrayList<String> names = new ArrayList<String>();
		names.add("Kyle Lowry");
		names.add("Kawhi Leonard");
		names.add(0, "Jeremy Lin");
		System.out.println("Enter another name to add to the end of the array list: ");
		names.add(input.nextLine());
		System.out.println("Names: " + names);
		*/
		
		
		/* USE FRIENDS CLASS	//////////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<Friend> friends = new ArrayList<Friend>();
		Friend me = new Friend("Ishaan", 17);
		friends.add(me);
		friends.add(new Friend("Malcolm", 7));
		friends.add(0, new Friend("Daisy", 3));
		friends.set(2, me);
		*/
	}

}
