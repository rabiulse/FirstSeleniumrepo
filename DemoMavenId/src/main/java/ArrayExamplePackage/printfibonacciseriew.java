package ArrayExamplePackage;

public class printfibonacciseriew {

	public static void main(String[] args) {
		// printprintfibonacci();
		split();
		stringconverter();
	}

	private static void printprintfibonacci() {
		int a = 0;
		int b = 1;
		int c = 1;
		System.out.println("Priting the fibonaacii series: ");
		for (int i = 0; i <= 10; i++) {
			System.out.println(a + " ");
			a = b;
			b = c;
			c = a + b;

		}
	}

	// Split function practice:

	public static void split() {
		String str = "Scaler by InterviewBit";
		// split string from space
		String[] result = str.split(" ");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i] + " ");
		}
	}

	// Practice of string converter:

	private static void stringconverter() {
		String str1 = "1234";
		int i;
		i = Integer.parseInt(str1);// convertering the string to interger:
		System.out.println(i + ": is value of I");

		String str2;
		str2 = String.valueOf(i);
		System.out.println(str2 + " : String converted from integer to sting:");

	}

}
