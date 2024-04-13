package DemoMaven.DemoMavenId;

import org.testng.annotations.Test;

public class switchCaseExmple {
	@Test
	public static void switchcase() {
		int day = 10; // Replace with your desired size (1, 2, 3, 4, or 5)

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Small");
			break;
		case 3:
			System.out.println("Medium");
			break;
		case 4:
			System.out.println("Large");
			break;
		case 10:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid size number");
		}

	}

}
