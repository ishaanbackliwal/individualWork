package inheritance;

public class BallTest {

	public static void main(String[] args) {
		Basketball bob = new Basketball();
		System.out.println(bob.method1());
		System.out.println(bob.method2());
		System.out.println(bob.method3());
		
		Ball round = new Ball();
		System.out.println(round.method1());
		System.out.println(round.method2());
		
		Box things = new Box();
		System.out.println(things.method1());
		System.out.println(things.method2());
		System.out.println(things.method3());
		System.out.println(things.method5());
	}

}
