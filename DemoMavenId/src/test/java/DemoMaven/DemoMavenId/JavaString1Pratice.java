package DemoMaven.DemoMavenId;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaString1Pratice {

	public static void main(String[] args) throws IOException {
		String input = "Rabiul";
		reverseString();
		removewhiteSpace();
		getdataFromPropertyFile();
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

	}

	// remove the white space from given String:
	private static void removewhiteSpace() {
		String str = " Java Interview    Questions ";
		str = str.replaceAll("\\s", "");
		System.out.println("");
		System.out.println(str);
	}

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

}
