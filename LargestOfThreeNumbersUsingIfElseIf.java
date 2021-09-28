package lab4;

/*1.
 * Write a program to print the largest of three
 * numbers using if
else if*/

public class LargestOfThreeNumbersUsingIfElseIf {

	public static void main(String[] args) {

		int n1 = 100, n2 = 2460, n3 = 30;

		if (n1 > n2 && n1 > n3) {
			System.out.println("largest is " + n1);
		} else if (n2 > n1 && n2 > n3) {
			System.out.println("largest is " + n2);
		} else {
			System.out.println("largest is " + n3);

		}
	}

}
