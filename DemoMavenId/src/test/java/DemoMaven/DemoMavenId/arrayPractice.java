package DemoMaven.DemoMavenId;

import java.util.Arrays;

import org.testng.annotations.Test;

public class arrayPractice {

	@Test(enabled = true)
	private static void find_third_largest_number() {

		int[] array = new int[] { 4, 7, 5, 8, 3, 98, 56, 89 };

		int lenght = array.length;
		int temp;

		System.out.print("original array: \n");
		for (int i = 0; i < lenght; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.print(" \n");

		Arrays.sort(array);

		System.out.print("sorted array: \n");
		for (int i = 0; i < lenght; i++) {
			System.out.print(array[i] + " ");

		}
		System.out.print(" \n");

		int thirdlargest = array[lenght - 3];

		System.out.println("Third largest: " + thirdlargest + " ");

	}

	@Test(enabled = true)
	private static void sort_descending_order() {

		int[] array = new int[] { 4, 7, 5, 8, 3, 98, 56 };

		int lenght = array.length;
		int temp;

		System.out.print("original array: \n");
		for (int i = 0; i < lenght; i++) {
			System.out.print(array[i] + " ");

		}

		System.out.print(" \n");
		// logic for ascending order:
		for (int i = 0; i < lenght; i++) {
			for (int j = i + 1; j < lenght; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;

				}

			}

		}

		System.out.print("First Highest number:" + array[0] + "\n");
		System.out.print("acesending  array: \n");
		for (int i = 0; i < lenght; i++) {
			System.out.print(array[i] + " ");

		}

	}

}
