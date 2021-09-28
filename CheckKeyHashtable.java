package assignment3;

//3. Check a particular key exists in HashTable

import java.util.Hashtable;

public class CheckKeyHashtable {

	public static void main(String[] args) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(0, "hello");
		ht.put(1, "Gudbye");
		ht.put(2, "morning");
		ht.put(3, "evening");
		System.out.println("Printing all the keys  " + ht.keySet());
		boolean b = ht.containsKey(1);
		if (b == true) {
			System.out.println("The key exists in Hashtable");
		}

		else {
			System.out.println("Key doesn't exists in Hashtable");
		}
	}

}
