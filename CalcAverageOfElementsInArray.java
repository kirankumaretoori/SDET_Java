package lab6;

/*1.
Write a program to calculate the average
of the elements in an array  */

public class CalcAverageOfElementsInArray {

	static double average(int a[], int n) {

		// Find sum of array element
		int sum = 0;

		for (int i = 0; i < n; i++)
			sum += a[i];

		return (double) sum / n;
	}

	// driver code
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };
		int n = arr.length;

		System.out.println("The average of the elements in the array is  " + average(arr, n));
	}

}
