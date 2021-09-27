package assignment1;

/* 1. Write a program to calculate the factorial of a number using while loop */

public class FactorialOfNumber {

	public static void main(String[] args) {

		int number = 5;
		long fact = 1;
		int i = 1;
		while (i <= number) {
			fact = fact * i;
			i++;
		}
		System.out.println("Factorial of " + number + " is: " + fact);
	}

}
