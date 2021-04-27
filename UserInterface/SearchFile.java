package UserInterface;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchFile {

	public static void searchFile() throws IOException {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter File Name to search : ");
		String fileName = scan.next();

		File directory = new File("C:/LockedMe/" + fileName);

		if (directory.exists()) {
			System.out.println("File name: " + directory.getName());
			System.out.println("Location of the file: " + directory.getAbsolutePath());
			System.out.println("Writeable: " + directory.canWrite());
			System.out.println("Readable: " + directory.canRead());
			System.out.println("File size: " + directory.length() + " bytes");

			FileReader reader = new FileReader(directory); // To read the contents of file
			int ch;
			System.out.print("Contents of this file: ");
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);
			}
			reader.close();
			System.out.println();

		} else {
			System.out.println("File not Found. Please enter correct file name.(Searching file is case sensitive.)");
		}
	}

}
