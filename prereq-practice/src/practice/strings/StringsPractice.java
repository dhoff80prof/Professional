package practice.strings;

public class StringsPractice {

	public static void main(String[] args) {
//		System.out.println("Hello World!");
		
		String a = "hello";
		String b = "there";
		
		// Cannot compare objects by using '==' instead use the .equals() method
		if (a == "hello") {}
		
		// This is a proper comparison of two 'string' objects
		if (a.equals("hello")) {
			
		}
			
		if (b.equals("there")) {
			System.out.println("Printed: there");
		}
		
		if (b.equalsIgnoreCase("There"))
		{
			System.out.println("Printed: there because of the equalsIgnoreCase method used");
		}
		
		System.out.println(a.charAt(3));
		
		// Will throw a stringindexoutofbounds exception; same with a negative number as the charat index
		// System.out.println(a.charAt(13));
		
		String str = "Hello yogi there yogi there";
		
		int x = str.indexOf("yogi");
		
		int y = str.lastIndexOf("yogi");
		
		System.out.println(x + " " + y);
	}

}
