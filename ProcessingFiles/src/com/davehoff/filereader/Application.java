package com.davehoff.filereader;

import java.io.*;

public class Application {

	public static void main(String[] args) {

		File file = new File("myfile.txt");

		BufferedReader br = null;
		
		FileReader fr = null;

		try {
			fr = new FileReader(file);

			br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {

				System.out.println(line);

				line = br.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			// e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error while reading file." + file.getName());
			// e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				
				if (fr != null) {
					fr.close();
				}

			} catch (IOException e) {
				System.out.println("Error while closing the buffered reader.");
			}
		}

	}

}
