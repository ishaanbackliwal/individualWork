package interfaces;

import java.util.ArrayList;

public class PersonTest {

	public static void main(String[] args) {
		// ACTIVITY ONE 
		ArrayList<Person> mhm = new ArrayList<Person>();
		double sum = 0;
		double small = 999999999;
		for (int counter = 0; counter < 5; counter++) {
			mhm.add(new Teacher());
		}
		for (int counter = 5; counter < 10; counter++) {
			mhm.add(new Student());
		}
		for (int counter = 0; counter < 10; counter++) {
			System.out.println(mhm.get(counter).getName());
		}
		for (int counter = 0; counter < 10; counter++) {
			String name = mhm.get(counter).getName();
			if (name.length() > 10) {
				System.out.println(mhm.get(counter).getAge());
			}
			if (mhm.get(counter) instanceof Student) {
				Student chicken = (Student) mhm.get(counter);
				chicken.outSick();
			}
		}
		
		//
	}

}
