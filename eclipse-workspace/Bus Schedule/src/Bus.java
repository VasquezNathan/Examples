import java.util.*;
import java.io.*;
public class Bus {

	public static void main(String[] args) {
		Schedule schedule = new Schedule() ;
		
		try {
		Scanner input = new Scanner(new FileReader("Data/file.txt"));
		String a = input.nextLine();
		System.out.println("The word in the file is: " + a);
		
		
		
		
		
		}
		catch(NoSuchElementException e) {
			System.out.println(e);
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
	}

}
