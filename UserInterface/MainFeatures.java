package UserInterface;

import java.io.IOException;

public class MainFeatures {

	public static void features(int option) throws IOException {
		
		switch (option) {
		case 1:
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("List of all existing files :- ");
			ListOfFiles.fileList();
			break;
		case 2 :
			FileOperations.fileOperations();
			break;
			
		case 3:
			System.out.println();
			System.out.println("Closing the Application...");
			return;
		default:
			System.out.println();
			System.out.println("Invalid Choice.Please try again.");
			System.out.println();
			break;
		}

	}

}
