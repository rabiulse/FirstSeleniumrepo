package DemoMaven.DemoMavenId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Base.Log;

public class stringPractice {

	public static void main(String[] args) {
		test();
		// Program #1 to find out the largest number
		// arraypractise();// find the duplicate value is given array and store then in
		// list
		// smallestNumberinArray();// find the smallest number in array
		// sceondndsmallestarry();

		// cipyallementtoanotherarray();
		// frequencyofeachemenet();
		// left_rotate_element_of_array();

		// print_duplicate_element();
		// print_element_array();

		// findoutlargetnumber();
		// Reverse();
		// totallowerCaseUpperCase();
		// arraylistpratice();
		// hashmapexercise();
		// twogivenstringcomapre();

		// samecharacterinstring();
		// concatstring();

		// removeparticularcharFromString();

		// SplitString();
		// insertNewString();
		// calculateevenNumber();
		// print_all_element_reverse_order();
		// print_element_even_position();
		// print_largest_element_array();
		// print_number_of_elements_array();
		// print_sum_all_items_array();
		// right_rotate_element();
		// sort_ascending_order();
		// sort_descending_order();
		// find_third_largest_number();
		// remove_duplicate_element_array();

		int arr[] = { 10, 20, 20, 30 };
		int length = arr.length;
		// printing original array elements
		System.out.print("original array: \n");
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}
		length = removeDuplicateElements(arr, length);
		// printing array elements
		System.out.print("\nremoved duplicate  array element : \n");
		for (int i = 0; i < length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static void test() {

		int x = 10;
		// int y= ++(++x);

		// System.out.printf(y);

	}

	public static int removeDuplicateElements(int arr[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int[] temp = new int[n];
		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[n - 1];
		// Changing original array
		for (int i = 0; i < j; i++) {
			arr[i] = temp[i];
		}
		return j;
	}
	// 21) Java Program to Remove Duplicate Element in an array

	private static void remove_duplicate_element_array() {
		int[] array = new int[] { 4, 7, 4, 5, 8, 3, 98, 56, 3, 89 };

		int lenght = array.length;
		int temp;

		System.out.print("original array: \n");
		for (int i = 0; i < lenght; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.print(" \n");

		// logic to remove the duplicate element from the array:

		for (int i = 0; i < lenght; i++) {

			for (int j = i + 1; j < lenght - 1; j++) {
				if (array[i] == array[j]) {
					lenght = lenght - 1;
					// array[lenght - 1] = array[j];
				}
			}
		}

		// System.out.print("First Highest number:" + array[0] + "\n");
		System.out.print("after removing: \n");
		for (int i = 0; i < lenght; i++) {
			System.out.print(array[i] + " ");

		}

	}

	private static void sort_ascending_order() {

		int[] array = new int[] { 4, 7, 5, 8, 3, 98, 56 };

		int lenght = array.length;
		int temp;

		System.out.print("original array: \n");
		for (int i = 0; i < lenght; i++) {
			System.out.print(array[i] + " ");

		}

		System.out.print(" \n");
		// logic for ascending order:
		for (int i = 0; i < lenght; i++) {
			for (int j = i + 1; j < lenght; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}

		}
		System.out.print("acesending  array: \n");
		for (int i = 0; i < lenght; i++) {
			System.out.print(array[i] + " ");

		}

	}

	// 13)Java Program to right rotate the elements of an array

	private static void right_rotate_element() {
		int[] array = new int[] { 4, 7, 5, 8, 98, 56, 98 };

		int lenght = array.length;
		int n = 1;// rotate the number of times:

		System.out.print("original array: \n");
		for (int i = 0; i < lenght; i++) {
			System.out.print(array[i] + " ");

		}

		// logic for right rotate of the element

		// 4, 7, 5, 8, 98, 56, 98

		for (int i = 0; i < n; i++) {
			int j, last;
			last = array[lenght - 1];
			for (j = lenght - 1; j > 0; j--) {
				array[j] = array[j - 1];// sift one place to right:
				// 8,98,56,

			}
			array[0] = last;
		}

		System.out.print("\nrotate array: \n");
		for (int i = 0; i < lenght; i++) {
			System.out.print(array[i] + " ");

		}

	}

	// 12) Java Program to print the sum of all the items of the array

	private static void print_sum_all_items_array() {
		int[] array = new int[] { 4, 6, 6, 8, 9 };
		int lenght = array.length;
		int sum = 0;
		for (int i = 0; i < lenght; i++) {
			sum = sum + array[i];

		}
		System.out.println("Total sum of array items: " + sum);

	}

	// 11) Java Program to print the number of elements present in an array

	private static void print_number_of_elements_array() {
		int[] array = new int[] { 4, 6, 7, 89 };
		int lenght = array.length;
		System.out.println("The total lenth of the array: " + lenght);

	}

	// Java Program to print the largest element in an array

	private static void print_largest_element_array() {
		int[] array = new int[] { 4, 7, 5, 8, 98, 56, 9876 };

		int lenght = array.length;
		int max = array[0];
		int min = array[0];
		System.out.print("original array: \n");
		for (int i = 0; i < lenght; i++) {
			System.out.print(array[i] + " ");

		}
		// System.out.print("largest number in array: \n");
		for (int k = 0; k < lenght; k++) {
			if (array[k] > max) {
				max = array[k];

			}

		}
		System.out.print("\n" + max + ":is the largest element:\n");

		for (int k = 0; k < lenght; k++) {
			if (array[k] < min) {
				min = array[k];

			}

		}
		System.out.print(min + ":is the smallest element:");

	}

	// Java Program to print the elements of an array present on even position
	private static void print_element_even_position() {
		int[] array = new int[] { 4, 5, 7, 8, 9, 89, 8, 7 };

		int lenght = array.length;

		System.out.println("Original array:");
		for (int i = 0; i < lenght; i++) {
			System.out.print(array[i] + " ");
		}

		// logic for printing the element at even position:
		System.out.println("\nprint the elements of an array present on even position");
		for (int j = 1; j < lenght; j = j + 2) {
			System.out.print(array[j] + " ");
		}

		// logic for printing the element at odd position:
		System.out.println("\nprint the elements of an array present on ODD position");
		for (int k = 0; k < lenght; k = k + 2) {
			System.out.print(array[k] + " ");
		}

	}

	// Program to print the elements of an array in reverse order
	private static void print_all_element_reverse_order() {
		int[] array = new int[] { 4, 5, 7, 8, 9, 89 };

		int lenght = array.length;

		System.out.println("Original array:");
		for (int i = 0; i < lenght; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println("\nreverse  array:\n");

		for (int k = (lenght - 1); k >= 0; k--) {
			System.out.print(array[k] + " ");

		}

	}

	// 1) Java Program to copy all elements of one array into another array

	private static void cipyallementtoanotherarray() {

		int[] sourcearray = new int[] { 2, 7, 9, 7, 9 };
		int arraylenght = sourcearray.length;

		int[] targetarray = new int[sourcearray.length];

// coping the element from source element to target element: 
		for (int i = 0; i < arraylenght; i++) {
			targetarray[i] = sourcearray[i];
		}

		// printing the first element:

		System.out.println("printing the first element:");

		for (int i = 0; i < arraylenght; i++) {
			System.out.print(sourcearray[i] + " ");

		}

		// printing the first element:

		System.out.println("\nprinting the 2nd array ");

		for (int i = 0; i < arraylenght; i++) {
			System.out.print(targetarray[i] + " ");

		}

	}

	// Program to find the frequency of each element in the array

	private static void frequencyofeachemenet() {

		int[] array = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };

		int[] fr = new int[array.length];

		int arraylenght = array.length;

		// logic for frequency for each element

		int visited = -1;

		for (int i = 0; i < arraylenght; i++) {
			int count = 1;
			for (int j = i + 1; j < arraylenght; j++) {
				if (array[i] == array[j]) {
					count++;
					// To avoid count the same element again:
					fr[j] = visited;
				}

			}
			if (fr[i] != visited) {
				fr[i] = count;

			}
		}

		// Displays the frequency of each element present in array
		System.out.println("---------------------------------------");
		System.out.println(" Element | Frequency");
		System.out.println("---------------------------------------");
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] != visited) {
				System.out.println("    " + array[i] + "    |    " + fr[i]);
			}
		}
		System.out.println("----------------------------------------");

	}

	// Program to left rotate the elements of an array

	public static void left_rotate_element_of_array() {

		int[] array = new int[] { 4, 5, 7, 8, 9, 34 };
		int arraylenght = array.length;

		// printing the original array element:
		System.out.println("Printing the orignal array element: ");

		for (int i = 0; i < arraylenght; i++) {
			System.out.print(array[i] + " ");

		}
		int n = 1;

		// logic to left rotate the element of array:

		for (int i = 0; i < n; i++) {
			int j, first;
			first = array[0];// store the first element

			for (j = 0; j < arraylenght - 1; j++) {
				array[j] = array[j + 1];// shifting the array element
			}

			array[j] = first;
		}

		System.out.println("\nPrinting the new array element: ");
		for (int i = 0; i < arraylenght; i++) {
			System.out.print(array[i] + " ");

		}

	}

	// Exercise- 3 Program to print the duplicate elements of an array

	private static void print_duplicate_element() {

		int[] array = new int[] { 3, 5, 6, 3, 8, 5, 9, 8 };
		List<Integer> list = new ArrayList<Integer>();

		int arraylenght = array.length;
		// printing the original array element:
		System.out.println("Printing the orignal array element:\n ");

		for (int i = 0; i < arraylenght; i++) {
			System.out.print(array[i] + " ");

		}

		// logic printing the duplicate value and store in the list

		for (int i = 0; i < arraylenght; i++) {

			for (int j = i + 1; j < arraylenght; j++) {
				if (array[i] == array[j]) {
					list.add(array[j]);
					// System.out.println("\nPrinting the duplicate element: " + array[j]);
				}

			}

		}
		System.out.println("\nPrinting the duplicate  element: " + list);

	}

	private static void arraypractise() {

		int[] givenaaary = { 45, 67, 34, 56, 56, 34, 12 };

		int lenght = givenaaary.length;

		// System.out.println(givenaaary[2]);
		System.out.println(lenght);
		List<Integer> additem = new ArrayList<Integer>();

		for (int i = 0; i < lenght - 1; i++) {
			for (int j = i + 1; j < lenght - 1; j++) {
				if (givenaaary[i] == givenaaary[j]) {
					additem.add(givenaaary[j]);

				}

			}

		}
		System.out.println(additem);

	}

	// Program to print the elements of an array
	private static void print_element_array() {

		int[] array = new int[] { 3, 5, 6, 3, 8, 5, 9, 8 };

		int arraylenght = array.length;
		// printing the array element:
		System.out.println("Printing the  array element:\n ");

		for (int i = 0; i < arraylenght; i++) {
			System.out.print(array[i] + " ");

		}

	}

	private static void smallestNumberinArray() {

		int[] givenaaary = { 45, 67, 34, 12, 56, 67, 87, 89, 7, 90, 1 };

		int lenght = givenaaary.length;
		System.out.println("Total Lenght: " + lenght);
		List<Integer> additem = new ArrayList<Integer>();

		int min = givenaaary[0];

		for (int i = 0; i < lenght; i++) {
			if (givenaaary[i] < min) {
				min = givenaaary[i];

			}

		}
		System.out.println("MinimumValue: " + min);

		Arrays.sort(givenaaary);// Sort the array in the Arrays functions

		System.out.println("height number: " + givenaaary[lenght - 1]);

		for (int j = lenght - 1; j >= 0; j--) {
			additem.add(givenaaary[j]);

		}
		System.out.println("Sort order and store in List " + additem);

	}

	private static void sceondndsmallestarry()

	{
		// initialize the integer array

		int[] arr = { 4, 5, 7, 5, 2, 1, 9, 34 };

		// first identify the smallest number:

		int smallest = arr[0];
		int arraylength = arr.length;

		for (int i = 0; i < arraylength; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}

		}
		System.out.println(" new smallest number: " + smallest);

		// now find the 2nd minimum number:
		int newseondminimum = arr[0];

		for (int j = 0; j < arraylength; j++) {
			if (arr[j] < newseondminimum && arr[j] > smallest) {
				newseondminimum = arr[j];
			}
		}

		System.out.println(" new 2nd lsrgest number: " + newseondminimum);

		// now find the 3rd minimum number:

		int thirdminimum = arr[0];

		for (int k = 0; k < arraylength; k++) {
			if (arr[k] < thirdminimum && arr[k] > smallest && arr[k] > newseondminimum) {
				thirdminimum = arr[k];
			}
		}
		System.out.println(" new 3rd lsrgest number: " + thirdminimum);

	}

	// Reverse the given String ::
	private static void Reverse() {

		String Myname = "RAbiul";

		String Mynameq = "RAbiulhasanuzzaman";
		System.out.println("Given String" + Mynameq);
		System.out.println("Given String :" + Myname);
		StringBuffer sb = new StringBuffer(Mynameq);
		StringBuffer newrevere = sb.reverse();
		System.out.println("Reverse String: " + newrevere);

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
		largest = a > b ? a : b;// ternary operate
		System.out.println("lagest number is : " + largest);

	}

	// Program to find out total number of lower case and upper case in a given
	// String
	private static void totallowerCaseUpperCase() {
		System.out.println("Program to find out total number of lower case and upper case in a given String");

		String S = "MYNameqwe";
		String withoutSpace = S.strip();

		System.out.println("Given String: " + S);
		System.out.println("After Trimming space at aleading and traling " + withoutSpace);
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
		System.out.println("lower number count " + lower);
		System.out.println("Upper number count " + upper);

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

	// Problem statement : Two given string is same or not
	private static void twogivenstringcomapre() {
		String st1 = "My name is rabiul";
		String st2 = "My name is rabiul";
		System.out.println("Given name1: " + st1);
		System.out.println("Given name1:" + st2);

		boolean verifytwostring = false;
		verifytwostring = st1.equals(st2);
		System.out.println(st1 + " & " + st2 + " =" + verifytwostring);

	}

// concatenation of  two string
	private static void concatstring() {
		String st1 = "Rabiul";
		String st2 = "HasanUzzaman";
		System.out.println("Given name1: " + st1);
		System.out.println("Given name1:" + st2);
		String ConcatSt = st1.concat(st2);

		System.out.println("Concate String " + ConcatSt);

	}

// Problem statement: Removed particular character from given string; 
	private static void removeparticularcharFromString() {

		String Str = "RabiulHasan";
		int pos = 4;

		// String newStr = Str.substring(0, pos) + " " + Str.substring(pos + 1);

		String newStr = Str.substring(0, pos) + Str.substring(pos + 1);
		System.out.println(newStr);

	}

//Problem statement: Character count in the given string : 
	private static void samecharacterinstring() {
		String st1 = "RabiulHasanUzzaman";
		String uppercase = st1.toUpperCase();

		System.out.println("Given String: " + st1);
		System.out.println(" Upper case " + uppercase);

		// find out the letter in the 0th position:
		int k = uppercase.charAt(0);
		int l = st1.charAt(4);

		System.out.println("The letter in the fifth position " + l);

		char[] ch = st1.toCharArray();// Convert the string to character array
		int counter = 0;
		for (int i = (ch.length - 1); i >= 0; i--) {

			if (ch[i] == 'R') {
				counter++;

			}

		}
		System.out.println("Total a character  counter is  in given string:  " + st1 + " is: " + counter);
	}

	// How to split a string into a number of substrings in Java
	private static void SplitString() {
		Log.info("Split String test");
		String str = "jan:feb:march12:test";
		String[] str1 = str.split(":");

		for (String srt2 : str1) {
			System.out.println(srt2);

		}

	}

	// write a program to insert a new String to the original String.
	public static void insertNewString()

	{
		String Original = "RabiulUzzaman";
		String toBeInserted = "Hasan";
		int index = 6;
		StringBuffer strbuffer = new StringBuffer(Original);
		// StringBuffer ReverserStr = strbuffer.reverse();
		StringBuffer newString = strbuffer.insert(9, toBeInserted);
		System.out.println("Original String: " + Original);
		System.out.println("Inserted Sting: " + toBeInserted);
		System.out.println("New updated String: " + newString);

	}

	// Find out the even number :

	public static void calculateevenNumber() {
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Even number: ");
		for (int i = 0; i < number; i++) {
			if (i % 2 == 0) {
				System.out.println(i);

			}

		}

	}

}
