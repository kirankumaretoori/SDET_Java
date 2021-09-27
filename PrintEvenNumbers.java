package assignment1;

/* 9. Write a program to print only even numbers till 50 */

public class PrintEvenNumbers {

	public static void main(String args[]) {
		int n = 50;
		System.out.print("Even Numbers till 50 are: ");
		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
