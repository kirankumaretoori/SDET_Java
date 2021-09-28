package lab13;

//1.Create a Set and insert and retrieve values

import java.util.HashSet;

public class SetInsertRetrieve {

	public static void main(String[] args) {
		HashSet<String> s = new HashSet<String>();
		// Inserting values into Set
		s.add("INDIA");
		s.add("UK");
		s.add("USA");
		// Retrieving values from Set
		System.out.println("The values in Set are " + s);

	}

}
