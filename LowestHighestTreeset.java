package lab13;

//3. Get lowest and highest value stored in TreeSet

import java.util.TreeSet;

public class LowestHighestTreeset {

	public static void main(String[] args) {

		// create TreeSet object
		TreeSet<Integer> tSet = new TreeSet<Integer>();

		// add elements to TreeSet
		tSet.add(1);
		tSet.add(3);
		tSet.add(2);
		tSet.add(5);
		tSet.add(4);

		System.out.println("Lowest value Stored in Java TreeSet is : " + tSet.first());

		System.out.println("Highest value Stored in Java TreeSet is : " + tSet.last());

	}
}
