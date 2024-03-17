package DemoMaven.DemoMavenId;

public class JavaPractice {

	public static void main(String[] args) {
		// Program #1 to find out the largest number

		findoutlargetnumber();
		Reverse();
		totallowerCaseUpperCase();
	}

	// Reverse the given String ::
	private static void Reverse() {

		String Myname = "RAbiul";
		System.out.println("Given String :" + Myname);

		char[] str = Myname.toCharArray();
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i]);
		}

		System.out.println("");

	}

	// Find out the largest number:

	private static void findoutlargetnumber() {
		System.out.println("Hello Java Program: First program Addition of two numner");
		int a = 10;
		int b = 20;
		int sum;
		sum = a + b;
		System.out.println("Sum is : " + sum);
		System.out.println("2nd program for find out the largest number");
		int largest;
		largest = a > b ? a : b;
		System.out.println("lagest number is : " + largest);

	}

	// Program to find out total number of lower case and upper case in a given
	// String
	private static void totallowerCaseUpperCase() {
		System.out
				.println("Program #3: Program to find out total number of lower case and upper case in a given String");

		String S = "    Myname israbiul   ";
		String withoutSpace = S.strip();

		System.out.println("Given String: " + S);
		System.out.println("After Trimming space: " + withoutSpace);
		int upper = 0;
		int lower = 0;

		for (int i = 0; i < withoutSpace.length(); i++) {
			char ch = withoutSpace.charAt(i);
			if (ch >= 65 && ch <= 90) {
				upper++;

			} else {
				lower++;

			}

		}

		System.out.println("lower numner " + lower);
		System.out.println("upper numner " + upper);

	}

}
