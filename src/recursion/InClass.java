package recursion;

public class InClass {
	
	//
	public static void main(String[] args) {
		System.out.println(sumNum(5));
	}
	public static int sumNum(int num) {
		if (num > 0) {
			return (num + sumNum(num-1));
		}
		return 0;
	}
	//

}
