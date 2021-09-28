package lab7;

/*5.Write a program to replace character ‘P’ with ‘F’ in the String:
“Pan Pun Prank Pit Pat"   */

public class ReplaceCharacter {

	public static void main(String[] args) {
		String s = "Pan Pun Prank Pit Pat";
		String s1 = s.replace('P', 'F');
		System.out.println("original String: " + s);
		System.out.println("String after replacing the character 'P' with 'F': " + s1);

	}

}
