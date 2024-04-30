package javaCollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class allmethodimplementationHasmap {
//	Write a Java Program to iterate HashMap using While and advance for loop.
	static void iterateHashMap() {

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("rabiul", 2);
		map.put("rabiul2", 4);
		map.put("rabiul7", 8);
		map.put("rabi", 45);
		map.put("nehan", 7);
		map.put("jolly", 38);
		System.out.println(map);

		Iterator itr = map.entrySet().iterator();//

		while (itr.hasNext()) {

			Map.Entry mepa = (Map.Entry) itr.next();// important concept for iterate over the loop
			System.out.println("Key is " + mepa.getKey() + " Value is " + mepa.getValue());

		}

		System.out.println("for loop example");

		for (Map.Entry mp : map.entrySet()) {

			System.out.println("Key is " + mp.getKey() + " Value is " + mp.getValue());

		}

	}

	static void allbasicmethodhashMap() {

		Map<String, Integer> map = new HashMap<String, Integer>();
		// 1 put
		map.put("rabiul", 2);
		map.put("rabiul2", 4);
		map.put("rabiul7", 8);
		map.put("rabi", 45);
		map.put("nehan", 7);
		map.put("jolly", 38);
		System.out.println(map);

		// 2. get the size of the map

		int size = map.size();
		System.out.println(size);

		// 3. checking the empty

		boolean check = map.isEmpty();

		System.out.println(check);

		// 4. remove

		map.remove("rabiul");
		System.out.println(map);
		System.out.println(map.size());

		// 5. get

		Integer getexample = map.get("rabi");

		System.out.println("The value of key rabi:" + getexample);

		// 6. contain key:

		boolean checke2 = map.containsKey("rabi");
		System.out.println("contain key validation:" + checke2);

		// 7. contain value:
		boolean check3 = map.containsValue(39);
		System.out.println("contain value validation: " + check3);

		// 7 clear validations:
		// map.clear();
		System.out.println(map);

		// 8. set key: it will return all the value of Key as Set
		Set<String> setkeyexample = map.keySet();

		System.out.println(setkeyexample);

		// 9. values- it will provide all the key value

		Collection<Integer> mapvalues = map.values();
		System.out.println(mapvalues);

// 10. returns a Set containing all the key-value pairs in the HashMap as Map.Entry objects. 
		Set<Entry<String, Integer>> entryset = map.entrySet();
		System.out.println(entryset);

	}

	public static void main(String[] args) {
		// allbasicmethodhashMap();
		iterateHashMap();

	}
}
