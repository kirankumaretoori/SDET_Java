package assignment2;

//7. Write a program where a method declares that it throws ArithmeticException

public class ArithmeticExceptionProgram {

	public static void main(String[] args) {
		int a = 5;
		int b = 0;

		try {
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			e.printStackTrace();
		}

		finally {
			System.out.println("Arithmetic Exception was thrown in this program");
		}

	}

}
