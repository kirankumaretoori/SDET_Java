package lab14;

//1. Check a particular key exists in hashmap

import java.util.HashMap;

public class KeyExistsHashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Kiran");
		hm.put(1, "Kumar");
		hm.put(2, "Etoori");
		hm.put(3, "Kashyap");

		boolean a = hm.containsKey(23);

		if (a == true) {
			System.out.println("Key Exists");
		} else {
			System.out.println("Key doesn't exists");
		}
	}

}
