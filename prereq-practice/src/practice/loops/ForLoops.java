package practice.loops;

public class ForLoops {

	public static void main(String[] args) {
		
//		String name = "a;lkje;jfe;diow";
//		
//		for (int i = name.length() -1 ; i >= 0; i--) {
//			System.out.println("Char: " + name.charAt(i));
//		}
		
//		for (int i = 0; i <= 100; i++) {
//			if (i % 2 == 0) {
//				System.out.println("even: " + i);
//			} else {
//				System.out.println("odd: " + i);
//			}
//		}
		
		for (int idx = 0; idx < 100; idx++) {
			
			for(int jdx = 0; jdx < 10; jdx++) {
				System.out.println("The value of idx was: " + idx + " and the value of jdx: " + jdx); 
			}
			
		}

	}

}
