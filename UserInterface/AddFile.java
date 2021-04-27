package UserInterface;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AddFile {

	public static void addFile() throws IOException {

		Scanner scan = new Scanner(System.in);

		String name;
		System.out.print("Enter the file name : ");
		name = scan.nextLine();

		try {
			File folder = new File("C:/LockedMe");
			if (!folder.exists()) {
				if (folder.mkdirs()) {

					System.out.println("A folder with name: 'LockedME' has been created at " + folder);
				}
			}
		} finally {
			File fout = new File("C:/LockedMe/" + name);
			if (!fout.exists()) {
				fout.createNewFile();
				String content;
				System.out.println("Enter the content to be written in the file: ");
				content = scan.nextLine();
				FileWriter writer = new FileWriter(fout);
				writer.write(content);
				System.out.println("File created successfully.");
				writer.flush();
				writer.close();
				System.out.println("----------------------------------------------------------------------------------");

			} else {
				System.out.println("File name: " + name + " already exists.");
			}

		}

	}

}
