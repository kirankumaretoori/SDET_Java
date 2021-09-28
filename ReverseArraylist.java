package assignment3;

//2. Reverse an Arraylist

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArraylist {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Kiran");
		a.add("Kumar");
		a.add("Etoori");
		System.out.println("Before reversing the Array List " + a);
		Collections.reverse(a);
		System.out.println("After reversing the Array List " + a);

	}

}
