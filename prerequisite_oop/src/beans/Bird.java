package beans;

public class Bird extends Animal {

	public Bird(String type, String hasTail, int legs, int weight, String foodType) {
		super(type, hasTail, legs, weight, foodType);
	}

	public void move() {
		System.out.println("\n*The bird is jumping around...*");
	}
	
}
