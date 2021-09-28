package lab3;

public class CalcInterest implements Bank {

	@Override
	public void getInterest() {
		System.out.println("I am implementing interest in Bank interface in CalcInterest class");

	}

	public void testMethod() {
		System.out.println("This method is in CalcInterest class");
	}

	public static void main(String[] args) {

		Bank b = new CalcInterest();
		b.getInterest();

		CalcInterest c = new CalcInterest();
		c.testMethod();

	}

}
