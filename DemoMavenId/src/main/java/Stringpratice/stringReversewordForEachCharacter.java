package Stringpratice;

public class stringReversewordForEachCharacter {

	public static void main(String[] args) {
		String input = "Java Code Examplesdfg yui";

		String output = "";
		String[] Words = input.split(" ");

		for (String word : Words) {
			String reverseWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + word.charAt(i);
			}
			output = output + reverseWord + " ";

		}

		System.out.println(output);

	}

}
