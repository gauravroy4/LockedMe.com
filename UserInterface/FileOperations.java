package UserInterface;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FileOperations {
	
	static void fileOperations() throws IOException {
		
		while (true) {
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("Business-level Operations");
			System.out.println("=========================");
			System.out.println("1. Add a new file.");
			System.out.println("2. Delete an existing file.");
			System.out.println("3. Search a file.");
			System.out.println("4. GoTo Main Menu.");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.print("Please Enter your choice to perform a file operation: ");
			
			Scanner scan = new Scanner(System.in);
			try {
			int option = scan.nextInt();
			System.out.println("----------------------------------------------------------------------------------");
			
			switch (option) {
			case 1:
				AddFile.addFile();
				break;
			case 2:
				DeleteFile.deleteFile();
				break;
			case 3:
				SearchFile.searchFile();
				break;
			case 4 : 
				
				return;
			default:
				System.out.println();
				System.out.println("Invalid Choice.Please try again.");
				System.out.println();
				break;
			}
		} catch(InputMismatchException e) {
			System.out.println("**********Invalid Choice.Please try again.************");
			break;
		}
		}
			
	}

}
