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

		FileInputStream fis = new FileInputStream(path);
		try (Scanner sc = new Scanner(fis, StandardCharsets.UTF_8.name())) {
			while (sc.hasNextLine()) {

				System.out.println(sc.nextLine());
			}
		}

	}

	@Test(enabled = true)
	void dataReadfromfileusingBufferedReaader() throws IOException {
		// String path =
		// "C:\\Users\\rabiu\\git\\repository\\DemoMavenId\\src\\test\\resources\\Data.properties";
		FileReader fr = new FileReader(path);
		BufferedReader br = new BufferedReader(fr);
		// BufferedReader br = new BufferedReader(new FileReader(path));
		// Declaring a nebrw string
		String str;

		// It holds true till there is content in file
		while ((str = br.readLine()) != null) {

			System.out.println(str);
		}

	}

}
