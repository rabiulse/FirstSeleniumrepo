package DemoMaven.DemoMavenId;

import java.util.ArrayList;

public class javaExercise {

	// reverse the string :

	public static void reverseString() {

		String str = "NehanHasan";
		String revSting = "";

		char[] charstring = str.toCharArray();
		for (int i = charstring.length - 1; i >= 0; i--) {
			// System.out.print(charstring[i]);
			revSting = revSting + charstring[i];// n-> na->nas

		}

		System.out.println("Original String: " + str);
		System.out.println("reverse String: " + revSting);

	}

	// swap the two string :

	public static void swapTwoString() {
		String str1 = "NehanHasan";
		String str2 = "Uzzaman";

		String str3 = "";

		str3 = str1.concat(str2);
		String str4 = str3.substring(str1.length()) + " " + str3.substring(0, str1.length());
		System.out.println("Original Two String: " + str1 + " " + str2);

		System.out.println("Swap  String: " + str4);

	}

	// Sum of digit of given Integer value:

	public static void sumofintegervalue() {

		int number = 876;
		int sum = 0;

		while (number != 0) {

			int reminder = number % 10;
			sum = sum + reminder;// 6+7+8
			number = number / 10;

		}
		System.out.println(sum);

	}

	// Prime number example:

	public static void checkprimenumber() {
		int number = 13;

		ArrayList<Integer> array = new ArrayList<Integer>();

		for (int i = 2; i < number; i++) {

		}
	}

	public static void main(String[] args) {
		reverseString();
		// swapTwoString();
		// sumofintegervalue();
		// checkprimenumber();

	}

}
