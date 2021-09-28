package assignment2;

/*6.   Write a program to throw NumberFormatException and handle it appropriately with proper message.
If you pass invalid input to parseInt (str), this exception will be thrown   */

import java.util.Scanner;

public class NumberFormatExceptionProgram {

	public static void main(String[] arg) {
		int number;

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.println("Enter any valid Integer: ");

			try {

				number = Integer.parseInt(sc.next());

				System.out.println("You entered: " + number);

				break;
			}

			catch (NumberFormatException e) {

				System.out.println("NumberFormatException occured");
				sc.close();
			}
		}
	}

}
