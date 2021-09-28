package lab8;

/*2. Write a program to append Strings using
StringBuilder and StringBuffer  */

public class StringBuilderBuffer {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("ABD is legend");
		sb.append(" in cricket");
		System.out.println(sb);

		StringBuffer sbuf = new StringBuffer("ABD");
		sbuf.append(" is legend");
		System.out.println(sbuf);

	}

}
