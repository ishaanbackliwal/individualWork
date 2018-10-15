package oop;

public class WorkerTest {

	public static void main(String[] args) {
		//default constructor
		Worker jaquan = new Worker();
		System.out.println("Number of hours worked: " + jaquan.getHours());
		System.out.println("Rate of pay: " + jaquan.getPay());
		jaquan.setHours(12);
		System.out.println("Set amount of hours worked: " + jaquan.getHours());
		jaquan.setPay(15.75);
		System.out.println("Set rate of pay: " + jaquan.getPay());
		jaquan.payCheck();
		System.out.println("Pay check amount: $" + jaquan.getPay());
		jaquan.setRaise(2.25);
		System.out.println("Rate of pay with a raise: $" + jaquan.getPay());
		
		//default constructor
		jaquan = new Worker(35, 15.7);
		System.out.println("Number of hours worked: " + jaquan.getHours());
		System.out.println("Rate of pay: " + jaquan.getPay());
		jaquan.setHours(12);
		System.out.println("Set amount of hours worked: " + jaquan.getHours());
		jaquan.setPay(15.75);
		System.out.println("Set rate of pay: " + jaquan.getPay());
		jaquan.payCheck();
		System.out.println("Pay check amount: $" + jaquan.getPay());
		jaquan.setRaise(2.25);
		System.out.println("Rate of pay with a raise: $" + jaquan.getPay());
	}

}
