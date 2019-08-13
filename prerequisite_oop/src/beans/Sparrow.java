package beans;

public class Sparrow extends Bird implements Flyable{

	public Sparrow(String type, String hasTail, int legs, int weight, String foodType) {
		super(type, hasTail, legs, weight, foodType);
	}

	@Override
	public void fly() {
		System.out.println("\n*Flying...*");
	}

}
