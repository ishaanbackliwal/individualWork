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
		
		
		/* DISPLAY NAMES IN ARRAY LIST	//////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<String> names = new ArrayList<String>();
		names.add("Kyle Lowry");
		names.add("Kawhi Leonard");
		names.add(1, "Jeremy Lin");
		System.out.println("Enter your name pls: ");
		names.add(input.nextLine());
		for (int counter = 0; counter < names.size(); counter++){
			String temporaryName = names.get(counter);
			System.out.println(temporaryName);
		}
		*/
		
		
		/* DOES NOT WORK	////////////////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<Friend> friends = new ArrayList<Friend>();
		Friend me = new Friend("Ishaan", 17);
		friends.add(me);
		friends.add(new Friend("Malcolm", 7));
		friends.add(0, new Friend("Daisy", 3));
		friends.set(2, me);
		for (int counter = 0; counter < friends.size(); counter++){
			System.out.println(friends.get(counter).getAge());
		}
		*/
		
		
		/* USE RECTANGLE CLASS	////////////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<Rectangle> thing = new ArrayList<Rectangle>();
		int max = 70;
		int min = 50;
		for (int counter = 0; counter < 400; counter++){
			int randL = min + generator.nextInt(max - min + 1);
			int randW = min + generator.nextInt(max - min + 1);
			thing.add(new Rectangle(randL, randW));
		}
		for (int counter = 399; counter >= 0; counter--) {
			System.out.println(thing.get(counter).area());
		}
		*/
		
		
		/* ENTER NAMES, DELETE FIRST AND LAST, DISPLAY REST	////////////////////////////////////////////////////////////////////////
		ArrayList<String> names = new ArrayList<String>();
		int bigness = 5;
		for (int counter = 0; counter < bigness; counter++) {
			System.out.println("Enter a name: ");
			names.add(input.nextLine());
		}
		names.remove(0);
		names.remove(names.size() -1);
		for (int counter = 0; counter < bigness - 2; counter++) {
			System.out.println(names.get(counter));
		}
		*/
		
		
		/* MORE RECTANGLE STUFFS	///////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<Rectangle> thing = new ArrayList<Rectangle>();
		int max = 70;
		int min = 50;
		int bigness = 400;
		for (int counter = 0; counter < bigness; counter++){
			int randL = min + generator.nextInt(max - min + 1);
			int randW = min + generator.nextInt(max - min + 1);
			thing.add(new Rectangle(randL, randW));
		}
		int num = min + generator.nextInt(max - min + 1);
		System.out.println("Length of removed rectangle: " + thing.remove(num).getLength());
		for (int counter = bigness - 2; counter >= 0; counter--) {
			System.out.println(thing.get(counter).area());
		}
		*/
		
		
		/* REMOVE A THINGY AND SET INDEX 0 AS THE THINGY YOU REMOVED	/////////////////////////////////////////////////////////
		ArrayList<Rectangle> thing = new ArrayList<Rectangle>();
		int max = 70;
		int min = 50;
		int bigness = 400;
		for (int counter = 0; counter < bigness; counter++){
			int randL = min + generator.nextInt(max - min + 1);
			int randW = min + generator.nextInt(max - min + 1);
			thing.add(new Rectangle(randL, randW));
		}
		Rectangle gone = thing.remove(bigness-1);
		thing.set(0, gone);
		for (int counter = bigness-2; counter >= 0; counter--) {
			System.out.println(thing.get(counter).area());
		}
		*/
	}

}
