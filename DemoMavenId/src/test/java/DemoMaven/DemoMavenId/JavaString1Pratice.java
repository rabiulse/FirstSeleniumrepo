package DemoMaven.DemoMavenId;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaString1Pratice {

	public static void main(String[] args) throws IOException {
		reverseString();
		removewhiteSpace();
		getdataFromPropertyFile();

		searchCharacter();
		comparetwoString();
		createStringObject();
	}

	// String reverse Coding in java
	private static void reverseString() {

		String input = "nehan34";

		// convert String to character array
		// by using toCharArray
		char[] try1 = input.toCharArray();

		for (int i = try1.length - 1; i >= 0; i--) {
			System.out.print(try1[i]);
		}

		System.out.println();
	}

	// remove the white space from given String:
	private static void removewhiteSpace() {
		String str = " Java Interview    Questions ";
		// str = str.replaceAll("\\s", "");
		str = str.replaceAll("\\s", "");

		System.out.println(str);
	}

// Program to read the data from property file and store that value.
	public static void getdataFromPropertyFile() throws IOException {
		// Create the instance of Properties class from java UTIL package
		Properties prop = new Properties();
		// Create a file instance and
		File file = new File("src\\test\\resources\\data.properties");
		// Create the instance of File Input Stream and pass the file path as parameter
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		prop.getProperty("url");
		System.out.println("get url:" + prop.getProperty("url"));
		String url = prop.getProperty("url");
		System.out.println("get username :" + prop.getProperty("username1"));
		System.out.println("get 2nd username :" + prop.getProperty("username2"));

	}

	// 1. Write a Java program to get the character at the given index within the
	// string.

	public static void searchCharacter() {
		String str = "Zabiul Hasan Uzzaman";
		System.out.println("Given String : " + str);

		// Convert the string to character array:
		char[] chararry = str.toCharArray();
		int i = 0;
		char firstcharacter = chararry[1];
		int val1 = str.codePointAt(0);
		System.out.println("Character(unicode point) = " + val1);
		System.out.println("First character is: " + firstcharacter);
		System.out.println("Get the chareacter of index 4 is :  " + chararry[3]);

		for (i = 0; i <= chararry.length; i++) {

		}

	}

	// Write a program to compare the two String

	public static void comparetwoString() {

		String srt11 = "This is the first String";

		String srt2 = "This is the First String1";

		System.out.println("First String: " + srt11);
		System.out.println("2nd String : " + srt2);

		boolean result = srt11.equalsIgnoreCase(srt2);

		if (result == true) {

			System.out.println("\"" + srt11 + "\" " + " same as : " + "\"" + srt2 + "\"");

		} else {
			System.out.println("\"" + srt11 + "\" " + " NOT  same as : " + "\"" + srt2 + "\"");

		}

	}

	// Write a Java program to create a String object with a character array.
	public static void createStringObject() {
		// create the character array object variable:
		char[] araay_num = new char[] { '1', '2', '3', 'R' };
		String str = String.copyValueOf(araay_num, 0, 3);
		System.out.println(str);

	}
}
