package inputExamples;
import java.util.Scanner;
public class Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monkey = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the height of the average adult monkey (in inches)? ");
		monkey = input.nextInt();
		System.out.println("You said adult monkeys are about " + monkey + " inches tall.");
	}

}
