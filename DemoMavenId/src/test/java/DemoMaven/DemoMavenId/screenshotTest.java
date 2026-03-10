package DemoMaven.DemoMavenId;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Base.captureScreenshot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotTest {
	@Test
	public void screenshotTest1() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://google.com");

		captureScreenshot.captureScreenshotM(driver, "GoogleHome");
		driver.close();

	}
}
