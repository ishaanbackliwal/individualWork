package decisions;

public class PerfectNums {

	public static void main(String[] args) {
		int counter = 0;
		int num = 0;
		int sum = 0;
		for (counter = 1; counter <= 1000; counter++) {
			for (num = 1; num < counter; num++) {
				if (counter % num == 0) {
					sum += num;
				}
			}
			if (sum == counter) {
				System.out.println(counter);
			}
			sum = 0;
		}
	}

}
