package Stringpratice;

import java.util.Scanner;

public class reversewordusingsplit {

	// Approach#1:

	static void reversestringapproach1() {
		String str = "";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string value:");
		str = sc.nextLine();// this is for testing

		String[] splitedstring = str.split("");
		String reverse = "";
		for (int i = splitedstring.length - 1; i >= 0; i--) {

			reverse = reverse + splitedstring[i];

		}

		System.out.println(reverse);

	}

	// Approach#2:

	static void reversestringapproach2() {
		String original, reverse = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string value:");
		original = sc.nextLine();// this is for testing
		int length = original.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}

		System.out.println("Enter your string value:" + reverse);

	}

	public static void main(String[] args) {

		// reversestringapproach1();
		reversestringapproach2();

	}
}
