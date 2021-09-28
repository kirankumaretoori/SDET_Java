package lab7;

/*2. Write a program to find the uppercase and
lowercase characters in the string below.
String characters =
AbCdefGHijklMNOpqRstUVwxyZ@%*234     */

class FindUpperCaseLowerCase {
	public static void main(String[] args) {

		String str = "AbCdefGHijklMNOpqRstUVwxyZ@%*234";
		System.out.println("Upper case characters: ");
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				System.out.print(str.charAt(i) + "  ");
			}
		}
		System.out.println("\nLower case characters: ");
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				System.out.print(str.charAt(i) + "  ");
			}
		}
	}
}
