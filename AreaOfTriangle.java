package assignment1;

/*6.  Write a program to calculate area of triangle. User will enter the values for
base and height of the triangle */

public class AreaOfTriangle {

	static double area(double h, double b) {

		// area of a triangle
		return (h * b) / 2;
	}

	public static void main(String[] args) {

		// Height of the triangle
		double h = 20;

		// Base of the triangle
		double b = 15;

		System.out.println("Area of the triangle: " + area(h, b));
	}

}
