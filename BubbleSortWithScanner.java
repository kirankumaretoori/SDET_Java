package lab7;

import java.util.Scanner;

/*  1.Write a program to sort the Strings in the array: (Bubble Sort) String
str [] = Ciaz , Alto, Swift, Dezire , Brezza
Try with user input also, using
Scanner.nextLine  */

public class BubbleSortWithScanner {

	public static void main(String[] input) {
		int i, j;
		String temp;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

		String names[] = new String[6];

		System.out.print("Enter 5  Car Models : ");
		for (i = 0; i < 6; i++) {
			names[i] = scan.nextLine();
		}

		System.out.println("\nSorting Car Model names in Alphabetical Order...\n");
		for (i = 0; i < 6; i++) {
			for (j = 1; j < 6; j++) {
				if (names[j - 1].compareTo(names[j]) > 0) {
					temp = names[j - 1];
					names[j - 1] = names[j];
					names[j] = temp;
				}
			}
		}

		for (i = 0; i < 6; i++) {
			System.out.println(names[i]);
		}
	}

}
