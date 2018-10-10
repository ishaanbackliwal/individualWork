package oop;

public class CircleTest {

	public static void main(String[] args) {
		//default constructor
		Circle ball = new Circle();
		System.out.println("Ball radius: " + ball.getRadius());
		System.out.println("Ball circumference: " + ball.circumference());
		System.out.println("Ball area: " + ball.area());
		ball.changeRadius(14.5);
		System.out.println("Changed radius of ball: " + ball.getRadius());
		
		//alternate constructor
		ball = new Circle(14.5);
		System.out.println("Ball radius: " + ball.getRadius());
		System.out.println("Ball circumference: " + ball.circumference());
		System.out.println("Ball area: " + ball.area());
		ball.changeRadius(14.5);
		System.out.println("Changed radius of ball: " + ball.getRadius());
	}

}
