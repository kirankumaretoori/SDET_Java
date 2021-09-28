package lab4;

/*2.
 * Write a program to check whether a
 * character is a vowel or consonant using
switch case */

public class VowelOrConsonantUsingSwitchCase {

	public static void main(String[] args) {
		char v = 'z';
		switch (v) {
		case 'a':

		case 'e':

		case 'i':

		case 'o':

		case 'u':
			System.out.println("Given letter is a vowel");
			break;
		default:
			System.out.println("Given letter is a consonant");
			break;

		}
	}

}
