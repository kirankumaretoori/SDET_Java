package lab8;

/*1.  Write a program to compare two strings and check
if they are equal  */

public class StringEqual {

	public static void main(String[] args) {
		String str1 = "ABD";
		String str2 = "ABD";
		boolean b;
		b = str1.equals(str2);
		// System.out.println(b);
		if (b == true) {
			System.out.println("Two strings are equal");
		} else {
			System.out.println("Two strings are not equal");
		}

	}

}
