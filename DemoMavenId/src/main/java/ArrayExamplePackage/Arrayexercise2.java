package ArrayExamplePackage;

import java.util.Arrays;
import java.util.OptionalInt;

import org.testng.annotations.Test;

public class Arrayexercise2 {
	@Test
	public void array1() {
		int array[] = { 4, 98, 6, 7, 9, 2 };
		// Approach #1

		int ndlargest;
		OptionalInt test = Arrays.stream(array).distinct().sorted().skip(1).findFirst();

		System.out.println("2nd largest : " + test);

		Arrays.sort(array);

		System.out.println("2nd approach: ");

		// Approach #2

		int Secondlargets = array[2];

		System.out.println(Secondlargets + ":  2nd largest");

		// Approach #3:

		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];

			}

		}

		System.out.println(min + ":  min value ");

		int ndlargerts = array[0];
		for (int j = 0; j < array.length; j++) {
			if (array[j] < ndlargerts && min > array[j]) {
				ndlargerts = array[j];

			}

		}
		System.out.println(ndlargerts + ": 2nd laegest min value ");

	}

}
