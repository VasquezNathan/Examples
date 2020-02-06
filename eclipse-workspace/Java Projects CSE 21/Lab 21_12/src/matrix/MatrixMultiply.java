package matrix;

import java.util.*;
import java.io.*;
import java.util.NoSuchElementException;

public class MatrixMultiply{

	
	public static int[][] readMatrix(){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the file name: ");
		String filename = input.next();
		
		return readMatrix(filename);
		
	}
	
	
	
	
	
	
	public static int[][] readMatrix(String filename) {
		// Fill-in
		int i = 0; int j = 0;
		int arr[][] = null;
		try {
			Scanner line = new Scanner(new FileReader(filename));
			//line.useDelimiter("[\t]");
			
			i = line.nextInt();
			j = line.nextInt();
			
			arr = new int[i][j];
			for(int k = 0; k < i; k++) {
				for(int l = 0; l < j; l++) {
					arr[k][l] = line.nextInt();
				}
			}
			
			line.close();
			
			
			
		}
		catch(NoSuchElementException e) {
			System.out.println(e);
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		return arr;
		 // delete this
	} 


	
	
	// writes a matrix to the file
	public static void writeMatrix(int[][] matrix, String filename) {
		PrintWriter out = null;
		try{
			out = new PrintWriter(filename);
		}
		catch(FileNotFoundException e){
			System.out.println(e);
		}
		
		for(int i = 0; i < matrix.length; i++) {	
			for(int j = 0; j < matrix[0].length; j++) {
				out.print(matrix[i][j] + "\t");
			}
			out.println();
		}
		
		// Fill-in
		out.close();
	}
	
	
	
	
	// returns the multiplied matrix
	public static int[][] multiply(int[][] m1, int[][] m2) {

		int m1rows = m1.length;
		int m1cols = m1[0].length;
		int m2rows = m2.length;
		int m2cols = m2[0].length;
		int[][] result = new int[m1rows][m2cols];
		for (int i = 0; i < m1rows; i++) {
			for (int j = 0; j < m2cols; j++) {
				for (int k = 0; k < m1cols; k++) {
					result[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		return result;
	}


	
	
	// prints a matrix
	public static void printMatrix(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		for (int i=0; i<rows; i++) {
			for (int j=0; j<cols; j++) {
				// 'format' will print 5 spaces no matter what, which will 
				// help line things up.
				System.out.format("%5d ", matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	

	

}
