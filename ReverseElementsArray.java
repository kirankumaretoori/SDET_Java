package assignment1;

/*8.  Write a program to reverse the elements of an array where the array size as
well as the array values are entered by the user */

public class ReverseElementsArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Length of the array: " + arr.length);

		System.out.println("Original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		System.out.println("Array in reverse order: ");

		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
