package lab10;

//2. Write a program to handle multiple exceptions

public class MultipleExceptionExample {

	public static void main(String[] args) {
		try {
			int number[] = new int[10];
			number[11] = 30 / 30;
		} catch (ArithmeticException e) {
			System.out.println("Zero cannot divide any number");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of size of the array");
		}
	}
}
