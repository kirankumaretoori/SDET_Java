package lab12;

// 1. Join two lists using addAll

import java.util.ArrayList;
import java.util.List;

public class AddAllExample {

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);

		List<Integer> b = new ArrayList<Integer>();
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);

		List<Integer> concatenated_list = new ArrayList<Integer>();

		concatenated_list.addAll(a);
		concatenated_list.addAll(b);

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("Concatenated list: " + concatenated_list);
	}

}
