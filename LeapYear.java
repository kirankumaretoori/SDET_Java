package assignment1;

/*4. Write a program to check current year is leap year or not  */

public class LeapYear {

	public static void main(String[] args) {
		// year to leap year or not
		int year = 1979;
		System.out.println();
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			System.out.println(year + " is a leap year");
		else
			System.out.println(year + " is not a leap year");
		System.out.println();
	}
}
