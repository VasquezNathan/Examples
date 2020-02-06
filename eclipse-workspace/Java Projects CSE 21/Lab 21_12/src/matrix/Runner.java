package matrix;

import java.util.ArrayList;

import static matrix.MatrixMultiply.*;

public class Runner {

	
	public static void main(String[] args) {
		
		testMatrix("data/RESULT1.txt");
		testMatrix("data/RESULT2.txt");
		testMatrix("data/RESULT3.txt");
		
	}
	


	// enter filenames such as "data/matrix1.txt"
	public static void testMatrix(String output) {
		int[][] mat1 = readMatrix();
		printMatrix(mat1);
		int[][] mat2 = readMatrix();
		printMatrix(mat2);
		int[][] mult = multiply(mat1, mat2);
		writeMatrix(mult,  output);
		System.out.println("Wrote results to " + output);
		printMatrix(mult);
		
	}
	
	
}
