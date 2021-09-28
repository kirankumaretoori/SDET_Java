package lab11;

import java.util.ArrayList;

// 1. Create an ArrayList and insert and retrieve value at a specified index

public class ArrayListInsertAndRetrieve {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(12);
		a.add(15);
		a.add(16);
		a.add(19);
		a.add(25);
		System.out.println("Printing all the values in the ArrayList  " + a);
		a.add(5, 76);
		System.out.println("Printing the values after inserting value at specific index " + a);
		int b = a.get(4);
		System.out.println("Printing/retrieving value at specific index from the ArrayList " + b);
	}

}