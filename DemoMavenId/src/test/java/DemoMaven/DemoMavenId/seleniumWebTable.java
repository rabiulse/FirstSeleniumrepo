package DemoMaven.DemoMavenId;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class seleniumWebTable {

	static WebDriver driver;

	@Test
	public static void webTable() {

		setup();
		countrypresentorNot();
		TearDown();
	}

	public static void setup() {
		System.out.println("Create the browser ");
		System.setProperty("webdriver.chrome.drive",
				"C:\\Users\\rabiu\\OneDrive\\Documents\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

	}

	public static void countrypresentorNot()

	{
		String expectedCountry = "Mexico1";
		int rowcount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int columnCount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();

		for (int i = 1; i < rowcount; i++) {
			for (int j = 1; j <= columnCount; j++) {
				String expectedText = driver
						.findElement(By.xpath("//table[@id='customers']//tr[" + (i + 1) + "]//td[" + j + "]"))
						.getText();
				if (expectedText.equalsIgnoreCase(expectedCountry)) {
					Assert.assertEquals(expectedCountry, expectedText);

					System.out.println("Expected value is present in the webtable");
					// return true;

				}

			}

		}
		System.out.println("Expected value is NOT present in the webtable");
		// return false;

	}

	public static void TearDown() {

		driver.quit();
		System.out.println("Closing the driver");

	}

}
