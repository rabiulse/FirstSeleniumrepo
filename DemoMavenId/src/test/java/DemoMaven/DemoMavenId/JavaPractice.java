package DemoMaven.DemoMavenId;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JavaPractice {

	public static void main(String[] args) {
		// Program #1 to find out the largest number

		// findoutlargetnumber();
		// Reverse();
		// totallowerCaseUpperCase();
		// arraylistpratice();
		hashmapexercise();
	}

	// Reverse the given String ::
	private static void Reverse() {

		String Myname = "RAbiul";
		System.out.println("Given String :" + Myname);

// Convert that string to character array

		char[] str = Myname.toCharArray();
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i]);
		}

		System.out.println("");

	}

	// Find out the largest number:

	private static void findoutlargetnumber() {
		System.out.println("Hello Java Program: First program Addition of two numner");
		int a = 10;
		int b = 20;
		int sum;
		sum = a + b;
		System.out.println("Sum is : " + sum);
		System.out.println("2nd program for find out the largest number");
		int largest;
		largest = a > b ? a : b;
		System.out.println("lagest number is : " + largest);

	}

	// Program to find out total number of lower case and upper case in a given
	// String
	private static void totallowerCaseUpperCase() {
		System.out
				.println("Program #3: Program to find out total number of lower case and upper case in a given String");

		String S = "    Myname israbiul   ";
		String withoutSpace = S.strip();

		System.out.println("Given String: " + S);
		System.out.println("After Trimming space: " + withoutSpace);
		int upper = 0;
		int lower = 0;

		for (int i = 0; i < withoutSpace.length(); i++) {
			char ch = withoutSpace.charAt(i);
			if (ch >= 65 && ch <= 90) {
				upper++;

			} else {
				lower++;

			}

		}
		System.out.println("lower numner " + lower);
		System.out.println("upper numner " + upper);

	}

//----------  array List-----
	private static void arraylistpratice() {
		List<String> List = new ArrayList<String>();
		List.add("Rabiul");
		List.add("hasan");
		List.add("uzzaman");

		System.out.println(List);
		System.out.println(List.indexOf("uzzaman"));

		List.set(2, "ruman");
		System.out.println("After adding on erecord:" + List);
		String get2nditem = List.get(1);
		System.out.println("Get 2nd item:" + get2nditem);

		// looping through Iterator object present in Iterator
		Iterator<String> atr = List.iterator();

		while (atr.hasNext()) {
			System.out.println(atr.next());

		}

		// looping through the for each loop of the list element.
		System.out.println("Looping through the for each loop");
		for (String counter : List) {

			System.out.println(counter);

		}

		Collections.addAll(List, "Ruman1", "Ruman2");

		// List.clear();
		System.out.println("After clearing the record:" + List);

		String[] str = { "Ruman3", "Ruman4" };
		Collections.addAll(List, str);
		System.out.println("After 2nd adding the record:" + List);
	}

	// HashMap exercise..

	private static void hashmapexercise() {

		HashMap<Integer, String> keyvalue = new HashMap<Integer, String>();
		keyvalue.put(1, "Rabiul");
		keyvalue.put(2, "Rabiul1");
		keyvalue.put(3, "Rabiul3");
		System.out.println("Hashmap record:" + keyvalue);
		System.out.println("Initial list of elements:");

		for (Map.Entry m : keyvalue.entrySet()) {
			System.out.println(m.getKey() + "    " + m.getValue());
		}

		keyvalue.replace(3, "RabiulUpdte");

		System.out.println("Updated  list of elements:");

		for (Map.Entry m : keyvalue.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
