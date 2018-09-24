package mathOperators;

import java.util.Scanner;

public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int limit = -999;
		int speed = -999;
		int speedMinusLimit = -999;
		int minusOne = -999;
		int ticket1 = -999;
		int finalTicket = -999;
		System.out.println("What was the speed limit?");
		limit = input.nextInt();
		System.out.println("What speed was the driver going?");
		speed = input.nextInt();
		speedMinusLimit = speed - limit;
		minusOne = speedMinusLimit - 1;
		ticket1 = minusOne * 40;
		finalTicket = ticket1 + 55;
		System.out.println("Speed Limit: " + limit + "mph");
		System.out.println("Driver's Speed: " + speed + "mph");
		System.out.println("Fine: $" + finalTicket + ".00");
	}

}
