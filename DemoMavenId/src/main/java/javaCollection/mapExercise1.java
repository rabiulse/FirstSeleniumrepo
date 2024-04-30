package javaCollection;

import java.util.HashMap;
import java.util.Map;

public class mapExercise1 {

	// Write a Java Program to count the number of words in a string using HashMap.
	static void prog_count_numberword_string1() {

		String input = "This is is very very";

		System.out.println("Input String: " + input);
		String[] strs = input.split(" ");

		Map<String, Integer> map = new HashMap<String, Integer>();

		for (String str : strs) {
			if (map.containsKey(str)) {
				int count = 1;
				map.put(str, count + 1);

			} else {
				map.put(str, 1);
			}

		}
		System.out.print("map value: " + map);
	}

	static void prog_count_numberword_string2() {

		String input = "This this is is done by Saket Saket";

		System.out.println("Input String: " + input);
		String[] strs = input.split(" ");

		// String stringe = strs[1];
		// System.out.println("Input String: " + stringe);

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < strs.length; i++) {
			boolean repeat = true;
			int count = 1;
			if (map.containsKey(strs[i])) {
				repeat = false;
				map.put(strs[i], count + 1);

			}

			else {
				map.put(strs[i], 1);

			}

		}
		System.out.print(map);

	}

	public static void main(String[] args) {
		prog_count_numberword_string1();
		// prog_count_numberword_string2();
	}

}
