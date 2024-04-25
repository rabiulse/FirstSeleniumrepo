package Stringpratice;

public class StringExampleSet1 {

	static void stringpratice() {

		String st1 = "Rabiul";// It is stored in the string constant pool
		String st3 = "Rabiul";
		String st2 = new String("Rabiul");// it is stored in the heap memory.
		System.out.println("st1: " + st1);
		System.out.println("st2: " + st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st2);

		if (st1.equalsIgnoreCase(st2))

		{
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	static void stringpratice1() {
		String s1 = "Rabiul";
		s1.concat("hasan");
		System.out.println(s1);

		s1 = s1.concat(s1);

		System.out.println(s1);
	}

	public static void main(String[] args) {
		stringpratice();
		stringpratice1();
	}

}
