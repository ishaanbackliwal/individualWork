package inheritance;

import java.util.ArrayList;
import java.util.Random;

public class AutoTest {

	public static void main(String[] args) {
		Random gen = new Random();
		int min = 0;
		int max = 100;
		ArrayList<Auto> chicken = new ArrayList<Auto>();
		chicken.add(new Car(3));
		chicken.add(new Truck(true));
		chicken.get(0).drive(min + gen.nextInt(max - min + 1));
		chicken.get(1).drive(min + gen.nextInt(max - min + 1));
		System.out.println("Car... \nOdometer: " + chicken.get(0).getOdo() + " miles");
		System.out.println("MPG: " + chicken.get(0).getMPG());
		System.out.println("Num of cup holders: " + ((Car)chicken.get(0)).getCupHolders());
	    System.out.println("\nTruck... \nOdometer: " + chicken.get(1).getOdo() + " miles");
		System.out.println("MPG: " + chicken.get(1).getMPG());
		int num = 0;
		if (((Truck)chicken.get(1)).getFourWD() == true) {
			num++;
		}
		System.out.println("Number of trucks w/ 4WD: " + num);
	}
}
