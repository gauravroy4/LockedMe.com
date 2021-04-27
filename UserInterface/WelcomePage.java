package UserInterface;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WelcomePage {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int option;
		
		System.out.println("..................................................................................");
		System.out.println("                           Welcome to LockedMe.com                               ");
		System.out.println("");
		System.out.println("           Developed By: Gaurav Kumar                          ");
		System.out.println("           Contact details: roygaurav000@gmail.com             ");
		System.out.println("");
		System.out.println("..................................................................................");

		while (true) {
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("Main Menu");
			System.out.println("=========");
			System.out.println("1. List of all the existing files in Ascending order.");
			System.out.println("2. To perform Add, Delete & Search file Operations.");
			System.out.println("3. Exit Application.");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.print("Please Enter your choice: ");
			try {
				option = (Integer)scan.nextInt();
				MainFeatures.features(option);
			
			} catch(InputMismatchException e) {
				System.out.println("         Invalid Choice.Please try again.        ");
				break;	
			}
			
		}
	}
	
}

