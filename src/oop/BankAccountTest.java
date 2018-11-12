package oop;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//input for balance, account number, and current interest rate
		System.out.println("What is the balance in your savings account?");
		double savBalance = input.nextDouble();
		System.out.println("What is the balance in your checkings account?");
		double checkBalance = input.nextDouble();
		System.out.println("What is your 6 digit account number?");
		int accountN = input.nextInt();
		System.out.println("What is the interest rate at the moment? Enter the decimal version of the percentage");
		double intRate = input.nextDouble();
		
		//savings account object
		BankAccount savage21 = new BankAccount(savBalance, accountN, intRate);
		savage21.deposit(100.0);
		System.out.println("New savings account balance after $100.0 deposit: $" + savage21.getBalance());
		savage21.addInt(4);
		System.out.println("New savings account balance following addition of interest after 4 years: $" + savage21.getBalance());
		
		//checking account object
		BankAccount luke = new BankAccount(checkBalance, accountN, 0.18);
		luke.withdraw(1000.0);
		System.out.println("\nNew checking account balance after $1000.0 withdrawl: $" + luke.getBalance());
		luke.financeCharge(250.0);
		System.out.println("New checking account balance after $250.0 finance charge: $" + luke.getBalance());
	}

}
