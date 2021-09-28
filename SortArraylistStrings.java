package assignment3;

//7. Sort ArrayList of Strings alphabetically.

import java.util.ArrayList;
import java.util.Collections;

public class SortArraylistStrings {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Kiran");
		a.add("Kumar");
		a.add("Etoori");
		System.out.println("Before sorting the values in the Array List: " + a);
		Collections.sort(a);
		System.out.println("After sorting the values in the Array List: " + a);
	}

}
