package DemoMaven.DemoMavenId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setExercise {

	static void addItemsonSet() {

		System.out.println("Set example start: ");

		// Add item in set

		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(3);
		set1.add(8);
		set1.add(9);
		set1.add(3);

		System.out.println("Set1 example start: " + set1);
		set1.contains(1);

		System.out.println("Set example start: " + set1.contains(3));
		// initialize the array of Integer Type
		Integer[] array1 = new Integer[] { 64, 6, 8, 2 };
		Set<Integer> set3 = new HashSet<Integer>();
		// adding the integer array to Set
		set3.addAll(Arrays.asList(array1));

		System.out.println("set3 example : " + set3);

		Set<Integer> set2 = new HashSet<Integer>();
		set2.addAll(Arrays.asList(new Integer[] { 3, 7, 2, 8, 9 }));
		System.out.println("set2 example: " + set2);

		List<Integer> list3 = new ArrayList<Integer>();

		list3.add(5);
		list3.add(7);
		list3.add(9);
		list3.add(89);
		Set<Integer> set4 = new HashSet<Integer>();
		set4.addAll(list3);

		System.out.println("set4 example: " + set4);

		// to find union operator

		Set<Integer> union = new HashSet<Integer>(set2);
		union.addAll(set3);
		System.out.println("union example: " + union);

		Set<Integer> intersect = new HashSet<Integer>(set2);

		intersect.retainAll(set3);
		System.out.println("intersect example: " + intersect);

		Set<Integer> diffrence = new HashSet<Integer>(set2);
		diffrence.removeAll(set3);
		System.out.println("Difference " + diffrence);

	}

	public static void main(String[] args) {
		addItemsonSet();

	}

}
