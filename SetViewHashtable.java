package assignment3;

//8. Get Set view of keys from HashTable

import java.util.Enumeration;
import java.util.Hashtable;

public class SetViewHashtable {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "One");
		ht.put(2, "Two");
		ht.put(3, "Three");
		Enumeration<Integer> e = ht.keys();

		System.out.println("Getting Set View of keys from Hashtable...");
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
