package oop;

public class BankAccount {

	private double balance;
	private int accountN;
	private double intRate;
	
	public BankAccount() {
		balance = -999.0;
		accountN = -999;
		intRate = -999.0;
	}
	public BankAccount(double newBalance, int newAccountN, double newIntRate) {
		balance = newBalance;
		accountN = newAccountN;
		intRate = newIntRate;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double deposit) {
		balance = balance + deposit;
	}
	public void withdraw(double withdraw) {
		balance = balance - withdraw;
	}
	public void addInt(double years) {
		balance = intRate * balance * years + balance;
	}
	public void financeCharge(double charge) {
		balance = balance - charge;
	}

}
