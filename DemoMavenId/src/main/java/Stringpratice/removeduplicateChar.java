package Stringpratice;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicateChar {

	// Approach#1:
	static void removeduplicate1() {
		String str = "Programminggggg";
		StringBuilder sb1 = new StringBuilder();

		str.chars().distinct().forEach(c -> sb1.append((char) c));
		System.out.println(sb1);

	}

	// Approach #2
	static void removeduplicate2() {
		String str = "Programminggggg";
		StringBuilder sb2 = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int idx = str.indexOf(ch, i + 1);
			if (idx == -1) {
				sb2.append(ch);

			}

		}

		System.out.println("The output from 2nd approach: " + sb2);

	}

	// Approach #3:

	static void removeduplicate3() {
		String str = "Programminggggg";
		StringBuilder sb3 = new StringBuilder();

		char[] arra = str.toCharArray();

		for (int i = 0; i < arra.length; i++) {

			boolean visited = false;

			for (int j = i + 1; j < arra.length; j++) {

				if (arra[i] == arra[j]) {
					visited = true;
					break;
				}

			}
			if (!visited) {
				sb3.append(arra[i]);
			}

		}

		System.out.println("The output from 3rd approach: " + sb3);

	}

	// Approach#4:

	static void removeduplicate4() {
		String str = "Programminggggg";
		StringBuilder sb4 = new StringBuilder();

		Set<Character> set = new LinkedHashSet<Character>();
// string to character  set convert
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));

		}
// Then character Set to String conversion 
		for (Character c : set) {
			sb4.append(c);

		}

		System.out.println("The output from 4th approach: " + sb4);

	}

	public static void main(String[] args) {

		removeduplicate1();
		removeduplicate2();

		removeduplicate3();
		removeduplicate4();

	}

}
