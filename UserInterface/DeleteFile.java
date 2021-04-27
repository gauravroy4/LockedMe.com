package UserInterface;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {

	public static void deleteFile() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the file name to be deleted : ");
		String fileName = scan.next();
		
		File delFile = new File("C:/LockedMe/"+fileName);
		if(delFile.exists()) {
			delFile.delete();
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("File: "+fileName+" deleted successfully.");
			return;
		}
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("***********File Not Found.(Deleting file is case sensitive.)************");

		
		
	}

}
