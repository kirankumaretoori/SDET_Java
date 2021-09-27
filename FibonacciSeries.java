package assignment1;

/*2. Write a program to print Fibonacci series (10 values) */

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		System.out.println("Fibocacci series for 10 values: ");
		System.out.println(a);
		System.out.println(b);
		int c;
		for (int i = 2; i <= 9; i++) {
			c = a + b;
			a = b;
			b = c;

			System.out.println(c);
		}

	}

}
