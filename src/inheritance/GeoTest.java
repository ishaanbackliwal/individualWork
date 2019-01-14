package inheritance;

import java.util.ArrayList;
 
public class GeoTest {

	public static void main(String[] args) {
		/*	IDK WHAT THIS IS	////////////////////////////////////////////////////////////////////////////////////////////////
		ArrayList<Geo> shape = new ArrayList<Geo>();
		shape.add(new Rectangle());
		shape.add(new Rectangle());
		shape.add(new Rectangle());
		shape.add(new Trap());
		shape.add(new Trap());
		shape.add(new Trap());
		double big = 999999999;
		String type = "";
		for (int counter = 0; counter < 5; counter++) {
			if (shape.get(counter).area() > big) {
				big = shape.get(counter).area();
				if (shape.get(counter) instanceof Rectangle) {
					type = "Rectangle";
				}
				else {
					type = "Trapezoid";
				}
			}
		}
		System.out.println("Type: " + type + "\nBiggest Area: " + big);
		*/
		
		// TESTING STUFF	/////////////////////////////////////////////////////////////////////////////////////////////////
		Parallelogram gru = new Parallelogram();
		System.out.println(gru.toString());
		//
	}

}
