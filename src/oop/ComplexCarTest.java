package oop;

import java.util.Scanner;

public class ComplexCarTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//taking MOMs car to the gas station
		System.out.println("How many miles per gallon does moms car get?");
		double momMPG = input.nextDouble();
		System.out.println("What is the tank capacity for moms car?");
		double momTankCap = input.nextDouble();
		System.out.println("How much fuel is currently in moms car?");
		double momFuel = input.nextDouble();
		System.out.println("How many miles are on moms odometer before going to the gas station?");
		double momInitialOdometer = input.nextDouble();
		System.out.println("How much fuel should we put in moms car?");
		double addFuel = input.nextDouble();
		System.out.println("How many miles away from home is the gas station?");
		double momMiles = input.nextDouble();
		ComplexCar mom = new ComplexCar(momMPG, momTankCap, momFuel, momInitialOdometer);
		double momNewFuel = mom.fillTank(addFuel);
		double momNewOdometer = mom.drive(momMiles);
		System.out.println("Amount of fuel in moms car after going to the gas station: " + momNewFuel + " gallons");
		System.out.println("Miles on moms odometer after going to gas station: " + momNewOdometer + " miles");
		
		//drive DADs car
		System.out.println("How many miles is the drive you are taking in dads car?");
		double dadDrive = input.nextDouble();
		System.out.println("How many miles are on dads odometer before going on the drive?");
		double dadInitialOdometer = input.nextDouble();
		
		//take DADs car to the gas station
		System.out.println("How many miles per gallon does dads car get?");
		double dadMPG = input.nextDouble();
		System.out.println("What is the tank capacity for dads car?");
		double dadTankCap = input.nextDouble();
		System.out.println("How much fuel is in dads car before going to the gas station");
		double dadFuel = input.nextDouble();
		System.out.println("How much fuel should we put in dads car?");
		double addFuelDad = input.nextDouble();
		System.out.println("How many miles away from home is the gas station?");
		double dadMiles = input.nextDouble();
		ComplexCar dad = new ComplexCar(dadMPG, dadTankCap, dadFuel, dadInitialOdometer);
		double dadNewFuel = dad.fillTank(addFuelDad);
		double dadNewOdometer2 = dad.drive(dadMiles);
		double dadNewOdometer1 = dad.drive(dadDrive);
		System.out.println("Miles on dads odometer after going on a drive: " + dadNewOdometer1 + " miles");
		System.out.println("\nAmount of fuel in dads car after going to the gas station: " + dadNewFuel + " gallons");
		System.out.println("Miles on dads odometer after going to gas station: " + dadNewOdometer2 + " miles");
		
		//drive KIDs car
		System.out.println("How many miles per gallon does kids car get?");
		double kidMPG = input.nextDouble();
		System.out.println("What is the tank capacity for kids car?");
		double kidTankCap = input.nextDouble();
		System.out.println("How much fuel is in kids car before going on the drive?");
		double kidFuel = input.nextDouble();
		System.out.println("How many miles is the drive you are taking in kids car?");
		double kidDrive = input.nextDouble();
		System.out.println("How many miles are on kids odometer before going on the drive?");
		double kidInitialOdometer = input.nextDouble();
		ComplexCar kid = new ComplexCar(kidMPG, kidTankCap, kidFuel, kidInitialOdometer);
		double kidNewOdometer1 = kid.drive(dadDrive);
		System.out.println("Miles on kids odometer after going on a drive: " + kidNewOdometer1 + " miles");
	}

}
