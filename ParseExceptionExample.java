package lab9;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*3.   Write a program to throw parseException while parsing a date entered by user. Convert from
dd / yyyy format to yyyy / dd if input is valid   */

public class ParseExceptionExample {

	static void convertDateFormat(String inputDate) {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/yyyy");
			Date date = sdf.parse(inputDate);
			SimpleDateFormat outputsdf = new SimpleDateFormat("yyyy/dd");
			String outputDate = outputsdf.format(date);
			System.out.println("After changing date format to yyyy/dd : " + outputDate);
		} catch (java.text.ParseException e) {
			System.out.println("Some error occurred while converting date formats. Exception is : " + e.toString());
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter date in dd/yyyy format: ");
		String inputDate = scanner.nextLine();
		convertDateFormat(inputDate);
		scanner.close();
	}

}
