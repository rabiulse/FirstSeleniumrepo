package Stringpratice;

public class wrapperClassexample {

	static void autoboxingexample() {
		int a = 20;
		Integer i = Integer.valueOf(a);//
		Integer j = a;// Convert the int promotive to wrapper class// autoboxing,

		int b = i; // Unboxing - here converting wrapper class to primitive class
		System.out.println("Convering Wrapper to Promitive: " + b);

		System.out.println("value of a:" + a + "\nvalue of i:" + i + "\n" + "Value of J:" + j);

	}

	static void unboxingexample() {
		// Converting Integer to int
		Integer a = new Integer(3);
		int i = a.intValue();// converting Integer to int explicitly
		int j = a;// unboxing, now compiler will write a.intValue() internally

		System.out.println(a + " " + i + " " + j);

	}

	static void stringmethodexample() {

		String str = new String("Rabiul Hasan UzZaman");
		String str1 = new String("Rabiul Hasan UzZaman");

		char testvalue = str.charAt(1);
		int testvalue1 = str.codePointAt(3);
		int testvalue2 = str.codePointBefore(4);

		int testvalue3 = str.codePointCount(0, 8);
//		Compare To Method in String 
		int result1 = str.compareTo(str1);
		int result2 = str.compareToIgnoreCase(str1);
		boolean result3 = str.equals(str1);
		boolean result4 = str.equalsIgnoreCase(str1);
		System.out.println("testvalue: " + testvalue);
		System.out.println("testvalue1: " + testvalue1);
		System.out.println("testvalue2: " + testvalue2);
		System.out.println("testvalue3: " + testvalue3);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);

		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);

		// concat operation on String:

		String result5 = str.concat(str1);

		System.out.println("result5 : " + result5);

		// Contain operation:

		boolean result6 = str.contains("Rabiul");

		boolean result7 = str.contentEquals(str1);
		System.out.println("result6 : " + result6);

		System.out.println("result7 : " + result7);

//		Copy Value of Method

		char[] char1 = { 'H', 'l', '8', 'o', 'w' };

		String str2 = "";
		String result8 = String.copyValueOf(char1, 0, 3);
		String result9 = String.copyValueOf(char1);

		System.out.println("result8 : " + result8);

		System.out.println("result9 : " + result9);

	}

	public static void main(String[] args) {
		// autoboxingexample();
		// unboxingexample();

		// System.out.println('a' + 'a');

		stringmethodexample();

	}

}
