package lab14;

//3. Remove key value pair from a hashtable

import java.util.Hashtable;

public class RemoveKeyValueHashtable {

	public static void main(String[] args) { 

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(0, "hello");
		ht.put(1, "Gudbye");
		ht.put(2, "morning");
		ht.put(3, "evening");
		System.out.println("Printing before removing key value pair  " + ht);
		ht.remove(1);
		System.out.println("Printing after removing a key value pair  " + ht);

	}

}
