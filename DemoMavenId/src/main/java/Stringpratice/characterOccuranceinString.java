package Stringpratice;

import java.util.HashMap;
import java.util.Map;

public class characterOccuranceinString {

	public static void main(String[] args) {
		String str = "Helllooo";

		char[] chararray = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (char ct : chararray) {
			if (!map.containsKey(ct)) {
				map.put(ct, 1);
			} else {
				int count = map.get(ct);
				map.put(ct, count + 1);
			}

		}

		System.out.println("the value of Map: " + map);

	}

}
