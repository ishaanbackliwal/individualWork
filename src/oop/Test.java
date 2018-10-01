package oop;

public class Test {

	public static void main(String[] args) {

		Greeter bob = new Greeter();
		Friend joe = new Friend();
		Friend jenny = new Friend();
		Friend billy = new Friend();
		Friend sammy = new Friend();
		Friend kyle = new Friend();
		Dog doggy = new Dog();
		bob.sayHello();
		bob.sayHello();
		bob.sayHello();
		joe.sayMessage();
		bob.sayHello();
		billy.sayMessage();
		kyle.sayMessage();
		doggy.woof();
		doggy.attack();
	}

}
