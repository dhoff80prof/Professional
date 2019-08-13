package practice.loops;

public class Loopies {

	public static void main(String[] args) {

		String str = "We have a large inventory of things in our warehouse falling in "
				+ "the category:apparal and the slightly more in demand category:makeup along with "
				+ "the category:furniture and category:clothes and category:jewelry and category:electronics and category:pets and category:houseware and....";
		
		printCategories(str);

	}

	/*
	 * Extract all categories from the string in the main method with the method
	 * below
	 * Use substring, indexOf, and while loop
	 */

	public static void printCategories(String str) {
		
		String sub1 = str;
		String sub2;
		int subIndex = 0, startIndex = 0;
		while (subIndex != -1) {
			subIndex = sub1.indexOf(":");
			if (subIndex != -1) {
				startIndex = subIndex + 1;
				sub1 = sub1.substring(startIndex);
				startIndex = sub1.indexOf(" ");
				sub2 = sub1.substring(0, startIndex);
				System.out.println(sub2);
			}
		}
		
	}
}
