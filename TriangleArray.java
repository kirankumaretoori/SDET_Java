package assignment1;

/*10. Write a program to print this output using two dimensional array :
Triangle Array
0
00
000
0000
00000
000000
0000000
00000000
000000000
0000000000         */

public class TriangleArray {
	public static void printStars(int n) {
		int i, j;

		for (i = 0; i < n; i++) {

			for (j = 0; j <= i; j++) {
				// printing zeros
				System.out.print("0");
			}

			System.out.println();
		}
	}

	public static void main(String args[]) {
		int n = 10;
		printStars(n);
	}
}
