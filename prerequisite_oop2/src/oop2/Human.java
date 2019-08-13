package oop2;

public class Human {
	String name;
	int age;
	int heightInches;
	String eyeColor;
	String type;

	public Human(String name, int age, int heightInches, String eyeColor, String type) {
		super();
		this.name = name;
		this.age = age;
		this.heightInches = heightInches;
		this.eyeColor = eyeColor;
		this.type = type;
	}

	public void speak() {
		System.out.println("\nHello my name is " + name + ".");
		System.out.println("I am " + heightInches + " inches tall.");
		System.out.println("I am " + age + " years old.");
		System.out.println("My eye color is " + eyeColor + ".");
		System.out.println("I am a " + type + " human.");
	}

	public void eat() {
		System.out.println("Eating...");
	}

	public void walk() {
		System.out.println("Walking...");
	}

	public void work() {
		System.out.println("Working...");
	}
}
