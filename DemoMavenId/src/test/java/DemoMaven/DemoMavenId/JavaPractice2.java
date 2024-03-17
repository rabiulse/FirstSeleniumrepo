package DemoMaven.DemoMavenId;

//Java program to Reverse a String by
//converting string to characters one
//by one
import java.lang.*;
import java.io.*;
import java.util.*;

//Class of ReverseString
class JavaPractice2 {
	public static void main(String[] args)
	{
		String input="Rabiul";
		reverseString();
		removewhiteSpace();
	}
	
	// String reverse Coding in java
	private static void reverseString()
	{

		String input = "nehan34";

		// convert String to character array
		// by using toCharArray
		char[] try1 = input.toCharArray();

		for (int i = try1.length - 1; i >= 0; i--)
			System.out.print(try1[i]);
		
	}
	// remove the white space from given String:
	private static void removewhiteSpace (){
		String str = " Java Interview Questions ";
		str = str.replaceAll("\\s", "");
		System.out.println("");
		System.out.println(str);
		}
	
}
