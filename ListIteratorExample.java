package lab12;

/*2. Add books to a List and then, read the list of books 
using ListIterator , in both backward and forward
directions */

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] argv) throws Exception {

		// Creating object of ArrayList<Integer>
		ArrayList<String> arrlist = new ArrayList<String>();

		// adding books to arrlist
		arrlist.add("book A");
		arrlist.add("book B");
		arrlist.add("book C");
		arrlist.add("book D");

		// print arrlist
		System.out.println("ArrayList: " + arrlist);

		// Creating object of ListIterator<String>
		// using listIterator() method
		ListIterator<String> iterator = arrlist.listIterator();

		// Printing the iterated value
		System.out.println("\nPrinting ListIterator Forward:\n");
		while (iterator.hasNext()) {
			System.out.println("Value is : " + iterator.next());
		}
		System.out.println("\nPrinting ListIterator backward:\n");
		while (iterator.hasPrevious()) {
			System.out.println("Value is : " + iterator.previous());
		}
	}

}
