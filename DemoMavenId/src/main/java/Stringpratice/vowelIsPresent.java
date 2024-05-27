package Stringpratice;

import java.util.Scanner;

public class vowelIsPresent {

	public static void vowelIspresent() {
		// String str = "sddb";

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String :");

		String str = sc.next();

		boolean result = str.toLowerCase().matches(".*[aeiou].*");

		if (result) {
			System.out.println("vowel is present:");

		}

		else {

			System.out.println("vowel is not present:");
		}

	}

// How can we convert the an Integer to a String in java
	public static void Question46() {
		// Approach#1
		int a = 10;

		String str = Integer.toString(a);

		System.out.println(a);
		System.out.println(str);
		// Approach#2
		int b = 20;

		String str1;
		str1 = String.valueOf(b);

		System.out.println("b value:" + b + "\n" + "int converted value : " + str1);

	}

	// How can we convert the char to an integer in java

	/*
	 * Input : ch = ‘3’ Output : 3
	 * 
	 * Input : ch = ‘9’ Output : 9
	 */

	public static void question47() {
		// Approach#1
		char ch = '1';

		int a = Character.getNumericValue(ch);

		System.out.println("Character :" + ch + "\n" + a);

		// Approach#2

		char ch1 = '1';

		int b = Integer.parseInt(String.valueOf(ch1));

		int c = Integer.parseInt("8");

		System.out.println(c);

		System.out.println("Character :" + ch1 + "\n" + b);

		// Approach#3:

	}

	public static void main(String[] args) {
		// vowelIspresent();
		// Question46();
		question47();
	}

}
