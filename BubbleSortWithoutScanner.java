package lab7;

/*1.  Write a program to sort the Strings in the array: (Bubble Sort) String
str [] = Ciaz , Alto, Swift, Dezire , Brezza
Try with user input also, using
Scanner.nextLine  */

public class BubbleSortWithoutScanner {

	public static void main(String[] args) {
		String str[] = { "Ciaz", "Alto", "Swift", "Dezire", "Brezza" };
		String temp;
		System.out.println("Strings in sorted order:");
		for (int j = 0; j < str.length; j++) {
			for (int i = j + 1; i < str.length; i++) {
				// comparing adjacent strings
				if (str[i].compareTo(str[j]) < 0) {
					temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			}
			System.out.println(str[j]);
		}
	}
}
