package beans;

public class Zoo {

	public static void main(String[] args) {
		
		Animal spar = new Sparrow("air", "do", 2, 3, "worms");
		
		// Can make this sparrow a flyable type sparrow object because it implements the flyable interface
		Flyable spar2 = new Sparrow("air", "do", 2, 4, "bugs");
		
		Animal salmon = new Fish("water", "do", 0, 73, "bugs");
		
		// Cannot use because the animal type does not have the flyable interface implemented
//		spar.fly();
		
		// Passed these objects into the move function
//		spar.move();
//		salmon.move();
		
		
		moveAnimal(spar);
		moveAnimal(salmon);
		spar2.fly();
		
	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
