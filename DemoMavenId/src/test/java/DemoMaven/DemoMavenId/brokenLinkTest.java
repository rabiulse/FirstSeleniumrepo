package DemoMaven.DemoMavenId;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenLinkTest {

	@Test
	public void brokenLinkTest1() {

		System.out.println("Create the browser ");

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2021/08/webtable-in-html.html");

		// 1. Collect all links with 'a' tag
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links found: " + links.size());

		for (WebElement element : links) {
			String url = element.getAttribute("href");
			// 2. Filter out null or empty links

			if (url == null || url.isEmpty()) {
				System.out.println("URL is empty or not configured.");
				continue;
			}
			try {
				// 3. Establish connection to the URL
				HttpURLConnection connection = (HttpURLConnection) (new URL(url).openConnection());
				connection.setRequestMethod("HEAD"); // Use HEAD to save bandwidth
				connection.connect();

				// 4. Retrieve and verify the response code
				int responseCode = connection.getResponseCode();
				if (responseCode >= 400) {
					System.err.println("BROKEN LINK: " + url + " | Status Code: " + responseCode);
				} else {
					System.out.println("Valid Link: " + url + " | Status Code: " + responseCode);
				}
				connection.disconnect();
			} catch (IOException e) {
				System.err.println("Error connecting to URL: " + url + " - " + e.getMessage());
			}
		}
		driver.quit();

	}
}
