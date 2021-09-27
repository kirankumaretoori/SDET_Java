package assignment1;

/* 5. Write a program to print first 10 prime numbers  */

public class PrimeNumber {

	public static void print_first_10_primes(int n) {

		int i, j, flag;

		System.out.println("First 10 prime numbers are:");

		for (i = 1; i <= n; i++) {

			if (i == 1 || i == 0)
				continue;

			flag = 1;

			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}

			if (flag == 1)
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		int n = 30;

		print_first_10_primes(n);
	}

}
