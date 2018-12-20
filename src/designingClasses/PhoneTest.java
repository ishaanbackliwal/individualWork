package designingClasses;

import java.util.ArrayList;
import java.util.Random;

public class PhoneTest {

	public static void main(String[] args) {
		Random generator = new Random();
		ArrayList<PhoneClass> kool = new ArrayList<PhoneClass>();
		int min = 0;
		int max = 10;
		int minsUsed = 0;
		for (int counter = 0; counter < 500; counter++) {
			kool.add(new PhoneClass("1111111111", minsUsed));
			for (int counter2 = 0; counter2 < 300; counter2++) {
				kool.get(counter).makeCall(min + generator.nextInt(max - min + 1));
			}
		}
		System.out.println(kool.get(499).clone().toString());
	}

}
