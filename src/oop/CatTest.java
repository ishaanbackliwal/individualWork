package oop;

public class CatTest {

	public static void main(String[] args) {
		Cat jeremiah = new Cat(5, 12);
		System.out.println("Your cat's age on his next birthday is: " + jeremiah.birthday(5) + " years");
		System.out.println("If your cat sleeps an hour more a day, he will sleep: " + jeremiah.sleepMore(1) + " hours");
		System.out.println("If your cat sleeps an hour less a day, he will sleep: " + jeremiah.sleepLess(1) + " hours");
	}

}
