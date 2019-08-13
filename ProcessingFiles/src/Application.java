import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
	static String conCatText = "";

	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//
//		for (int i = 0; i <= 3; i++) {
//			System.out.println("Enter Some Text: ");
//			String enteredText = scan.nextLine();
//
//			conCatText += " " + enteredText + "\n";
//
//			System.out.println(conCatText);
//		}
//		scan.close();
		
		File file = new File("myfile.txt");
		
		try {
			Scanner scan = new Scanner(file);
			
			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				System.out.println(line);
			}
			
			scan.close();
		} catch (FileNotFoundException e) {
			System.out.println("File does not exist.");
			e.printStackTrace();
		} 

	}

}
