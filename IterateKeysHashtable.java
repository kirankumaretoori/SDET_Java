package lab14;

//2. Iterate through keys of a hashtable

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IterateKeysHashtable {

	public static void main(String[] args) { // TODO Auto-generated method stub

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(0, "hello");
		ht.put(1, "Gudbye");
		ht.put(2, "morning");
		ht.put(3, "evening");
		Set<Entry<Integer, String>> sn = ht.entrySet();
		Iterator<Entry<Integer, String>> it = sn.iterator();

		System.out.println("Iterating through keys of hashtable....");
		while (it.hasNext()) {

			@SuppressWarnings("rawtypes")
			Map.Entry mp = (Map.Entry) it.next();
			System.out.println(mp.getKey());

		}
	}

}
