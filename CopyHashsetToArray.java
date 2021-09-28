package assignment3;

//5. Copy all elements of a HashSet to an Object array

import java.util.HashSet;
import java.util.Set;

public class CopyHashsetToArray {

	public static void main(String args[]) {
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(25);
		hs.add(34);
		hs.add(44);
		hs.add(65);
		hs.add(12);
		hs.add(78);
		hs.add(10);
		hs.add(32);
		System.out.println("Elements in set = " + hs);
		System.out.println("Copying all elements to an Object array...");
		Object[] obArr = hs.toArray();
		for (Object ob : obArr)
			System.out.println(ob);
	}

}
