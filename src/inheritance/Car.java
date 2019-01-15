package inheritance;

public class Car extends Auto{

	private int cupHolders;
	
	public Car(int xCupHolders) {
		cupHolders = xCupHolders;
	}
	public int getCupHolders() {
		return cupHolders;
	}
}
