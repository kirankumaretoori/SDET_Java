package assignment2;

//3. Write a program to check “brown” is present in the string : A brown fox ran away fast

public class CheckString {

	public static void main(String[] args) {
		String strOrig = "A brown fox ran away fast";
		int intIndex = strOrig.indexOf("brown");

		if (intIndex == -1) {
			System.out.println("brown not found");
		} else {
			System.out.println("Found brown at index " + intIndex);
		}
	}

}
