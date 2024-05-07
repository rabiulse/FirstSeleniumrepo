package Stringpratice;

public class vowelIsPresent {

	public static void vowelIspresent() {
		String str = "sddb";
		boolean result = str.toLowerCase().matches(".*[aeiou].*");

		if (result) {
			System.out.println("vowel is present:");

		}

		else {

			System.out.println("vowel is not present:");
		}

	}

	public static void main(String[] args) {
		vowelIspresent();
	}

}
