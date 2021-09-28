package lab1;

/* 1. Write a program to calculate the area and
perimeter of a rectangle*/

public class CalRectangle {

	double length;
	double width;

	// Area Method to calculate the area of Rectangle
	void calculateArea() {
		double area;
		area = length * width;
		System.out.println("Area of rectangle is : " + area);
	}

	/*
	 * Perimeter Method to calculate the Perimeter of Rectangle
	 */

	void calculatePerimeter() {
		double perimeter;
		perimeter = 2 * (length + width);
		System.out.println("Perimeter of rectangle is : " + perimeter);
	}

	public static void main(String args[]) {
		CalRectangle rect = new CalRectangle();

		// Assigning the value in the length variable of
		// Rectangle Class
		rect.length = 15.854;

		// Assigning the value in the width variable of
		// Rectangle Class
		rect.width = 22.65;

		System.out.println("Length = " + rect.length);
		System.out.println("Width = " + rect.width);

		// Calling of Area method of Rectangle Class
		rect.calculateArea();

		// Calling of Perimeter method of Rectangle Class
		rect.calculatePerimeter();
	}
}
