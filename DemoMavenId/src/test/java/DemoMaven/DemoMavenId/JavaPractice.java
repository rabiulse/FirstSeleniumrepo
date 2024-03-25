package DemoMaven.DemoMavenId;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Base.Log;

public class JavaPractice {

	public static void main(String[] args) {
		// Program #1 to find out the largest number

		// findoutlargetnumber();
		// Reverse();
		// totallowerCaseUpperCase();
		// arraylistpratice();
		// hashmapexercise();
		// twogivenstringcomapre();

		// samecharacterinstring();
		//// concatstring();

		// removeparticularcharFromString();

		SplitString();
		// insertNewString();
		// calculateevenNumber();
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
		largest = a > b ? a : b;// ternary operate
		System.out.println("lagest number is : " + largest);

	}

	// Program to find out total number of lower case and upper case in a given
	// String
	private static void totallowerCaseUpperCase() {
		System.out.println("Program to find out total number of lower case and upper case in a given String");

		String S = "    Myname isRAbiul   ";
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
		System.out.println("lower number count " + upper);

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

		String newStr = Str.substring(0, pos) + " " + Str.substring(pos + 1);
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

		System.out.println("The letter in the fifth position " + (char) l);

		char[] ch = st1.toCharArray();// Convert the string to character array
		int counter = 0;
		for (int i = (ch.length - 1); i >= 0; i--) {

			if (ch[i] == 'a') {
				counter++;

			}

		}
		System.out.println("Total character  counter is  in given string:  " + st1 + " is: " + counter);
	}

	// How to split a string into a number of substrings in Java
	private static void SplitString() {
		Log.info("Split String test");
		String str = "jan:feb:march:test";
		String[] str1 = str.split(":");

		for (String srt2 : str1) {
			System.out.println(srt2);

		}

	}

	// write a program to insert a new String to the original String.
	public static void insertNewString()

	{
		String Original = "Rabiul Uzzaman";
		String toBeInserted = "Hasan";
		int index = 6;
		StringBuffer strbuffer = new StringBuffer(Original);
		// StringBuffer ReverserStr = strbuffer.reverse();
		StringBuffer newString = strbuffer.insert(index + 1, toBeInserted);
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
