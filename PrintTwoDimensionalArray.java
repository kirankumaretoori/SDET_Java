package lab6;

/*2. Write a program to print the elements of a
two dimensional array */

public class PrintTwoDimensionalArray {

	public static void printTwoDimensional(int mat[][]) {
		// Loop through all rows
		for (int[] row : mat)

			// Loop through all columns of current row
			for (int x : row)
				System.out.print(x + " ");
	}

	public static void main(String args[])

	{
		int mat[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		printTwoDimensional(mat);
	}

}
