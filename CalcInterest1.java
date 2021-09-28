package lab3;

public class CalcInterest1 implements Bank {

	@Override
	public void getInterest() {
		System.out.println("I am implementing Bank inteface in CalcInterest1 class");

	}

	public void testMethod() {
		System.out.println("This method is in CalcInterest1 class");
	}

	public static void main(String[] args) {
		Bank b1 = new CalcInterest1();
		b1.getInterest();

		CalcInterest1 c1 = new CalcInterest1();
		c1.testMethod();

	}

}
