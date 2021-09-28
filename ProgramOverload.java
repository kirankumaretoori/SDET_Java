package lab3;

/*2. Write a program where your class will
 * overload calculatePerimeter () for different shapes, each with different set of parameters, and print the
 * values from each implementation */

public class ProgramOverload {

	public void calculatePerimeter(int a, int b, int c) {
		System.out.println("Perimeter of Triangle is " + (a + b + c));

	}

	public void calculatePerimeter(int l, int w) {
		System.out.println("Perimeter of Rectangle is " + (2 * l + 2 * w));
	}

	public void calculatePerimeter(int s) {
		System.out.println("Perimeter of Square is " + (4 * s));
	}

	public static void main(String[] args) {
		ProgramOverload p1 = new ProgramOverload();
		p1.calculatePerimeter(12, 34, 45);
		p1.calculatePerimeter(20, 30);
		p1.calculatePerimeter(50);
	}

}
