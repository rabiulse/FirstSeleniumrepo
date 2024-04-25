package DemoMaven.DemoMavenId;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class arrayListExercise {

	// remove the duplicate element from ArrayList
	// solution- convert the Arraylist object to set collection
	//

	static void removeduplicateElementfromArrayList() {

		ArrayList<String> arrayList = new ArrayList<String>();

		arrayList.add("banana");
		arrayList.add("apple");
		arrayList.add("mangot");
		arrayList.add("apple");
		arrayList.add("orange");
		arrayList.add("orange1");

		String first = arrayList.get(0);

		int totalsize = arrayList.size();
		String last = arrayList.get(totalsize - 1);
		System.out.println(first + ":  This is first element");
		System.out.println(last + ":  This is last element");
		System.out.println(totalsize + ":  totalsize ");

		System.out.println(arrayList);

		Set<String> setexample = new HashSet<String>(arrayList);

		// setexample.addAll(arrayList);
		System.out.println(setexample);

		for (String value : setexample) {
			System.out.print(":" + value);
		}
// Other solution is to check all the element one by one in arrayList;

		for (int i = 0; i < arrayList.size(); i++) {
			for (int j = 1; j < arrayList.size() - 1; j++) {
				if (arrayList.get(i).equals(arrayList.get(j))) {
					arrayList.remove(j);

				}

			}

		}

		System.out.println(arrayList);

	}

	static void reverseArrayList() {

		ArrayList<String> arraylist2 = new ArrayList<String>();
		arraylist2.add("rabiul");
		arraylist2.add("ha");
		arraylist2.add("uzzamandg");
		arraylist2.add("nehan");

		System.out.println("ArrayList: " + arraylist2);
		Collections.reverse(arraylist2);

		System.out.println("New order ArrayList: " + arraylist2);

		for (int i = 0; i < arraylist2.size(); i++) {

			if (arraylist2.get(i).length() == 1)

			{
				arraylist2.remove(i);
				System.out.println("ArrayList: " + arraylist2);
			}

		}
		System.out.println("ArrayList: " + arraylist2);

	}

	static void OperationperformedonArrayList() {

		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("rabiul2");
		arrayList.add("ed");
		arrayList.add("dgrt");

		System.out.println("ArrayList: " + arrayList);
// adding element in the specific position: 
		arrayList.add(2, "Newlyadded");

		System.out.println("ArrayList: " + arrayList);
// modifying the element in the specific position: 
		arrayList.set(2, "Newlyadded_change");
		System.out.println("ArrayList: " + arrayList);

		// removing the element from Arraylist:

		arrayList.remove(0);

		System.out.println("ArrayList: " + arrayList);

		arrayList.remove("dgrt");
		System.out.println("ArrayList: " + arrayList);

		// Iterating the ArrayList

		arrayList.add("rabiul2");
		arrayList.add("ed");
		System.out.println("ArrayList: " + arrayList);

	}

	public static void main(String[] args) {
		// Problem Statement#1:
		// How to remove duplicates from ArrayList in Java?
		// removeduplicateElementfromArrayList();
		// Problem Statement #2:
		// How to reverse ArrayList in Java?

		// reverseArrayList();

		// Problem Statement #3:

		// https://www.java67.com/2015/06/20-java-arraylist-interview-questions.html
		OperationperformedonArrayList();
	}

}
