package UserInterface;

import java.io.File;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class ListOfFiles {

	public static void fileList() {

		File directory = new File("C:/LockedMe/");
		if(!directory.exists()) {
			System.out.println("There is no file present. Kindly add files to perform this action.");
			return;
		}
		String[] allFiles = directory.list();
		SortedSet<String> TSet = new TreeSet<String>(); // To arrange the file names in sorted order
		
		for (String s : allFiles) {
			TSet.add(s);
		}
		
		Iterator<String> i = TSet.iterator();
		int count = 1;
		while(i.hasNext()) {
			String str = i.next();
			System.out.println(count+". " + str);
			count++;
		}
		return;
		

	}
}
