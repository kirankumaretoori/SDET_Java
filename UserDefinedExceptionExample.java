package lab10;

// 1.  Write a program where a user defined  exception is thrown

public class UserDefinedExceptionExample {
	public static void main(String args[]) throws MyException {

		int age = 13;
		if (age < 18)
			throw new MyException("Not Eligible for Voting");
		else
			System.out.println("Eligible for Voting");

	}
}

class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyException(String msg) {
		super(msg);

	}
}
