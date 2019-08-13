package beans;

public class Fish extends Animal {
	public Fish(String type, String hasTail, int legs, int weight, String foodType) {
		super(type, hasTail, legs, weight, foodType);
	}

	public void swim() {
		System.out.println("\n*Swimming...*");
	}

	public void move() {
		System.out.println("\n*The fish is swimming around...*");
	}
}
