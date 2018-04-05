package p2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("newNames.txt");
		Scanner kb = new Scanner(System.in);
		Scanner fileScanner;
		boolean fileNotFound = true;
		do {
			System.out.println("Enter a file name to open: ");
			String fileName = kb.nextLine();
			File file = new File(fileName);
			fileScanner = null;
			try {
				fileScanner = new Scanner(file);
				fileNotFound = false;
			} catch (FileNotFoundException e) {
				System.out.println("The file is not found");
			} 
		} while (fileNotFound);
		while (fileScanner.hasNextLine()) {
			String name = fileScanner.nextLine();
			System.out.println(name);
			pw.println(name);
		}
		pw.close();
		System.out.println("Done!");

	}

}
