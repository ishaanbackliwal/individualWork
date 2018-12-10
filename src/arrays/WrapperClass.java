package arrays;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class WrapperClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		/* INPUT AGES INTO ARRAYLIST AND OUTPUT AVG USING FOR EACH	////////////////////////////////////////////////////////////
		System.out.println("How many students?");
		int num = input.nextInt();
		ArrayList<Integer> ages = new ArrayList<Integer>();
		for (int counter = 0; counter < num; counter++) {
			System.out.println("Enter age of student: ");
			ages.add(input.nextInt());
		}
		System.out.println("\nAges of students: ");
		int sum = 0;
		for (int x : ages) {
			sum += x;
		}
		double avg = (double)sum / (double)num;
		System.out.println("Avg age: " + avg);
		*/
		
		
		/* DISPLAY HIGHEST EMPLOYEE WAGE USING FOR EACH LOOP	///////////////////////////////////////////////////////////////
		System.out.println("How many employees?");
		int num = input.nextInt();
		ArrayList<Double> wages = new ArrayList<Double>();
		for (int counter = 0; counter < num; counter++) {
			int employeeNum = counter + 1;
			System.out.println("Enter employee " + employeeNum + "'s wage: ");
			wages.add(input.nextDouble());
		}
		double big = 0;
		for (double x : wages) {
			if (x > big) {
				big = x;
			}
		}
		System.out.println("Highest employee wage: $" + big);
		*/
		
		
		/* USE CIRCLE CLASS AND FOR EACH LOOP	//////////////////////////////////////////////////////////////////////////////
		System.out.println("How many circles?");
		int num = input.nextInt();
		ArrayList<Circle> radii = new ArrayList<Circle>();
		for (int counter = 0; counter < num; counter++) {
			int circleNum = counter + 1;
			System.out.println("Enter radii for circle " + circleNum + ": ");
			radii.add(new Circle(input.nextDouble()));
		}
		double big = 0;
		for (Circle x : radii) {
			System.out.println(x.area());
		}
		*/
	}

}
