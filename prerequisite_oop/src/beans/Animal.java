package beans;

public abstract class Animal {
	String type;
	String hasTail;
	int legs;
	int weight;
	String foodType;

	public Animal(String type, String hasTail, int legs, int weight, String foodType) {
		super();
		this.type = type;
		this.hasTail = hasTail;
		this.legs = legs;
		this.weight = weight;
		this.foodType = foodType;
	}

	public void speak() {
		System.out.println("\nI am a " + type + " type of animal.");
		System.out.println("I " + hasTail + " have a tail.");
		System.out.println("I have " + legs + " legs.");
		System.out.println("I weigh " + weight + " lbs.");
		System.out.println("I eat " + foodType + ".");
	}
	
	public void eat() {
		System.out.println("\nI just ate some " + foodType + ".");
	}
	
	public void sleep () {
		System.out.println("\n*Sleeping...*");
	}
	
	public abstract void move();
}
