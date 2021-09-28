package lab4;

/* 3.Write a program to check whether the no. entered from user 
 * is positive or negative  */

public class NumberPositiveOrNegative {

	public static void main(String[] args) {
		int n = 123;
		if (n > 0) {
			System.out.println(n + " is a positive number");
		} else if (n < 0) {
			System.out.println(n + " is a negative number");
		} else {
			System.out.println(n + " is neither positive nor negative");
		}
	}

}
