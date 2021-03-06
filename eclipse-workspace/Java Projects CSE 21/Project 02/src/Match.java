import java.io.FileNotFoundException;
import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Match {

	public static void main(String[] args) throws IOException{
		Student[] students = new Student[100];
		int snum = 0;
		System.out.print("\nEnter the name of file to open: ");
		Scanner kbd = new Scanner(System.in); 
		String filename = kbd.next(); 
		kbd.close();
		Scanner input = new Scanner(new FileReader(filename));
		while(input.hasNextLine()) {
			Scanner line = new Scanner(input.nextLine());
			line.useDelimiter("[\t-]");
			students[snum] = new Student(line.next(), line.next().charAt(0), new Date(line.nextInt(), line.nextInt(), line.nextInt()), new Preference(line.nextInt(), line.nextInt(), line.nextInt(), line.nextInt()));
			snum++;
			line.close();
		
		}
		input.close();
		//int currentScore;
		//int maxScore = 0;
		//int bestMatchStudent = 0;
		System.out.println("The value of students.getmatchedis " + students[0].getMatched());
		
		for (int i = 0; i<snum; i++){
			if (!students[i].getMatched()){
				int bestScore = 0; int bestMatch = 0;
				for (int j=i+1; j<snum;j++){
					if(!students[j].getMatched()){
						int tmp = students[i].compare(students[j]);
						if (tmp > bestScore){
							bestScore = tmp;
							bestMatch = j;
							
							
						}
					}
				}
				if (bestScore != 0){
					students[i].setMatched();
					students[bestMatch].setMatched();
					System.out.println(students[i].getName() + " matches with " + students[bestMatch].getName() + " with the score " + bestScore);
				} else
					if (!students[i].getMatched())
						System.out.println(students[i].getName() + " has no matches.");
			}
		}
	}
		
		
		
		
}

