package lab9;

//1.  Write a program with try, catch and finally block

public class TryCatchFinallyProgram {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;

		try {
			int arr[] = new int[6];
			System.out.println(arr[7]);

		}

		catch (ArrayIndexOutOfBoundsException ar) {
			System.out.println("Array out of bounds exception occured");
		}

		try {
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("********An unknown exception occured**********");
		}

		finally {
			System.out.println("Finally block executed");
		}

	}

}
