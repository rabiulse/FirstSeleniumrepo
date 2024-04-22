package DemoMaven.DemoMavenId;

import java.util.Scanner;

import org.testng.annotations.Test;

public class checkPrimeNumber {
	@Test(enabled = false)
	public void primenumber() {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = s.nextInt();

		int flag = 0;
		int m = 0;
		m = n / 2;

		if (n == 0 || n == 1) {
			System.out.println(n + ": not prime number: ");

		}

		else {
			for (int i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not prime number");
					flag = 1;
					break;
				}

			}
			if (flag == 0) {
				System.out.println(n + " is  prime number");

			}
		}

	}

	@Test
	void printnumberbetweentwonumber() {

		int k = (int) Math.sqrt(5);
		System.out.println(k + " : value of K");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int start = s.nextInt();
		System.out.print("Enter the second number : ");
		int end = s.nextInt();
		System.out.println("List of prime numbers between " + start + " and " + end);

		for (int i = start; i <= end; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
