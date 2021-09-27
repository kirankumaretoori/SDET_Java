package assignment1;

/*3. Write a program to sort the elements of an array in ascending order */

public class SortArrayInAscendingOrder {

	// Declaration global variable length
	static int length;

	// Method to print the array
	public static void printArray(int[] array) {
		// Iterating using for loops
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// Method to sort the array
	public static void sortArray(int[] array) {
		int temporary = 0;

		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i] > array[j]) {
					temporary = array[i];
					array[i] = array[j];
					array[j] = temporary;
				}
			}
		}

		// Displaying elements of array after sorting
		System.out.println("Elements of array sorted in ascending order: ");
		printArray(array);
	}

	// Main driver method
	public static void main(String[] args) {

		int[] array = new int[] { 12, 34, 2, 45, 6, 0, -2, 45, -200, 43, 56, -897 };

		length = array.length;

		// Displaying elements of original array
		System.out.print("Elements of original array: ");

		printArray(array);

		// Call sortArray method
		sortArray(array);
	}

}
