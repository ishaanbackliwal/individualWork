package inputExamples;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean vote = true;
		Scanner input = new Scanner(System.in);
		System.out.println("You voted! True or False? ");
		vote = input.nextBoolean();
		System.out.println("You said " + vote + ".");
	}

}
