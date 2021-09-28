package assignment3;

//4. Convert keys of a map to a list.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConvertKeyMapList {

	public static void main(String[] args) {

		Map<Integer, String> hm = new HashMap<>();
		hm.put(1, "a");
		hm.put(2, "b");
		hm.put(3, "c");
		hm.put(4, "d");
		hm.put(5, "e");
		System.out.println("Keys before converting to List (Keys in Map):  " + hm.keySet());

		@SuppressWarnings({ "rawtypes", "unchecked" })
		List<Integer> keyList = new ArrayList(hm.keySet());

		System.out.println("Keys after converting to List (Keys in List): " + keyList);

	}

}
