package Stringpratice;

// String method operations:

public class stringmethodexercise {

	static void stringoperation() {
		String S1 = "RabiulhasanUzzaman";
// calculate the total lenght of String is below" 
		int length = S1.length();
		System.out.println("Total lenght of String is: " + length);

		// Return the character of index:

		char ch = S1.charAt(length - 2);

		System.out.println("last characher of string is : " + ch);

		// Returns the substring from i to j-1 index.

		String newstr1 = S1.substring(4);

		System.out.println("after Substring: " + newstr1);

		String newstr2 = S1.substring(2, 6);

		System.out.println("after Substring: " + newstr2);

	}

	public static void main(String[] args) {
		stringoperation();

	}

}
