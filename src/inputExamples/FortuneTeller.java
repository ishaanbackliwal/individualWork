package inputExamples;
import java.util.Scanner;
public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int age = -999;
		int weight = -999;
		int gpa = -999;
		System.out.println("I am a fortune teller. Tell me your age (integer); if you want to see your fotune");
		age = input.nextInt();
		System.out.println("Now tell me your weight in pounds (enter an integer).");
		weight = input.nextInt();
		System.out.println("Finally, tell me your gpa to the closest integer.");
		gpa = input.nextInt();
		System.out.println("\n\n In the 25 years...");
		System.out.println("...you will be " + age + " (plus 25) years old...");
		System.out.println("...you will be " + weight + " pounds overweight...");
		System.out.println("...and you will be getting divorce number " + gpa + "! Good on you!");
	}

}
