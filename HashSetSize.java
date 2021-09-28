package lab13;

//2. Get Size of a HashSet

import java.util.HashSet;

public class HashSetSize {

	public static void main(String[] args) {
		HashSet<String> s = new HashSet<String>();
		// Inserting values into Set
		s.add("INDIA");
		s.add("UK");
		s.add("USA");
		s.add("UK");
		s.add("INDIA");
		// Retrieving size of HashSet which exclude duplicates values
		System.out.println("The size of HashSet is  " + s.size());

	}

}
