package lab11;

import java.util.ArrayList;

//2. Replace an element at specified index in Arraylist

public class ArrayListReplace {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add("Kiran");
		a.add("Kumar");
		a.add("Etoori");
		System.out.println("Retrieving all the values in the Array List " + a);
		a.set(0, "Kashyap");
		System.out.println("After replacing an element at specified (zero) index " + a);
	}

}
