package DemoMaven.DemoMavenId;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.testng.annotations.Test;

public class datareadfromfile {
	String path = "C:\\Users\\rabiu\\git\\repository\\DemoMavenId\\src\\test\\resources\\Data.properties";

	@Test(enabled = false)
	void dataReadfromfileusingScanner() throws IOException {

		FileInputStream is = new FileInputStream(path);
		try (Scanner sc = new Scanner(is, StandardCharsets.UTF_8.name())) {
			while (sc.hasNextLine()) {

				System.out.println(sc.nextLine());
			}
		}

	}

	@Test
	void dataReadfromfileusingBufferedReaader() throws IOException {
		String path = "C:\\Users\\rabiu\\git\\repository\\DemoMavenId\\src\\test\\resources\\Data.properties";

		BufferedReader br = new BufferedReader(new FileReader(path));
		// Declaring a new string
		String str;

		// It holds true till there is content in file
		while ((str = br.readLine()) != null) {

			// Printing the file data
			System.out.println(br);
		}

	}

}
