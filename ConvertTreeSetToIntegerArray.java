package lab13;

//4. Convert TreeSet to an integer array

import java.util.TreeSet;

public class ConvertTreeSetToIntegerArray {

	public static void main(String args[]) {
		// create TreeSet object
		TreeSet<Integer> treeSet = new TreeSet<Integer>();

		// add elements to TreeSet
		treeSet.add(1);
		treeSet.add(3);
		treeSet.add(2);
		treeSet.add(5);
		treeSet.add(6);
		treeSet.add(7);
		treeSet.add(8);
		treeSet.add(9);
		treeSet.add(10);

		Object[] objArray = treeSet.toArray();
		// display contents of Object array

		System.out.println("Printing TreeSet elements to an Array ..");

		for (int index = 0; index < objArray.length; index++)
			System.out.println(objArray[index]);

	}

}
