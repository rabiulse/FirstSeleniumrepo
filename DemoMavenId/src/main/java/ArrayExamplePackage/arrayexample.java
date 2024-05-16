package ArrayExamplePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class arrayexample {
// Example of array and it element: 
	static void arraexample() {

		// Initialization of Integer array
		int[] array = new int[] { 2, 5, 3, 4, 7 };
		int[] array1 = new int[] { 2, 5, 3, 4, 3, 8, 9 };

		List<int[]> result3 = Arrays.asList(array1);
		System.out.print(result3);
		for (int i = 0; i < result3.size(); i++) {
			System.out.print(result3.get(i));
		}
		System.out.println(" --------------");

		for (int j = 0; j < array.length; j++)

		{
			System.out.print(array[j] + " - ");
		}

		System.out.println(" ||||| ");

		// Initialization of character array..

		char[] chararray = new char[] { '9', '5', 'r', 'y', 't', 'a' };

		char[] result1 = Arrays.copyOf(chararray, 10);

		System.out.println("Integer Array of copied " + Arrays.toString(result1));

		int result = Arrays.compare(array, array1);
		System.out.println("result of two array :" + result);

		System.out.print("Print and display the array element: " + Arrays.toString(chararray) + "\n");

		Arrays.sort(chararray);
		int value = Arrays.binarySearch(array, 7);
		System.out.println(" Value of Binary serach: " + value);

		System.out.println("Print and display the sorted  array element: ");
		for (int j = 0; j < chararray.length; j++)

		{
			System.out.print(chararray[j] + " ");

		}

		List<String> list1 = new ArrayList<>(2);
		list1.add("Apples");
		list1.add("Apples");
		list1.add("Apples2");
		list1.add("Apples1");

		System.out.print("\n Arralist with Duplicate:  " + list1 + "\n");

		String[] arr = new String[list1.size()];

		// converting the array using the get method:
		for (int i = 0; i < list1.size(); i++) {
			arr[i] = list1.get(i);

		}
		System.out.println("Converting the list to array:");
		for (String str : arr) {
			System.out.print(str + " ");
		}

		// System.out.println("Converting the list to array:" + arr);

		System.out.print("\nconvert array list to Array:  " + arr + "\n");

		Set<String> set1 = new HashSet<String>();
		set1.addAll(list1);

		System.out.println("Removed the duplicate: " + set1);
		int count = 0;

		/*
		 * for (int i = 0; i < list1.size(); i++) {
		 * 
		 * for (int j = 1; j <= list1.size(); j++) { {
		 * 
		 * if (list1.get(j).equalsIgnoreCase(list1.get(i))) { list1.remove(j);
		 * 
		 * } }
		 * 
		 * } }
		 */

		System.out.print("\n " + list1 + "\n");
		list1.set(1, "newvalue");
		System.out.println(" " + list1);
		list1.remove(2);
		System.out.println(" " + list1);
		String firstelement = list1.get(0);

		System.out.println(" " + firstelement);

	}

	static void listToArray() {

		List<Integer> listexample = new ArrayList<Integer>();

		listexample.add(20);
		listexample.add(56);
		listexample.add(89);

		System.out.println(" " + listexample);
		// now convert the List To array

		// int[] array = new int[listexample.size()];

		Integer[] arr = new Integer[listexample.size()];

		arr = listexample.toArray(arr);

		for (int i = 0; i < listexample.size(); i++) {

			System.out.print(" " + arr[i]);
		}

		System.out.print("\n");

		// Convert the String list to Array
		List<String> liststr = new ArrayList<>();

		liststr.add("Rabiul");
		liststr.add("Hasan");
		liststr.add("Uzzaman");
		liststr.add("Nehan");

		System.out.println(" " + liststr);

		String[] arrstr = new String[liststr.size()];

		arrstr = liststr.toArray(arrstr);

		for (int i = 0; i < liststr.size(); i++) {

			System.out.print(" " + arrstr[i]);
		}

		System.out.print("\n");

	}

	static void ArrayToList() {

		// converting the Array to List

		int[] intarray = new int[] { 3, 5, 6, 8 };
		List<Integer> list234 = new ArrayList<>();
		for (int i = 0; i < intarray.length; i++) {
			list234.add(intarray[i]);

		}

		System.out.print("\n" + list234);

		// another method to convert the Integer Array toList

		Integer[] intarray1 = new Integer[] { 3, 5, 6, 8, 5, 7, 8 };

		List<Integer> listInteger = Arrays.asList(intarray1);

		System.out.print("\n" + listInteger);

		// another method to convert the String Array toList

		String[] srtaray = new String[] { "Rabiul", "hasan", "nehan" };

		List<String> listStr = Arrays.asList(srtaray);

		System.out.print("\n" + listStr);

	}

	public static void main(String[] args) {
		// arraexample();
		// listToArray();// Conversion of List to Array element:
		ArrayToList();// Conversion of array element to List:

	}

}
