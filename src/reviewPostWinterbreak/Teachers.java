package reviewPostWinterbreak;

import java.util.Scanner;

public class Teachers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] names = new String[3];
		for (int counter = 0; counter < names.length; counter++) {
			System.out.println("Enter a teacher name First Last: " );
			names[counter] = input.nextLine();
		}
		for (int counter = names.length - 1; counter >= 0; counter--) {
			char firstInitial = names[counter].charAt(0);
			char lastInitial = names[counter].charAt(names[counter].indexOf(" ") + 1);
			System.out.println(firstInitial + "" + lastInitial);
		}
	}

}
