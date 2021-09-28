package assignment2;

// 4. Write a program to convert String to a character array and character array to String

public class StringToCharacterArray {

	public static String toString(char[] a) {

		String string = new String(a);

		return string;
	}

	public static void main(String args[]) {

		String str = "ConvertStringToCharacterArray";

		char[] ch = str.toCharArray();

		System.out.println("***** Printing String to Character Array ************");
		for (char c : ch) {
			System.out.println(c);
		}

		char s[] = { 'c', 'h', 'a', 'r', 'a', 'c', 't', 'e', 'r', 'a', 'r', 'r', 'a', 'y', 't', 'o', 's', 't', 'r', 'i',
				'n', 'g' };

		System.out.println("***** Printing Character array to String ************");
		System.out.println(toString(s));
	}

}
