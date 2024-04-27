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

	public static void main(String[] args) {
		autoboxingexample();
		unboxingexample();

	}

}
