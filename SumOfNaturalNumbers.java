package assignment1;

/*7. Write a program to print the sum of first 20 natural numbers */

public class SumOfNaturalNumbers {

	static int findSum(int n) {
		int sum = 0;
		for (int x = 1; x <= n; x++)
			sum = sum + x;
		return sum;
	}

	public static void main(String args[]) {
		int n = 20;
		System.out.println("The sum of first 20 natural numbers is " + findSum(n));
	}

}
